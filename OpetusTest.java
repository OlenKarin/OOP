import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
 * Created by merka on 21.04.2015.
*/

public class OpetusTest{

    public static Scene opetuse_stseen(final Stage primaryStage, final Scene stseen1) throws Exception {

        HBox tile1 = new HBox();
        HBox tile2 = new HBox();
        HBox tile3 = new HBox();
        HBox tile4 = new HBox();
        HBox tile5 = new HBox();
        HBox tile6 = new HBox();
        HBox tile7 = new HBox();

        Image image1 = new Image("/sissejuhatus/page0001.jpg");
        Image image2 = new Image("/sissejuhatus/page0002.jpg");
        Image image3 = new Image("/foneetiline/page0001.jpg");
        Image image4 = new Image("/foneetiline/page0002.jpg");
        Image image5 = new Image("/numbrite teisendamine/page0001.jpg");
        Image image6 = new Image("/numbrite teisendamine/page0002.jpg");
        Image image7 = new Image("/numbrite teisendamine/page0003.jpg");

        ImageView im1 = new ImageView(image1);
        ImageView im2 = new ImageView(image2);
        ImageView im3 = new ImageView(image3);
        ImageView im4 = new ImageView(image4);
        ImageView im5 = new ImageView(image5);
        ImageView im6 = new ImageView(image6);
        ImageView im7 = new ImageView(image7);

        Group root1 = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Group root4 = new Group();
        Group root5 = new Group();
        Group root6 = new Group();
        Group root7 = new Group();

        final Scene scene1 = new Scene(root1);
        final Scene scene2 = new Scene(root2);
        final Scene scene3 = new Scene(root3);
        final Scene scene4 = new Scene(root4);
        final Scene scene5 = new Scene(root5);
        final Scene scene6 = new Scene(root6);
        final Scene scene7 = new Scene(root7);


        tile1.setSpacing(780);
        tile1.setAlignment(Pos.BOTTOM_CENTER);

        Button back1 = new Button(); //nupp edasi minemiseks
        back1.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back1.setText(" <- ");
        back1.setAlignment(Pos.BOTTOM_LEFT);
        back1.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene7);
            }


        });

        Button next1 = new Button(); //nupp tagasi minemiseks
        next1.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next1.setText(" -> ");
        next1.setAlignment(Pos.BOTTOM_RIGHT);
        next1.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene2);
            }


        });

        tile1.getChildren().add(back1);
        tile1.getChildren().add(next1);

        root1.getChildren().addAll(im1,tile1);



        tile2.setSpacing(780);
        tile2.setAlignment(Pos.BOTTOM_CENTER);

        Button menu = new Button("Menüü"); //nupp menüüsse minemiseks------------------------------------------------
        menu.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");


        Button back2 = new Button(); //nupp edasi minemiseks
        back2.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back2.setText(" <- ");
        back2.setAlignment(Pos.BOTTOM_LEFT);
        back2.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
            }


        });

        Button next2 = new Button(); //nupp tagasi minemiseks
        next2.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next2.setText(" -> ");
        next2.setAlignment(Pos.BOTTOM_RIGHT);
        next2.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene3);
            }


        });

        tile2.getChildren().add(back2);
        tile2.getChildren().add(next2);
        root2.getChildren().addAll(im2, tile2);


        tile3.setSpacing(780);
        tile3.setAlignment(Pos.BOTTOM_CENTER);

        Button back3 = new Button(); //nupp edasi minemiseks
        back3.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back3.setText(" <- ");
        back3.setAlignment(Pos.BOTTOM_LEFT);
        back3.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene2);
            }


        });

        Button next3 = new Button(); //nupp tagasi minemiseks
        next3.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next3.setText(" -> ");
        next3.setAlignment(Pos.BOTTOM_RIGHT);
        next3.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene4);
            }


        });

        tile3.getChildren().add(back3);
        tile3.getChildren().add(next3);
        root3.getChildren().addAll(im3, tile3);



        tile4.setSpacing(780);
        tile4.setAlignment(Pos.BOTTOM_CENTER);

        Button back4 = new Button(); //nupp edasi minemiseks
        back4.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back4.setText(" <- ");
        back4.setAlignment(Pos.BOTTOM_LEFT);
        back4.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene3);
            }


        });

        Button next4 = new Button(); //nupp tagasi minemiseks
        next4.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next4.setText(" -> ");
        next4.setAlignment(Pos.BOTTOM_RIGHT);
        next4.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene5);
            }


        });

        tile4.getChildren().add(back4);
        tile4.getChildren().add(next4);
        root4.getChildren().addAll(im4, tile4);



        tile5.setSpacing(780);
        tile5.setAlignment(Pos.BOTTOM_CENTER);

        Button back5 = new Button(); //nupp edasi minemiseks
        back5.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back5.setText(" <- ");
        back5.setAlignment(Pos.BOTTOM_LEFT);
        back5.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene4);
            }


        });

        Button next5 = new Button(); //nupp tagasi minemiseks
        next5.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next5.setText(" -> ");
        next5.setAlignment(Pos.BOTTOM_RIGHT);
        next5.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene6);
            }


        });

        tile5.getChildren().add(back5);
        tile5.getChildren().add(next5);
        root5.getChildren().addAll(im5, tile5);



        tile6.setSpacing(780);
        tile6.setAlignment(Pos.BOTTOM_CENTER);

        Button back6 = new Button(); //nupp edasi minemiseks
        back6.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back6.setText(" <- ");
        back6.setAlignment(Pos.BOTTOM_LEFT);
        back6.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene5);
            }


        });

        Button next6 = new Button(); //nupp tagasi minemiseks
        next6.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next6.setText(" -> ");
        next6.setAlignment(Pos.BOTTOM_RIGHT);
        next6.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene7);
            }


        });

        tile6.getChildren().add(back6);
        tile6.getChildren().add(next6);
        root6.getChildren().addAll(im6, tile6);



        tile7.setSpacing(780);
        tile7.setAlignment(Pos.BOTTOM_CENTER);

        Button back7 = new Button(); //nupp edasi minemiseks
        back7.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        back7.setText(" <- ");
        back7.setAlignment(Pos.BOTTOM_LEFT);
        back7.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene6);
            }


        });

        Button next7 = new Button(); //nupp tagasi minemiseks
        next7.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        next7.setText(" -> ");
        next7.setAlignment(Pos.BOTTOM_RIGHT);
        next7.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
            }


        });

        tile7.getChildren().add(back7);
        tile7.getChildren().add(next7);
        root7.getChildren().addAll(im7, tile7, menu);


        //menüü nupule vajutades minnakse menüüsse tagasi
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                primaryStage.setWidth(500);
                primaryStage.setHeight(500);
                primaryStage.setScene(stseen1);
            }
            });


            primaryStage.setScene(scene1);
            primaryStage.setHeight(700);
            primaryStage.setWidth(993);
        primaryStage.show();

        return scene1;


    }
}
