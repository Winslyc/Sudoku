package com.example.sudoku.problemDomain;

import java.io.IOException;

public interface IStorage {
    // Used to create game folder and initialize Game data for Sudoku in a Sudoku Folder in the Main directory.
    void createGameDirectory() throws IOException;
    void updateGameData(SudokuGame game) throws IOException;
    SudokuGame getGameData() throws IOException;
    }

