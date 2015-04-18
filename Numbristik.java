import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Calendar;


class ValesisendiViga extends Exception{
    ValesisendiViga() {
        super();
    }
}

public class Numbristik {
    //meetod pikkade numbrite päheõppimise harjutamiseks
    public static Scene jätaMeelde(final Stage primaryStage, final Scene menüü) {

        final Stage newStage = new Stage();
        newStage.setWidth(500);
        newStage.setHeight(500);

        System.out.println("Oled jõudnud numbrite meelde jätmise tasemeni. Anname sulle ette ühe" +
                "ja pika arvu, mille saad eelnevalt õpitud meetodeid kasutades meelde jätta. " +
                "Pähe õppimise aega saad sa ise reguleerida, vajutades Enterit." +
                "Numbri ilmumise hetkest hakkab tiksuma aeg. Arvu meelde jätmiseks kulunud aeg" +
                " näitabki Sinu arengut. Mõnusat elamust!" +
                "Kui enam harjutada ei soovi, siis sisesta 0.");

        //STSEEN 1 harjutama alustamiseks
        StackPane stack1 = new StackPane();
        Image pilt1 = new Image("file:linnud.png");
        ImageView PILT1 = new ImageView(pilt1);
        TilePane pane1 = new TilePane();

        Button menu = new Button("Menüü");//nupp menüüsse tagasi minemiseks
        menu.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: black; -fx-font-size: 20;");
        pane1.getChildren().add(menu);
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                primaryStage.setScene(menüü);
            }
            });

        Button alusta = new Button("Alusta"); //nupp alustamiseks
        alusta.setStyle("-fx-background-color: purple; -fx-text-fill: white; -fx-font-size: 24;");
        pane1.getChildren().add(alusta);

        Text kasutaja_valim = new Text("Vali endale kasutaja:"); //et kasutaja teaks endale kasutaja valida
        pane1.getChildren().add(kasutaja_valim);

        TextField uus_kasutaja = new TextField(); //et kasutaja saaks endale luua uue kasutaja
        pane1.getChildren().add(uus_kasutaja);

        Button lisa = new Button("Lisa");
        lisa.setStyle("-fx-background-color: pink; -fx-text-fill: black; -fx-font-size: 18;");
        pane1.getChildren().add(lisa);

        ListView<String> kasutajad = new ListView<String>();
        ObservableList<String> nimed = FXCollections.observableArrayList("Karru", "Marru", "Tarru");
        kasutajad.setPrefHeight(100);
        kasutajad.setItems(nimed);
        pane1.getChildren().add(kasutajad);
        stack1.getChildren().addAll(PILT1, pane1);
        Scene stseen1 = new Scene(stack1);




        //STSEEN 2 vastamiseks
        final TilePane pane2 = new TilePane();
        final Text arvuväli = new Text("");//random arvu jaoks väli
        final long arv = (int) Math.round(Math.random() * 999999999 + 1000000000);
        arvuväli.setText(String.valueOf(arv));
        pane2.getChildren().add(arvuväli);
        final Button vastama = new Button();//vastamise alustamiseks nupp
        vastama.setStyle("-fx-background-color: dodgerblue; -fx-text-fill: black; -fx-font-size: 22;");
        vastama.setText("Vastama");
        pane2.getChildren().add(vastama);
        Button exit = new Button("Lõpeta");//nupp harjutustasemest väljumiseks
        exit.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 22;");
        pane2.getChildren().add(exit);
        exit.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                newStage.close();
            }
        });
        final StackPane stack2 = new StackPane();
        Image pilt2 = new Image("file:mustrid.png");
        ImageView PILT2 = new ImageView(pilt2);
        PILT2.setFitHeight(300); //stseen1.getHeight()
        PILT2.setFitWidth(400);
        stack2.getChildren().addAll(pane2, PILT2);
        final Scene stseen2 = new Scene(stack2);

        alusta.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                //aja mõõtmise algus
                Aeg.startAeg = Calendar.getInstance().getTime();
                newStage.setScene(stseen2);
                newStage.show();
            }

        });

        //STSEEN 3
        //VASTUSE andmine
        TilePane pane3 = new TilePane();
        final TextField vastus = new TextField();//küsin kasutajalt, mis numbriga on tegu
        pane3.getChildren().add(vastus);
        StackPane stack3 = new StackPane();
        stack3.getChildren().addAll(PILT2, pane3);
        final Scene stseen3 = new Scene(stack3);

        //STSEEN 4 Tagasiside
        TilePane pane4 = new TilePane();
        final Text tagasiside = new Text("");//tagasiside jaoks koht
        pane4.getChildren().add(tagasiside);
        final Text skoor = new Text(String.valueOf(System.currentTimeMillis() / 1000000));//skoori jaoks tekst
        pane4.getChildren().add(skoor);
        Button edasi = new Button("Edasi");//edasi liikumiseks nupp
        edasi.setStyle("-fx-background-color: pink; -fx-text-fill: black; -fx-font-size: 22;");
        pane4.getChildren().add(edasi);
        StackPane stack4 = new StackPane();
        stack4.getChildren().addAll(PILT2, pane4);
        final Scene stseen4 = new Scene(stack4);

        //edasi nupp viib uue vastamise juurde
        edasi.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                vastus.setText("");
                Aeg.startAeg = Calendar.getInstance().getTime();
                newStage.setScene(stseen2);
                newStage.show();
            }
        });

        vastama.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                newStage.setScene(stseen3);
                newStage.show();
            }
        });

        vastus.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent me) {
                if (me.getCode() == KeyCode.ENTER) {
                    try {
                        if (Integer.parseInt(arvuväli.getText()) == Integer.parseInt(vastus.getText())) {
                            tagasiside.setText("Õige! :)");
                        } else {
                            throw new ValesisendiViga();
                        }

                    } catch (Exception e) {
                        tagasiside.setText("Kahjuks läks midagi valesti!");
                    }
                    Aeg.lõppAeg = Calendar.getInstance().getTime();
                    skoor.setText("Skoor: " + Aeg.ajaMõõtmine());
                    arvuväli.setText(String.valueOf((int) Math.round(Math.random() * 999999999 + 1000000000)));

                    newStage.setScene(stseen4);
                }
            }
        });

            return stseen1;
        }


    }