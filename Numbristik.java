import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;


//erindi klass, et püüda kinni valesid sisendeid
class ValesisendiViga extends Exception{
    ValesisendiViga() {
        super();
    }
}

public class Numbristik {

    //meetod pikkade numbrite päheõppimise harjutamiseks
    public static Scene jätaMeelde(final Stage primaryStage, final Scene menüü, ArrayList users) {

        final Stage newStage = new Stage();//teen uue lava
        primaryStage.setHeight(630);
        primaryStage.setWidth(450);

        //STSEEN 1 harjutama alustamiseks--------------------------------------------------------------

        StackPane stack1 = new StackPane();
        BorderPane border1 = new BorderPane();
        VBox pane1 = new VBox();
        pane1.setAlignment(Pos.CENTER);
        pane1.setSpacing(15);
        border1.setCenter(pane1);

        Image pilt1 = new Image("file:roosa.png");//lisan taustapildi
        ImageView PILT1 = new ImageView(pilt1);

        Button menu = new Button("Menüü");//nupp menüüsse tagasi minemiseks
        menu.setStyle("-fx-background-color: indigo; -fx-text-fill: gold; -fx-font-size: 20;");
        pane1.getChildren().add(menu);
        menu.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                primaryStage.setHeight(500);
                primaryStage.setWidth(500);
                primaryStage.setScene(menüü);
            }
            });

        Text kasutaja_valim = new Text("Uus harjutaja:"); //et kasutaja teaks endale kasutaja valida
        kasutaja_valim.setFont(Font.font("Verdana", 30));
        kasutaja_valim.setFill(Color.BLACK);
        pane1.getChildren().add(kasutaja_valim);

        final TextField uus_kasutaja = new TextField(); //et kasutaja saaks endale luua uue kasutaja
        uus_kasutaja.setMaxWidth(200);
        uus_kasutaja.setStyle("-fx-text-inner-color: indigo; -fx-font-size: 22;");
        pane1.getChildren().add(uus_kasutaja);


        Button lisa = new Button("Lisa");
        lisa.setStyle("-fx-border-stylel:solid; -fx-border-width:1pt; -fx-border-color:hotpink;" +
                "-fx-background-color: gold; -fx-text-fill: black; -fx-font-size: 18;");
        pane1.getChildren().add(lisa);

        Text pealkiri = new Text("Kasutajad ja tulemused:");
        pealkiri.setFont(Font.font("Verdana", 22));
        pealkiri.setFill(Color.BLACK);
        pane1.getChildren().add(pealkiri);

        final ListView<Kasutaja> kasutajad = new ListView<Kasutaja>();
        final ObservableList<Kasutaja> nimed = FXCollections.observableArrayList();
        for (Object elem: users){
            Kasutaja kasutaja = (Kasutaja) elem;
            nimed.add(kasutaja);
        }
        kasutajad.setPrefHeight(100);
        kasutajad.setMaxWidth(300);
        kasutajad.setItems(nimed);
        pane1.getChildren().add(kasutajad);

        final Button alusta = new Button("Alusta"); //nupp alustamiseks
        alusta.setStyle("-fx-border-stylel:solid; -fx-border-width:1pt; -fx-border-color:gold;" +
                "-fx-background-color: hotpink; -fx-text-fill: white; -fx-font-size: 26;");
        pane1.getChildren().add(alusta);

        final Button salvesta = new Button("Salvesta seis"); //nupp kasutaja skoori seisu salvestamiseks
        salvesta.setStyle("-fx-border-stylel:solid; -fx-border-width:1pt; -fx-border-color:hotpink;" +
                "-fx-background-color: gold; -fx-text-fill:black; -fx-font-size: 16;");
        pane1.getChildren().add(salvesta);

        stack1.getChildren().addAll(PILT1, border1);
        Scene stseen1 = new Scene(stack1);

        //nupule vajutades lisatakse listi uus kasutaja (luuakse uus klassi Kasutaja objekt)
        lisa.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                if(!uus_kasutaja.getText().equals("")) {
                    Kasutaja a = new Kasutaja(uus_kasutaja.getText(), "23h 59min 59s");
                    nimed.add(a);
                    uus_kasutaja.setText("");
                }
            }
        });

        //STSEEN 2 vastamiseks-----------------------------------------------------------------------------
        final VBox pane2 = new VBox();//vajalikud layout'id
        final StackPane stack2 = new StackPane();
        BorderPane border2 = new BorderPane();
        pane2.setAlignment(Pos.CENTER);
        pane2.setSpacing(30);
        border2.setCenter(pane2);

        final Text arvuväli = new Text("");//random arvu jaoks väli
        final long arv = (int) Math.round(Math.random() * 999999999 + 1000000000);
        arvuväli.setFont(Font.font("Verdana", 55));
        arvuväli.setFill(Color.WHITE);
        arvuväli.setText(String.valueOf(arv));
        pane2.getChildren().add(arvuväli);

        final Button vastama = new Button("Vastama");//vastamise alustamiseks nupp
        vastama.setStyle("-fx-background-color: purple; -fx-text-fill: white; -fx-font-size: 28;");
        pane2.getChildren().add(vastama);

        final ArrayList<Kasutaja> tegevlist = new ArrayList<Kasutaja>(); //et ma saaksin tundmatuid kasutajaid alati kuskilt kätte

        Button exit = new Button("Lõpeta");//nupp harjutustasemest väljumiseks
        exit.setStyle("-fx-background-color: orange; -fx-text-fill: white; -fx-font-size: 22;");
        pane2.getChildren().add(exit);

        Image pilt2 = new Image("file:mullid.png");
        ImageView PILT2 = new ImageView(pilt2);
        stack2.getChildren().addAll(PILT2, border2);
        final Scene stseen2 = new Scene(stack2);

        kasutajad.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Kasutaja>() {
            public void changed(ObservableValue<? extends Kasutaja> observable,
                                Kasutaja oldValue, Kasutaja newValue) {
                final Kasutaja hetke_harjutaja = kasutajad.getSelectionModel().getSelectedItem(); //võtan valitud objekti antid hetke kasutajaks

                alusta.setOnMousePressed(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        tegevlist.add(hetke_harjutaja); //lisan vaadeldava kasutaja uude listi
                        System.out.println("alusta nupp valib kasutaja:" + hetke_harjutaja);
                        nimed.remove(nimed.indexOf(hetke_harjutaja)); //eemaldan selle kasutaja meie loetelust segaduse vältimiseks

                        Aeg.startAeg = Calendar.getInstance().getTime();//aja mõõtmise algus
                        newStage.setWidth(460);
                        newStage.setHeight(500);
                        newStage.setScene(stseen2);
                        newStage.show();
                    }

                });
            }
        });


        exit.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                nimed.add(tegevlist.get(tegevlist.size()-1));
                newStage.close();
            }
        });

        salvesta.setOnMousePressed(new EventHandler<MouseEvent>() {
                                       public void handle(MouseEvent me) {
                                           try {
                                               Kasutaja.kirjutaLogisse(nimed);
                                           } catch (IOException e) {
                                               e.printStackTrace();
                                               System.out.println("IO Error");
                                           }
                                       }
                                   });





        //STSEEN 3--------------------------------------------------------------------------------------------
        //VASTUSE andmine
        StackPane stack3 = new StackPane(); //vajalikud layout'id
        BorderPane border3 = new BorderPane();
        VBox pane3 = new VBox();
        pane3.setSpacing(30);
        pane3.setAlignment(Pos.CENTER);
        border3.setCenter(pane3);

        final TextField vastus = new TextField();//küsin kasutajalt, mis numbriga on tegu
        vastus.setMaxWidth(300);
        vastus.setStyle("-fx-text-inner-color: indigo; -fx-font-size: 28;");
        pane3.getChildren().add(vastus);
        ImageView PILT3 = new ImageView(pilt2);
        stack3.getChildren().addAll(PILT3, border3);
        final Scene stseen3 = new Scene(stack3);

        //STSEEN 4 Tagasiside-----------------------------------------------------------------------------------

        VBox pane4 = new VBox(); //vajalikud layout-id
        StackPane stack4 = new StackPane();
        pane4.setAlignment(Pos.CENTER);
        pane4.setSpacing(30);
        BorderPane border4 = new BorderPane();
        border4.setCenter(pane4);

        final Text tagasiside = new Text("");//tagasiside jaoks tekstiväli
        tagasiside.setFont(Font.font("Verdana", 30));
        tagasiside.setFill(Color.WHITE);
        pane4.getChildren().add(tagasiside);

        final Text skoor = new Text("23h 59min 59s");//skoori jaoks tekst
        skoor.setFont(Font.font("Verdana", 40));
        skoor.setFill(Color.WHITE);
        pane4.getChildren().add(skoor);

        Button edasi = new Button("Edasi");//edasi liikumiseks nupp
        edasi.setStyle("-fx-border-stylel:solid; -fx-border-width:1pt; -fx-border-color: darkmagenta;" +
                "-fx-background-color: palevioletred; -fx-text-fill: white; -fx-font-size: 30;");
        pane4.getChildren().add(edasi);
        ImageView PILT4 = new ImageView(pilt2);
        stack4.getChildren().addAll(PILT4, border4);

        final Scene stseen4 = new Scene(stack4);

        //stseen 4 uuele vastamisele suunav nupp
        edasi.setOnMousePressed(new EventHandler<MouseEvent>() {//edasi nupp viib uue vastamise juurde
            public void handle(MouseEvent me) {
                Kasutaja hetkeKasutaja = tegevlist.get(tegevlist.size()-1); //teen skoorile kontrolli ning kui on väiksem siis lisan listi viimaseks
                System.out.println("edasi nupp kontrollib andmeid:  "+tegevlist.get(tegevlist.size()-1));
                System.out.println(skoor.getText());
                hetkeKasutaja.setSkoor(hetkeKasutaja.skooriKontroll(tagasiside.getText(), hetkeKasutaja.getSkoor(), skoor.getText()));
                tegevlist.add(hetkeKasutaja);

                System.out.println("tegevlisti lisame elemendi peale kontrolli : " + hetkeKasutaja);
                System.out.println();
                vastus.setText("");
                Aeg.startAeg = Calendar.getInstance().getTime();
                newStage.setScene(stseen2);
                newStage.show();
            }
        });

        //stseen 2 nupp vastama asumiseks
        vastama.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                newStage.setScene(stseen3);
                newStage.show();
            }
        });

        //enteri vajutusega saab vastuse anda
        vastus.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent me) {
                if (me.getCode() == KeyCode.ENTER) {
                    try {
                        if (Integer.parseInt(arvuväli.getText()) == Integer.parseInt(vastus.getText())) {
                            tagasiside.setText("Õige!");
                        } else {
                            throw new ValesisendiViga();
                        }

                    } catch (Exception e) {
                        tagasiside.setText("Kahjuks läks midagi valesti!");
                    }
                    Aeg.lõppAeg = Calendar.getInstance().getTime();
                    skoor.setText("Skoor:" + Aeg.ajaMõõtmine());
                    arvuväli.setText(String.valueOf((int) Math.round(Math.random() * 999999999 + 1000000000)));
                    System.out.println(arvuväli.getText());

                    newStage.setScene(stseen4);
                }
            }
        });

            return stseen1;
        }


    }