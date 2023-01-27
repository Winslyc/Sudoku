package com.example.sudoku.persistence;

import com.example.sudoku.SudokuApplication;
import com.example.sudoku.problemDomain.IStorage;
import com.example.sudoku.problemDomain.SudokuGame;

import java.io.*;

public class LocalStorageImpl implements IStorage {
    File directory = new File(System.getProperty("user.home") + "/Sudoku");


    private static File GAME_DATA;
    //Creates Game Directory and initializes gameData for the game.
    public void createGameDirectory(){
        if(!directory.exists()){
            directory.mkdir();
        }
       GAME_DATA = new File(
                System.getProperty("user.home")  + "/Sudoku",
                "gamedata.txt");
    }
    @Override
    public void updateGameData(SudokuGame game) throws IOException {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(GAME_DATA);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(game);
            objectOutputStream.close();
        } catch ( IOException e){
            throw new IOException("Unable to access Game Data");
        }
    }

    @Override
    public SudokuGame getGameData() throws IOException {


        FileInputStream fileInputStream = new FileInputStream(GAME_DATA);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try{
            SudokuGame gameState=(SudokuGame) objectInputStream.readObject();
            return gameState;

        } catch (ClassNotFoundException e) {
          throw new IOException("File not Found");
        }
    }
}
