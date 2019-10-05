package Pallindrome;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PallindromeText {
    public void start(Stage primaryStage) {
        FlowPane fp = new FlowPane();
        TextField tf = new TextField("-");

        tf.setOnKeyPressed(e -> {
            tf.setText(tf.getText() + e.getText());
        });

        fp.getChildren().add(tf);

        primaryStage.setTitle("Pallindrome/text entry through keyboard listeners");
        primaryStage.setScene(new Scene(fp, 250,250));
        primaryStage.show();

    }
}