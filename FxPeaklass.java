import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FxPeaklass extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {

        TilePane tile = new TilePane();

        //Küsin kas soovitakse tutvuda õpetusega
        /*System.out.println("Tere! Olete sisenenud ühe äärmiselt kasuliku mälutehnika" +
                " õppimise ja harjutamise keskkonda! :) ");*/

        Button opetus = new Button();
        opetus.setText("Õpetus");
        opetus.setTranslateX(100);
        opetus.setTranslateY(200);
        tile.getChildren().addAll(opetus);

        final Scene stseen1 = new Scene(tile);
        stseen1.setFill(Color.PEACHPUFF);
        primaryStage.setScene(stseen1);
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);
        primaryStage.show();

        Button harjutama = new Button();
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
                Button menu = new Button();
                menu.setText("Menüü");
                menu.setTranslateX(280);
                menu.setTranslateY(20);
                menu.setAlignment(Pos.BOTTOM_RIGHT);
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

    public static TilePane harjutama(final Scene stseen1, final Stage primaryStage) {

    TilePane tile = new TilePane();

    Button tase1 = new Button();
    tase1.setText("Tase 1");
    tase1.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent me) {
            Scene stseen_h1 = new Scene(NumbridSonadeks.tase1());
            primaryStage.setScene(stseen_h1);
        }
    });
    Button tase2 = new Button();
    tase2.setText("Tase 2");
    tase2.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent me) {
            Scene stseen_h2 = new Scene(NumbridSonadeks.tase2());
            primaryStage.setScene(stseen_h2);

        }
    });
    Button tase3 = new Button();
    tase3.setText("Tase 3");
    tase3.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent me) {
            Scene stseen_h3 = new Scene(NumbridSonadeks.tase3());
            primaryStage.setScene(stseen_h3);
        }
    });
    Button tase4 = new Button();
    tase4.setText("Tase 4");
    tase4.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent me) {
            Scene stseen_h4 = new Scene(Numbristik.jätaMeelde());
            primaryStage.setScene(stseen_h4);
        }
    });
    Button menu = new Button();
    menu.setText("Menüü");
    menu.setOnMousePressed(new EventHandler<MouseEvent>() {
        public void handle(MouseEvent me) {
           primaryStage.setScene(stseen1);
        }
    });

            tile.getChildren().addAll(tase1, tase2, tase3, tase4, menu);
            return tile;
        }
    }
