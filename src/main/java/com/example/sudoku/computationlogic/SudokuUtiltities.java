package com.example.sudoku.computationlogic;

import com.example.sudoku.problemDomain.SudokuGame;

public class SudokuUtiltities {
    public static void copySudokuArrayValues(int[][] oldArray, int [][] newArray){
        for(int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
            for (int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex ++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];
            }
        }
    }
    public static void copyToNewArray(int[][] oldArray){
        int[][] newArray = new int[SudokuGame.GRID_BOUNDARY][SudokuGame.GRID_BOUNDARY];
        for(int xIndex = 0; xIndex < SudokuGame.GRID_BOUNDARY; xIndex++){
            for(int yIndex = 0; yIndex < SudokuGame.GRID_BOUNDARY; yIndex++){
                newArray[xIndex][yIndex] = oldArray[xIndex][yIndex];

            }
        }
    }
}
