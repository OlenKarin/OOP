import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;


class ValesisendiViga extends Exception{
    ValesisendiViga(String teade) {
        super(teade);
    }
}

public class Numbristik{
    //meetod pikkade numbrite päheõppimise harjutamiseks
    public static Scene jätaMeelde(){

        final TilePane pane = new TilePane();

        System.out.println("Oled jõudnud numbrite meelde jätmise tasemeni. Anname sulle ette ühe" +
                "ja pika arvu, mille saad eelnevalt õpitud meetodeid kasutades meelde jätta. " +
                "Pähe õppimise aega saad sa ise reguleerida, vajutades Enterit." +
                "Numbri ilmumise hetkest hakkab tiksuma aeg. Arvu meelde jätmiseks kulunud aeg" +
                " näitabki Sinu arengut. Mõnusat elamust!" +
                "Kui enam harjutada ei soovi, siis sisesta 0.");

        //esimene stseen harjutama alustamiseks
        TilePane pane1 = new TilePane();

        Button alusta = new Button(); //nupp alustamiseks
        alusta.setText("Alusta");
        pane1.getChildren().add(alusta);

        Text kasutaja_valim = new Text("Vali endale kasutaja:"); //et kasutaja teaks endale kasutaja valida
        pane1.getChildren().add(kasutaja_valim);

        TextField uus_kasutaja = new TextField(); //et kasutaja saaks endale luua uue kasutaja
        
        Scene stseen1 = new Scene(pane1);

        //random arvu jaoks väli
        Text arvuväli = new Text("");
        final long arv = (int) Math.round(Math.random() * 999999999 + 1000000000);
        arvuväli.setText(String.valueOf(arv));
        pane.getChildren().add(arvuväli);

        //aja mõõtmise algus
        final long startAeg = System.currentTimeMillis();

        //tagasiside jaoks koht
        final Text tagasiside = new Text("");
        pane.getChildren().add(tagasiside);

        //skoori jaoks tekst
        final Text skoor = new Text("");
        pane.getChildren().add(skoor);

        //vastamise alustamiseks nupp
        final Button vasta = new Button();
        vasta.setText("Vasta");
        pane.getChildren().add(vasta);
        vasta.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {

                //küsin kasutajalt, mis numbriga on tegu
                final TextField vastus = new TextField();
                pane.getChildren().add(vastus);
                final long lopuAeg = System.currentTimeMillis();

                vasta.setText("Vasta");
                vasta.setOnMousePressed(new EventHandler<MouseEvent>() {
                    public void handle(MouseEvent me) {
                        long aegKokku = lopuAeg - startAeg;

                        try {
                            if (arv == Integer.parseInt(vastus.getText())) {
                               tagasiside.setText("Õige! :)");
                            } else {
                                throw new ValesisendiViga("Kahjuks läks midagi valesti!");
                            }
                            skoor.setText("Aega kulus: " + aegKokku);
                        } catch (Exception e) {
                            tagasiside.setText(e.getMessage());
                        }
                    }
                });
            }
            });

        return stseen1;
        }
    }

