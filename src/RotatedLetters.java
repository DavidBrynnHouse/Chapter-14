import com.sun.org.apache.xml.internal.security.c14n.implementations.CanonicalizerBase;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by David House on 9/19/2015.
 * IS 413
 * Displays a message in a circle
 */
public class RotatedLetters extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        String s = "IS 413 Rocks!";
        double radius = 1500;

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BASELINE_LEFT);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        for(int i = 0; i < s.length(); i++){
            double alpha = 2 * Math.PI * (s.length() - i) / s.length();
            Text txt = new Text(radius * Math.cos(alpha) + 120, 120 -
                    radius * Math.sin(alpha), s.charAt(i) + "");
            txt.setFont(Font.font(120));
            txt.setRotate(360 * i / s.length() + 90);
            gridPane.getChildren().add(txt);
        }

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
