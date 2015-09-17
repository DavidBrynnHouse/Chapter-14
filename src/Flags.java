import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by David on 9/17/2015.
 * IS 413
 * This program displays in a window the flags
 * of the united states, united kingdom, china
 * and canada
 */
public class Flags extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BASELINE_LEFT);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        Image us = new Image("sample/us.gif");
        Image uk = new Image("sample/uk.gif");
        Image ca = new Image("sample/ca.gif");
        Image china = new Image("sample/china.gif");

        ImageView viewUs = new ImageView(us);
        ImageView viewUk = new ImageView(uk);
        ImageView viewCa = new ImageView(ca);
        ImageView viewChina = new ImageView(china);

        gridPane.add(viewCa, 0, 0);
        gridPane.add(viewUs, 0, 1);
        gridPane.add(viewUk, 1, 1);
        gridPane.add(viewChina, 1, 0);


        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
