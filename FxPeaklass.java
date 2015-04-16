import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class FxPeaklass extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {

        StackPane pane = new StackPane();
        final Scene stseen1 = new Scene(pane);
        ///______________________________stseen1.setFill(Color.SKYBLUE);____________MIKS EI TÖÖTA????
        TilePane tile = new TilePane();
        Image pilt = new Image("file:motleja.png");
        ImageView PILT = new ImageView(pilt);
        PILT.setFitHeight(stseen1.getHeight());
        PILT.setFitHeight(stseen1.getWidth());
        pane.getChildren().addAll(PILT, tile);

        //Küsin kas soovitakse tutvuda õpetusega
        /*System.out.println("Tere! Olete sisenenud ühe äärmiselt kasuliku mälutehnika" +
                " õppimise ja harjutamise keskkonda! :) ");*/


        primaryStage.setScene(stseen1);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();


        Button opetus = new Button();
        opetus.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        opetus.setText("  Õpetus  ");
        opetus.setTranslateX(100);
        opetus.setTranslateY(200);
        tile.getChildren().addAll(opetus);

        Button harjutama = new Button();
        harjutama.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        harjutama.setText("Harjutama");
        harjutama.setTranslateX(200);
        harjutama.setTranslateY(200);
        tile.getChildren().addAll(harjutama);
        harjutama.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen3 = new Scene(harjutama(stseen1, primaryStage));

                primaryStage.setScene(stseen3);
            }
        });



        opetus.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                FlowPane group = new FlowPane();
                Text a = new Text("õpetuse tekst / pilt / asi");
                Button menu = new Button("Menüü");
                menu.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
                //menu.setTranslateX(280);
                //menu.setTranslateY(20);
                //menu.setAlignment(Pos.BOTTOM_RIGHT);
                group.getChildren().addAll(a, menu);

                Scene stseen2 = new Scene(group);
                primaryStage.setScene(stseen2);

                menu.setOnMousePressed(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        primaryStage.setScene(stseen1);
                    }
                });
            }
        });

            /*if(vastus.equals("jah")){
                //õpetuse saamise asi
                Opetus.instructions("src/opetus_sissejuhatus.txt");
                System.out.print("Edasi minemiseks vajuta ENTER");
                String enter1 = scan.nextLine();
                Opetus.instructions("C:/Users/Karin/IdeaProjects/MY Projects/src/foneetiline_tahestik.txt");
                System.out.print("Edasi minemiseks vajuta ENTER");
                String enter2 = scan.nextLine();
                Opetus.instructions("C:/Users/Karin/IdeaProjects/MY Projects/src/numbrite_teisendamine.txt");
            }else {
                System.out.println("Hästi! Järgmisena liigume harjutamise juurde. ");
            }
            */



    }

    public static StackPane harjutama(final Scene stseen1, final Stage primaryStage) {

        StackPane pane = new StackPane();
        TilePane tile = new TilePane();
        Image pilt = new Image("file:lehed.png");
        ImageView PILT = new ImageView(pilt);
        PILT.setFitHeight(stseen1.getHeight());
        PILT.setFitHeight(stseen1.getWidth());
        pane.getChildren().addAll(PILT, tile);


        Button tase1 = new Button();
            //tase1.setStyle("-fx-background-color: rgba(0, 0, 0, 0);");
        tase1.setText("Tase 1");
        tase1.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h1 = new Scene(NumbridSonadeks.tase1(primaryStage, stseen1));
                primaryStage.setScene(stseen_h1);
            }
        });
        Button tase2 = new Button("Tase 2");
        tase2.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        tase2.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h2 = new Scene(NumbridSonadeks.tase2(primaryStage, stseen1));
                primaryStage.setScene(stseen_h2);

            }
        });
        Button tase3 = new Button("Tase 3");
        tase3.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        tase3.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h3 = new Scene(NumbridSonadeks.tase3(primaryStage, stseen1));
                primaryStage.setScene(stseen_h3);
            }
        });
        Button tase4 = new Button("Tase 4");
        tase4.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        tase4.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                primaryStage.setScene(Numbristik.jätaMeelde());
            }
        });
        Button menu = new Button("Menüü");
        menu.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 22;");
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
               primaryStage.setScene(stseen1);
            }
        });

            tile.getChildren().addAll(tase1, tase2, tase3, tase4, menu);
            return pane;
        }
    }
