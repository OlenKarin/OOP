import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/*
 * Created by merka on 21.04.2015.
*/

public class OpetusTest extends Application {


    class SlideShow1 {


        public SlideShow1(){

            DoublyLinkedList<ImageView> opik = new DoublyLinkedList<>();
            Image image1 = new Image("/sissejuhatus/page0001.jpg");
            Image image2 = new Image("/sissejuhatus/page0002.jpg");
            Image image3 = new Image("/foneetiline/page0001.jpg");
            Image image4 = new Image("/foneetiline/page0002.jpg");
            Image image5 = new Image("/numbrite teisendamine/page0001.jpg");
            Image image6 = new Image("/numbrite teisendamine/page0002.jpg");
            Image image7 = new Image("/numbrite teisendamine/page0003.jpg");

            ImageView slide1 = new ImageView(image1);
            ImageView slide2 = new ImageView(image2);
            ImageView slide3 = new ImageView(image3);
            ImageView slide4 = new ImageView(image4);
            ImageView slide5 = new ImageView(image5);
            ImageView slide6 = new ImageView(image6);
            ImageView slide7 = new ImageView(image7);

            opik.addLast(slide1);
            opik.addLast(slide2);
            opik.addLast(slide3);
            opik.addLast(slide4);
            opik.addLast(slide5);
            opik.addLast(slide6);
            opik.addLast(slide7);



        }

    }

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final SlideShow1 book = new SlideShow1();

        StackPane root = new StackPane();

        for (int i = 0; i < book.size();i++){
            root.getChildren().add(opik.element());

        }


        final Scene scene1 = new Scene(root);
        primaryStage.setScene(scene1);


        primaryStage.setScene(root);
        primaryStage.setHeight(700);
        primaryStage.setWidth(900);

        HBox tile1 = new HBox();

        tile1.setAlignment(Pos.BOTTOM_CENTER);

        tile1.setSpacing(400);

        tile1.setAlignment(Pos.BOTTOM_CENTER);
        Button back = new Button(); //nupp edasi minemiseks
        back.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back.setText(" Tagasi ");
        back.setAlignment(Pos.BOTTOM_LEFT);
        tile1.getChildren().add(back);

        back.setOnMousePressed(new EventHandler<MouseEvent>() { //Hetkel ei oska teha veel nii, et nupule vajutades navigeerimine ka t??taks
            public void handle(MouseEvent me) {

                book.backward();//Alustab algusest uuesti

            }
        });

        Button next = new Button(); //nupp tagasi minemiseks
        next.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next.setText(" J?rgmine ");
        next.setAlignment(Pos.BOTTOM_RIGHT);
        tile1.getChildren().add(next);
        next.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                book.forward();

            }
        });



        root.getChildren().add(tile1);

        primaryStage.show();



    }



    public FadeTransition getFadeTransition(OpetusTest image, double in, double out) {

        FadeTransition ft = new FadeTransition(Duration.millis(2000), image);
        ft.setFromValue(in);
        ft.setToValue(out);

        return ft; //Tagastab animatsiooni, mida rakendada ?he pildi peal

    }





}
