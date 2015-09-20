import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
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
        String s = "Welcome To Java!";
        double radius = 250;

        //Not sure why but this is the only type of pane which
        //works in making it a circle as opposed to stacking the letters
        //or putting them in a line
        BorderPane pane = new BorderPane();
        pane.setPadding(new Insets(10, 10, 10, 10));

        //sets the center of teh circle to the center of the pane
        pane.setTranslateY((radius * 4) / 3);
        pane.setTranslateX((radius * 4) / 3);

        //Code From Prof Redding
        for(int i = 0; i < s.length(); i++){
            double alpha = 2 * Math.PI * (s.length() - i) / s.length();
            Text txt = new Text(radius * Math.cos(alpha) + 120,
                    120 - radius * Math.sin(alpha),
                    s.charAt(i) + " ");
            txt.setFont(Font.font(120));
            txt.setRotate(360 * i / s.length() + 90);
            pane.getChildren().add(txt);
        }

        Scene scene = new Scene(pane, radius * 4, radius * 4);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
