import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        Pane fp = new Pane();
        Rectangle rect = new Rectangle(100,100,200,200);

        rect.setFill(null);
        rect.setStroke(Paint.valueOf("Black"));

        Rectangle bases1 = new Rectangle(100,100,10,10);
        Rectangle bases2 = new Rectangle(290, 100,10,10);
        Rectangle bases3 = new Rectangle(100,290,10,10);
        Rectangle bases4 = new Rectangle(290,290,10,10);

        Image gif = new Image("http://mlb.mlb.com/images/0/2/4/294450024/091218_min_astudillo_runs_med.gif");
        ImageView run = new ImageView(gif);
        run.setScaleX(.3);
        run.setScaleY(.3);


        fp.getChildren().addAll(rect,bases1,bases2,bases3,bases4);
        fp.setRotate(45);
        run.setRotate(-45);
        fp.getChildren().add(run);


        PathTransition runner = new PathTransition();
        runner.setDuration(Duration.millis(10000));
        runner.setPath(rect);
        runner.setNode(run);
        runner.setCycleCount(4);
        runner.setAutoReverse(false);
        runner.play();



        Scene sc = new Scene(fp,500,500);
        primaryStage.setTitle("Baseball Player");
        primaryStage.setScene(sc);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}