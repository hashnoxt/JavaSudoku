package SUDOKU;

import SUDOKU.buildlogic.SudokuBuildLogic;
import SUDOKU.userinterface.UserInterfaceImpl;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;


public class SudokuApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Get SudokuGame object for a new game
        UserInterfaceImpl uiImpl = new UserInterfaceImpl(primaryStage);

        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
