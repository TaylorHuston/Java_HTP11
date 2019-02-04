package Chap4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DrawLines extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        //Load the .fxml
        Parent root = FXMLLoader.load(getClass().getResource("DrawLines.fxml"));

        Scene scene = new Scene(root); //Attach scene graph to scene
        stage.setTitle("Draw Lines"); //Window title bar
        stage.setScene(scene); //Sttach scene to stage
        stage.show();
    }

    //Application execution starts here
    public static void main(String[] args) {
        launch(args);
    }
}
