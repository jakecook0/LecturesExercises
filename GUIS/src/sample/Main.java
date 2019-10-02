package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {

//    String url = "http://placekitten.com/400/500"

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane fp = new FlowPane();
        Circle circle = new Circle();
        Button bt = new Button("Generate Dimensional info");
        Label lb = new Label("Width, height is: ");
        fp.getChildren().add(lb);
        fp.getChildren().add(circle);
        fp.getChildren().add(bt);

        bt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lb.setText("Width, height is: " + fp.getWidth() + ", " + fp.getHeight());
            }
        });

//        fp.widthProperty().addListener(ov -> {
//            fp.setMinHeight(fp.getWidth());
//        });
//
//        fp.heightProperty().addListener(ov -> {
//            fp.setMinWidth(fp.getHeight());
//        });

        fp.widthProperty().addListener(ov -> {
            circle.setRadius(fp.getWidth()/2);
        });

//        Label label = new Label("Generate an image");
//        Button bt = new Button("Click This");
//        ImageView coolPic = new ImageView(url);
//        bt.setOnAction(e -> {
//            // when button is pressed, do action logic here...
//        });
//
//        fp.getChildren().add(coolPic);
//        fp.getChildren().add(label);
//        fp.getChildren().add(bt);

        primaryStage.setTitle("In Class Image Generator On Button Press");
        primaryStage.setScene(new Scene(fp, 500, 5002));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
