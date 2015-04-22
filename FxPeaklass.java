import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class FxPeaklass extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {


        //kõike esimene stseen, kus saab minna õpetusse või harjutama-----------------------------------------------
        StackPane pane = new StackPane();
        final Scene stseen1 = new Scene(pane); ///stseen1.setFill(Color.SKYBLUE);____________MIKS EI TÖÖTA????

        BorderPane boarder1 = new BorderPane();
        VBox tile = new VBox();
        tile.setSpacing(40);
        tile.setAlignment(Pos.CENTER);
        boarder1.setCenter(tile);


        Image pilt = new Image("file:motleja.png");
        ImageView PILT = new ImageView(pilt);
        PILT.setFitHeight(stseen1.getHeight());
        PILT.setFitHeight(stseen1.getWidth());

        pane.getChildren().addAll(PILT, boarder1);

        //Küsin kas soovitakse tutvuda õpetusega
        /*System.out.println("Tere! Olete sisenenud ühe äärmiselt kasuliku mälutehnika" +
                " õppimise ja harjutamise keskkonda! :) ");*/


        primaryStage.setScene(stseen1);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.show();


        Button opetus = new Button(); //nupp õpetuse juurde minemiseks
        opetus.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        opetus.setText("  Õpetus  ");
        tile.getChildren().add(opetus);

        Button harjutama = new Button();
        harjutama.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: white; -fx-font-size: 30;");
        harjutama.setText("Harjutama");
        tile.getChildren().add(harjutama);
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


                System.out.println("TASE 1 Harjutame foneetilist tähestikku!" + "\n" +
                        "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");


                System.out.println("TASE 2 Harjutame kirjutama sõnu, mis sisaldavad õiget tähte!" + "\n" +
                        "Siin tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks vaid ÜHTE foneetilist tähte!" + "\n" +
                        "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");


                System.out.println("TASE 3 Harjutame kirjutama sõnu, mis sisaldavad õigeid tähti!" + "\n" +
                        "Sisestada tuleb sõna, mis sisaldab kahte foneetilist tähte, mis on ka õiges järjekorras. " + "\n" +
                        "Tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks tõepoolest KAHTE foneetilist tähte!" + "\n");


                System.out.println("TASE 4 Oled jõudnud numbrite meelde jätmise tasemeni. Anname sulle ette ühe" +
                        "ja pika arvu, mille saad eelnevalt õpitud meetodeid kasutades meelde jätta. " +
                        "Pähe õppimise aega saad sa ise reguleerida, vajutades Enterit." +
                        "Numbri ilmumise hetkest hakkab tiksuma aeg. Arvu meelde jätmiseks kulunud aeg" +
                        " näitabki Sinu arengut. Mõnusat elamust!" +
                        "Kui enam harjutada ei soovi, siis sisesta 0.");


                Scene stseen2 = new Scene(group);
                primaryStage.setScene(stseen2);

                menu.setOnMousePressed(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        primaryStage.setScene(stseen1);
                    }
                });
            }
        });


    }

    public static StackPane harjutama(final Scene stseen1, final Stage primaryStage) {

        StackPane pane = new StackPane(); //vajalikud layout'id
        BorderPane border = new BorderPane();
        VBox box = new VBox();
        box.setSpacing(20);
        box.setAlignment(Pos.CENTER);
        border.setCenter(box);

        Image pilt = new Image("file:lehed.png");//tausta lisamine
        ImageView PILT = new ImageView(pilt);
        PILT.setFitHeight(stseen1.getHeight());
        PILT.setFitHeight(stseen1.getWidth());
        pane.getChildren().addAll(PILT, border);


        Button tase1 = new Button("Tase 1");
        tase1.setStyle("-fx-border-stylel:solid; -fx-border-width:2pt; -fx-border-color:crimson; " +
                "-fx-background-color: orange; -fx-text-fill: black; -fx-font-size: 22;");
        tase1.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h1 = new Scene(NumbridSonadeks.tase1(primaryStage, stseen1));
                primaryStage.setScene(stseen_h1);
            }
        });
        Button tase2 = new Button("Tase 2");
        tase2.setStyle("-fx-border-stylel:solid; -fx-border-width:2pt; -fx-border-color:crimson; " +
                "-fx-background-color: orange; -fx-text-fill: black; -fx-font-size: 22;");
        tase2.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h2 = new Scene(NumbridSonadeks.tase2(primaryStage, stseen1));
                primaryStage.setScene(stseen_h2);

            }
        });
        Button tase3 = new Button("Tase 3");
        tase3.setStyle("-fx-border-stylel:solid; -fx-border-width:2pt; -fx-border-color:crimson; " +
                "-fx-background-color: orange; -fx-text-fill: black; -fx-font-size: 22;");
        tase3.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                Scene stseen_h3 = new Scene(NumbridSonadeks.tase3(primaryStage, stseen1));
                primaryStage.setScene(stseen_h3);
            }
        });
        Button tase4 = new Button("Tase 4");
        tase4.setStyle("-fx-border-stylel:solid; -fx-border-width:2pt; -fx-border-color:crimson; " +
                "-fx-background-color: orange; -fx-text-fill: black; -fx-font-size: 22;");
        tase4.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                ArrayList<Kasutaja> users = new ArrayList<Kasutaja>();
                try {
                    users = Kasutaja.loeLogist(users);
                } catch (IOException a) {
                    //a.printStackTrace();
                } catch (ClassNotFoundException b){
                    //b.printStackTrace();
            }
                primaryStage.setScene(Numbristik.jätaMeelde(primaryStage, stseen1, users));
            }
        });
        Button menu = new Button("Menüü");
        menu.setStyle("-fx-border-stylel:solid; -fx-border-width:2pt; -fx-border-color:lightseagreen; " +
                "-fx-background-color: forestgreen; -fx-text-fill: white; -fx-font-size: 22;");
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
               primaryStage.setScene(stseen1);
            }
        });

            box.getChildren().addAll(tase1, tase2, tase3, tase4, menu);
            return pane;
        }
    }
