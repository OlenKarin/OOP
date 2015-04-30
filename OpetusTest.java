import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.input.KeyEvent;

import javafx.util.Duration;

import java.awt.*;
import java.util.ArrayList;


/*
 * Created by merka on 21.04.2015.
*/

public class OpetusTest{

    public static Scene opetuse_stseen(final Stage primaryStage, final Scene stseen1) throws Exception {


        StackPane pane1 = new StackPane();
        StackPane pane2 = new StackPane();
        StackPane pane3 = new StackPane();
        StackPane pane4 = new StackPane();
        StackPane pane5 = new StackPane();
        StackPane pane6 = new StackPane();
        StackPane pane7 = new StackPane();

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

        //im1.setFitHeight(primaryStage.getHeight());
        //im1.setFitWidth(primaryStage.getWidth());

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

        tile1.setAlignment(Pos.BOTTOM_CENTER);
        tile1.getChildren().addAll(back1, next1);
        tile1.setSpacing(700);

        //pane1.setPrefWidth(primaryStage.getWidth());
        //pane1.setPrefHeight(primaryStage.getHeight());


        pane1.getChildren().addAll(im1,tile1);


        root1.getChildren().add(pane1);




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

        tile2.setSpacing(700);
        tile2.setAlignment(Pos.BOTTOM_CENTER);
        tile2.getChildren().addAll(back2, next2);

        pane2.getChildren().addAll(im2, tile2);

        root2.getChildren().add(pane2);




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

        tile3.setSpacing(700);
        tile3.setAlignment(Pos.BOTTOM_CENTER);
        tile3.getChildren().addAll(back3, next3);

        pane3.getChildren().addAll(im3, tile3);

        root3.getChildren().add(pane3);





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

        tile4.setSpacing(700);
        tile4.setAlignment(Pos.BOTTOM_CENTER);
        tile4.getChildren().addAll(back4, next4);

        pane4.getChildren().addAll(im4, tile4);

        root4.getChildren().add(pane4);



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

        tile5.setSpacing(700);
        tile5.setAlignment(Pos.BOTTOM_CENTER);
        tile5.getChildren().addAll(back5, next5);

        pane5.getChildren().addAll(im5, tile5);

        root5.getChildren().add(pane5);






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

        tile6.setSpacing(700);
        tile6.setAlignment(Pos.BOTTOM_CENTER);
        tile6.getChildren().addAll(back6, next6);

        pane6.getChildren().addAll(im6, tile6);

        root6.getChildren().add(pane6);





        Button menu = new Button("Menüü"); //nupp menüüsse minemiseks------------------------------------------------
        menu.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        menu.setAlignment(Pos.BOTTOM_CENTER);
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                primaryStage.setWidth(500);
                primaryStage.setHeight(500);
                primaryStage.setScene(stseen1);
            }
        });


        tile7.getChildren().add(menu);
        tile7.setAlignment(Pos.BOTTOM_CENTER);

        pane7.getChildren().addAll(im7, tile7);

        root7.getChildren().add(pane7);



            primaryStage.setScene(scene1);
            primaryStage.setHeight(750);
            primaryStage.setWidth(1009);

        primaryStage.show();

        return scene1;


    }
}
