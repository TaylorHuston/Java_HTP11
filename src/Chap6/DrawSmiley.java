package Chap6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawSmiley extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Load the .fxml
        Parent root = FXMLLoader.load(getClass().getResource("DrawSmiley.fxml"));

        Scene scene = new Scene(root); //Attach scene graph to scene
        stage.setTitle("Draw Smiley"); //Window title bar
        stage.setScene(scene); //Attach scene to stage
        stage.show();
    }

    //Application execution starts here
    public static void main(String[] args) {
        launch(args);
    }
}
