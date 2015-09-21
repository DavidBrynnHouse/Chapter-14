import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Circle circle1 = new Circle(100);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(Color.WHITE);
        circle1.setCenterX(100);
        circle1.setCenterY(100);

        Arc arc11 = new Arc(100, 100, 80, 80, 30, 35);
        arc11.setFill(Color.RED);
        arc11.setType(ArcType.ROUND);


        Arc arc12 = new Arc(100, 100, 80, 80, 30 + 90, 35);
        arc12.setFill(Color.RED);
        arc12.setType(ArcType.ROUND);

        Arc arc13 = new Arc(100, 100, 80, 80, 30 + 180, 35);
        arc13.setFill(Color.RED);
        arc13.setType(ArcType.ROUND);

        Arc arc14 = new Arc(100, 100, 80, 80, 30 + 270, 35);
        arc14.setFill(Color.RED);
        arc14.setType(ArcType.ROUND);

        Circle circle2 = new Circle(100);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(Color.WHITE);
        circle2.setCenterX(325);
        circle2.setCenterY(100);

        Arc arc21 = new Arc(100, 100, 80, 80, 30, 35);
        arc21.setFill(Color.RED);
        arc21.setType(ArcType.ROUND);

        Arc arc22 = new Arc(100, 100, 80, 80, 30, 35);
        arc22.setFill(Color.RED);
        arc22.setType(ArcType.ROUND);

        Arc arc23 = new Arc(100, 100, 80, 80, 30, 35);
        arc23.setFill(Color.RED);
        arc23.setType(ArcType.ROUND);

        Arc arc24 = new Arc();
        arc24.setFill(Color.RED);
        arc24.setType(ArcType.ROUND);

        Circle circle3 = new Circle(100);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(Color.WHITE);
        circle3.setCenterX(100);
        circle3.setCenterY(325);

        Arc arc31 = new Arc();
        arc31.setFill(Color.RED);
        arc31.setType(ArcType.ROUND);

        Arc arc32 = new Arc();
        arc32.setFill(Color.RED);
        arc32.setType(ArcType.ROUND);

        Arc arc33 = new Arc();
        arc33.setFill(Color.RED);
        arc33.setType(ArcType.ROUND);

        Arc arc34 = new Arc();
        arc34.setFill(Color.RED);
        arc34.setType(ArcType.ROUND);

        Circle circle4 = new Circle(100);
        circle4.setStroke(Color.BLACK);
        circle4.setFill(Color.WHITE);
        circle4.setCenterX(325);
        circle4.setCenterY(325);

        Arc arc41 = new Arc();
        arc41.setFill(Color.RED);
        arc41.setType(ArcType.ROUND);

        Arc arc42 = new Arc();
        arc42.setFill(Color.RED);
        arc42.setType(ArcType.ROUND);

        Arc arc43 = new Arc();
        arc43.setFill(Color.RED);
        arc43.setType(ArcType.ROUND);

        Arc arc44 = new Arc();
        arc44.setFill(Color.RED);
        arc44.setType(ArcType.ROUND);

        pane.getChildren().addAll(circle1, circle2, circle3,
                circle4, arc11, arc12, arc13, arc14, arc21,
                arc22, arc23, arc24, arc31, arc32, arc33,
                arc34, arc41, arc42, arc43, arc44);
        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

