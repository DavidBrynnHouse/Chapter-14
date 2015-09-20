import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Created by David on 9/19/2015.
 * IS 413
 * A rather surprised looking face
 */
public class Face extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle outline = new Circle(200);
        outline.setCenterX(200);
        outline.setCenterY(200);
        outline.setStroke(Color.BLACK);
        outline.setFill(Color.WHITE);

        Circle eye1 = new Circle(50);
        eye1.setCenterX(275);
        eye1.setCenterY(100);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.WHITE);

        Circle eye2 = new Circle(50);
        eye2.setCenterX(125);
        eye2.setCenterY(100);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.WHITE);

        Circle eye1center = new Circle(25);
        eye1center.setCenterX(275);
        eye1center.setCenterY(100);
        eye1center.setFill(Color.STEELBLUE);

        Circle eye2center = new Circle(25);
        eye2center.setCenterX(125);
        eye2center.setCenterY(100);
        eye2center.setFill(Color.STEELBLUE);

        Line line1 = new Line();
        line1.setStartX(200);
        line1.setStartY(150);
        line1.setEndX(150);
        line1.setEndY(200);

        Line line2 = new Line();
        line2.setStartX(200);
        line2.setStartY(150);
        line2.setEndX(250);
        line2.setEndY(200);

        Line line3 = new Line();
        line3.setStartX(250);
        line3.setStartY(200);
        line3.setEndX(150);
        line3.setEndY(200);

        Ellipse mouth = new Ellipse();
        mouth.setCenterX(200);
        mouth.setCenterY(275);
        mouth.setRadiusX(100);
        mouth.setRadiusY(50);
        mouth.setFill(Color.LIGHTPINK);

        pane.getChildren().addAll(outline, eye1, eye2,
                eye1center, eye2center, line1, line2, line3,
                mouth);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
