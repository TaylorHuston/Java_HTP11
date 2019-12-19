package Chap6;
//Draw a smiley face
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class DrawSmileyController {
    @FXML private Canvas canvas;

    @FXML
    void drawSmileyButtonPressed(ActionEvent Event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //Draw face
        gc.setFill(Color.YELLOW);
        gc.fillOval(10,10,280,280);
        gc.strokeOval(10,10,280,280);

        //Draw eyes
        gc.setFill(Color.BLACK);
        gc.fillOval(75, 85, 40, 40);
        gc.fillOval(185, 85, 40, 40);

        //Draw mouth
        gc.fillOval(50, 130, 200, 120);

        //Smile
        gc.setFill(Color.YELLOW);
        gc.fillRect(50, 130, 200, 60);
        gc.fillOval(50, 140, 200, 90);
    }

}
