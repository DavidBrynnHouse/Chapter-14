import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by David House on 9/19/2015.
 * IS 413
 * This program creates 4 fans and places them into a
 * Grid pane.
 */
public class FourFans extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.BASELINE_LEFT);
        pane.setPadding(new Insets(5, 5, 5, 5));
        pane.setHgap(5);
        pane.setVgap(5);

        Circle circle1 = new Circle(100);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);
        Arc arc1 = new Arc();
        arc1.setFill(Color.RED);
        arc1.setType(ArcType.ROUND);
        arc1.setRadiusX(100);
        arc1.setRadiusY(100);

        Circle circle2 = new Circle(100);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);

        Circle circle3 = new Circle(100);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.WHITE);

        Circle circle4 = new Circle(100);
        circle4.setStroke(Color.BLACK);
        circle4.setFill(Color.WHITE);

        pane.add(circle1, 0, 1);
        pane.add(arc1, 0, 1);
        pane.add(circle2, 0, 0);
        pane.add(circle3, 1, 1);
        pane.add(circle4, 1, 0);
        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class Fan{
        Fan(){}
}
