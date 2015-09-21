import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
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

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        Fan fan3 = new Fan();
        Fan fan4 = new Fan();


        pane.add(fan1, 0, 1);
        pane.add(fan2, 0, 0);
        pane.add(fan3, 1, 1);
        pane.add(fan4, 1, 0);

        Scene scene = new Scene(pane, 450, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class Fan extends Node {

    Fan () {
        Circle circle = new Circle(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Arc arc = new Arc(150, 100, 80, 80, 30, 35);
        arc.setFill(Color.RED);
        arc.setType(ArcType.ROUND);

    }

    @Override
    protected NGNode impl_createPeer() {
        return null;
    }

    @Override
    public BaseBounds impl_computeGeomBounds(BaseBounds bounds, BaseTransform tx) {
        return null;
    }

    @Override
    protected boolean impl_computeContains(double localX, double localY) {
        return false;
    }

    @Override
    public Object impl_processMXNode(MXNodeAlgorithm alg, MXNodeAlgorithmContext ctx) {
        return null;
    }
}
