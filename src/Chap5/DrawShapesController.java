package Chap5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawShapesController {

    @FXML
    private Canvas canvas;

    @FXML
    void drawRectanglesButtonPressed(ActionEvent event) {
        draw("rectangles");
    }

    @FXML
    void drawOvalsButtonPressed(ActionEvent event) {
        draw("ovals");
    }

    public void draw(String choice) {
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        int step = 10;

        //Draw 10 overlapping shapes
        for (int i = 0; i < 10; i++) {
            switch (choice) {
                case "rectangles":
                    gc.strokeRect(10+i*step, 10+i*step,
                            90+i*step, 90+i*step);
                    break;
                case "ovals":
                    gc.strokeOval(10+i*step, 10+i*step,
                            90+i*step, 90+i*step);
                    break;
            }
        }
    }

}
