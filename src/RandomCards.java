import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by David on 9/17/2015.
 * IS 413
 * This Program Displays cards Randomly
 * in a window
 */
public class RandomCards extends Application{

    @Override
    public void start(Stage primaryStage) {
        Integer[] list = new Integer[52];
        for(int i = 0; i < 52; i++)
            list[i] = i + 1;

        ArrayList<Integer> deck = new ArrayList<>(Arrays.asList(list));
        Collections.shuffle(deck);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BASELINE_LEFT);
        gridPane.setPadding(new Insets(5, 5, 5, 5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        String first = "card/" + deck.get(1) + ".png";
        String second = "card/" + deck.get(2) + ".png";
        String third = "card/" + deck.get(3) + ".png";
        String fourth = "card/" + deck.get(4) + ".png";
        String fifth = "card/" + deck.get(5) + ".png";

        Image card1 = new Image(first);
        Image card2 = new Image(second);
        Image card3 = new Image(third);
        Image card4 = new Image(fourth);
        Image card5 = new Image(fifth);

        ImageView viewCard1 = new ImageView(card1);
        ImageView viewCard2 = new ImageView(card2);
        ImageView viewCard3 = new ImageView(card3);
        ImageView viewCard4 = new ImageView(card4);
        ImageView viewCard5 = new ImageView(card5);

        gridPane.add(viewCard1, 0, 0);
        gridPane.add(viewCard2, 1, 0);
        gridPane.add(viewCard3, 2, 0);
        gridPane.add(viewCard4, 3, 0);
        gridPane.add(viewCard5, 4, 0);

        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
