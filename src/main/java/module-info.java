module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sudoku to javafx.fxml;
    exports com.example.sudoku;
    exports com.example.sudoku.problemDomain;
    opens com.example.sudoku.problemDomain to javafx.fxml;
}