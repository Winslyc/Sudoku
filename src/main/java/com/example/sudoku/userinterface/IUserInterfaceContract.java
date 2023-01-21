package com.example.sudoku.userinterface;

import com.example.sudoku.problemDomain.SudokuGame;

public interface IUserInterfaceContract {
    interface EventListner {
        void onSudokuInput(int x, int y, int input);
        void onDialogClick();
    }
    interface View{
        void setListener(IUserInterfaceContract.EventListner listener);
        void updateSquare(int x, int y, int input);
        void updateBoard(SudokuGame game);
        void showDialog(String Message);
        void showError(String Message);
    }
}
