
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;

import java.util.Scanner;

class SisendiViga extends Exception {
    SisendiViga(String teade) {
        super(teade);
    }
}
public class NumbridSonadeks {
    static String[] soovitus = {"nui", "luu", "kuu", "ma", "Tai", "vai", "puu", "sai", "rai",
            "jää", "Lina, laine", "Luule, leil", "Luuk,leek, lõug",
            "Liim, laama, leem", "Laut, laat", "Liiv, laava, laev",
            "Luup, laup, leib", "Leesi, loos", "Loor, Laar, leer",
            "Luud, lood, laud ", "Kana, kaan, küna ", "Keel, kaal, kiil, kali",
            "Kiik, kook, köök", "Kama", "Koot, kuut", "Kaev", "Keep, kiip, kabe ",
            "Köis, küüs, Kais", "Kari, kuur, karu ", "Giid, gaid, koda ",
            "Muna, miin ", "Male, muul ", "Mõõk, magu ", "Muumia, maim ",
            "Mõte", "Movie", "Amööb", "Moos, mais ", "Muru ", "Madu, mood, muda ",
            "Tina, Taani", "Talu, tool", "Tigu, tõke, tiik", "Tuum", "Tita, tuut",
            "Tuvi", "Teip, tibi", "Toos", "Tüür, taara, tõru", "Teed, taud, tädi",
            "Vein, viin", "Viiul, viil, vaal", "Vaik", "Vaim",
            "Võti, viit, vaat, vööt", "WiFi (– ruuter)", "V.I.P, vibu",
            "Vaas antiik, Võsa, veis", "Vaarao,vari, veri, vöör", "Vaha, voodi",
            "Paun, peni", "Palee", "Piik, paak", "Piim, puuma, pime",
            "Paat, piit, peet", "Päev", "Piip", "Pesa, pisa, põis, puus",
            "Puur, puri", "Pada, padi, pöid, pide", "Saan, seen",
            "Siil, sõel", "Saag", "Sumo, seeme", "Aste, sete, osuti",
            "Šeif, savi", "Seep, saba", "Uss",
            "Sari, saar", "Süda", "Ruun", "Raal, rool", "Riik, röga, rauk",
            "Rooma, arm", "Riit", "Riiv (toidu, ukse), reiv", "Raba, urb",
            "Roos", "Urr", "Reha, raha, raadio", "Hein, hani", "Huul",
            "Hoki, juga", "Aadam, daim", "Jeti", "Haav, ahv", "Hape, habe",
            "Hiis", "Hiir", "Haud"};

    public static TilePane tase1() {
        TilePane pane = new TilePane();
        System.out.println("Harjutame foneetilist tähestikku!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");


        //väljastan suvalise arvu 0-9-ni
        final int a = (int) Math.round(Math.random() * 9 + 0);
        final Text arv = new Text(String.valueOf(a));
        pane.getChildren().add(arv);

        //küsin kasutajalt, mis tähega on tegu
        final TextField kastike = new TextField();
        pane.getChildren().add(kastike);

        Button enter = new Button();
        enter.setText("Enter");
        pane.getChildren().add(enter);

        //Tagasiside jaoks koht
        final Text tagasiside = new Text("");
        pane.getChildren().add(tagasiside);

        //kontrollin, kas on õige või vale
        enter.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                if (Integer.parseInt(arv.getText()) == 1) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.one.getN(), Peaklass.one.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 2) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.two.getN(), Peaklass.two.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 3) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.three.getN(), Peaklass.three.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 4) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.four.getN(), Peaklass.four.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 5) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.five.getN(), Peaklass.five.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 6) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.six.getN(), Peaklass.six.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 7) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.seven.getN(), Peaklass.seven.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 8) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.eight.getN(), Peaklass.eight.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 9) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.nine.getN(), Peaklass.nine.getT(), tagasiside, arv);
                } else if (Integer.parseInt(arv.getText()) == 0) {
                    kontrollEsimene(kastike.getText(), Integer.parseInt(arv.getText()), Peaklass.nul.getN(), Peaklass.nul.getT(), tagasiside, arv);
                }
            }
        });
        return pane;
    }

    //meetot kontrollimaks, kas täht ja number on vastavuses - tagastatakse õige täht
    public static void kontrollEsimene(String taht, int nr, int foneetiline_arv, String T, Text tagasiside, Text arv) {
        if (T.contains(taht.toLowerCase()) && nr == foneetiline_arv) {
            tagasiside.setText("Õige!");
        } else {
            tagasiside.setText("Vale! " + nr + " = " + T);
        }
        int a = (int) Math.round(Math.random() * 9 + 0);
        arv.setText(String.valueOf(a));
    }


    public static TilePane tase2() {

        TilePane pane = new TilePane();

        System.out.println("Harjutame kirjutama sõnu, mis sisaldavad õiget tähte!" + "\n" +
                "Siin tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks vaid ÜHTE foneetilist tähte!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        //väljastan suvalise arvu 0-9-ni
        final int a = (int) Math.round(Math.random() * 9 + 0);
        final Text arv = new Text(String.valueOf(a));
        pane.getChildren().add(arv);

        //küsin kasutajalt, mis tähega on tegu
        final TextField kastike = new TextField();
        pane.getChildren().add(kastike);

        Button enter = new Button();
        enter.setText("Enter");
        pane.getChildren().add(enter);

        //Tagasiside jaoks koht
        final Text tagasiside = new Text("");
        pane.getChildren().add(tagasiside);

        //Soovituse koht
        final Text soov = new Text("");
        pane.getChildren().add(soov);

        enter.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                boolean v;
                //kontrollin, kas sõna sisaldab piisavalt tähti
                if (kastike.getText().length() > 1) {
                    String sona = kastike.getText();
                    sona = sona.replaceAll("[aceiouõüöäq]", "");
                    v = taheÕigsus(kastike, arv, soov) && sona.length() == 1;
                    int a = (int) Math.round(Math.random() * 9 + 0);
                    arv.setText(String.valueOf(a));

                    if (v) {
                        tagasiside.setText("Õige");
                    } else {
                        tagasiside.setText("Vale!");
                    }
                } else {
                    tagasiside.setText("Sisestada tuleb sõna!");
                }
            }
            });

        return pane;
    }

    public static boolean taheÕigsus(TextField kastike, Text arv, Text soov) {
        boolean v = true;
        String sona = kastike.getText();
        sona = sona.replaceAll("[aceiouõüöäq]", "");
        //kontrollin, kas on õige või vale
        if (Integer.parseInt(arv.getText()) == 1) {
            v = sona.contains(Peaklass.one.getT()) && Integer.parseInt(arv.getText()) == Peaklass.one.getN();
        } else if (Integer.parseInt(arv.getText()) == 2) {
            v = sona.contains(Peaklass.two.getT()) && Integer.parseInt(arv.getText()) == Peaklass.two.getN();
        } else if (Integer.parseInt(arv.getText()) == 3) {
            v = sona.contains(Peaklass.three.getT()) && Integer.parseInt(arv.getText()) == Peaklass.three.getN();
        } else if (Integer.parseInt(arv.getText()) == 4) {
            v = sona.contains(Peaklass.four.getT()) && Integer.parseInt(arv.getText()) == Peaklass.four.getN();
        } else if (Integer.parseInt(arv.getText()) == 5) {
            v = sona.contains(Peaklass.five.getT()) && Integer.parseInt(arv.getText()) == Peaklass.five.getN();
        } else if (Integer.parseInt(arv.getText()) == 6) {
            v = sona.contains(Peaklass.six.getT()) && Integer.parseInt(arv.getText()) == Peaklass.six.getN();
        } else if (Integer.parseInt(arv.getText()) == 7) {
            v = sona.contains(Peaklass.seven.getT()) && Integer.parseInt(arv.getText()) == Peaklass.seven.getN();
        } else if (Integer.parseInt(arv.getText()) == 8) {
            v = sona.contains(Peaklass.eight.getT()) && Integer.parseInt(arv.getText()) == Peaklass.eight.getN();
        } else if (Integer.parseInt(arv.getText()) == 9) {
            v = sona.contains(Peaklass.nine.getT()) && Integer.parseInt(arv.getText()) == Peaklass.nine.getN();
        } else if (Integer.parseInt(arv.getText()) == 0) {
            v = sona.contains(Peaklass.nul.getT()) && Integer.parseInt(arv.getText()) == Peaklass.nul.getN();
        }
        //sõna soovitus ka
        soov.setText(arv.getText()+ " sõnaks sobib: " + soovitus[Integer.parseInt(arv.getText())]);
        return v;
    }


    public static TilePane tase3() {

        TilePane pane = new TilePane();
        System.out.println("Harjutame kirjutama sõnu, mis sisaldavad õigeid tähti!" + "\n" +
                "Sisestada tuleb sõna, mis sisaldab kahte foneetilist tähte, mis on ka õiges järjekorras. " + "\n" +
                "Tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks tõepoolest KAHTE foneetilist tähte!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT!");


        //väljastan suvalise arvu 0-99-ni
        int arv1 = (int) Math.round(Math.random() * 8 + 1);
        int arv2 = (int) Math.round(Math.random() * 9 + 0);
        String number = String.valueOf(arv1) + String.valueOf(arv2);

        //numbri kuvamiseks text-i väli
        final Text arvuväli = new Text(number);
        pane.getChildren().add(arvuväli);

        //sõna sisestamiseks box
        final TextField kastike = new TextField();
        pane.getChildren().add(kastike);

        //nupp vastuse kontrollimiseks
        Button enter = new Button();
        enter.setText("Enter");
        pane.getChildren().add(enter);

        //tagasiside jaoks tekstiväli
        final Text tagasiside = new Text("");
        pane.getChildren().add(tagasiside);

        //soovituse jaoks tekstiväli
        final Text soov = new Text("");
        pane.getChildren().add(soov);

        //enteri funktsioonid
        enter.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent me) {
                try {
                    if (kastike.getText().length() > 1) {
                        String sona = kastike.getText();
                        sona = sona.toLowerCase().replaceAll("[aceiouõüöäq]", "");
                        String[] taht = sona.split("");
                        //kontrollin, kas sõna sisaldab piisavalt tähti
                        if (taht.length == 2) {
                            //kontrollin, kas on täht õige või vale
                            kontroll(kastike, arvuväli, soov, tagasiside);
                        } else{
                            tagasiside.setText("Midagi läks nüüd väga valesti!");
                        }
                    } else {
                        throw new SisendiViga("Sisestada tuleb sõna!");
                    }
                } catch (Exception e) {
                    tagasiside.setText(e.getMessage());
                }
            }
        });
        return pane;
    }

    public static void kontroll(TextField kastike, Text arvuväli, Text soov, Text tagasiside) {
        boolean v = true;
        boolean k = true;
        String sona = kastike.getText().toLowerCase().replaceAll("[aceiouõüöäq]", "");
        String[] taht = sona.split("");
        String[] arvud = arvuväli.getText().split("");


        //kontrollin, kas esimene täht on õige või vale
        if (Integer.parseInt(arvud[0]) == 1) {
            v = Peaklass.one.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.one.getN();
        } else if (Integer.parseInt(arvud[0]) == 2) {
            v = Peaklass.two.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.two.getN();
        } else if (Integer.parseInt(arvud[0]) == 3) {
            v = Peaklass.three.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.three.getN();
        } else if (Integer.parseInt(arvud[0]) == 4) {
            v = Peaklass.four.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.four.getN();
        } else if (Integer.parseInt(arvud[0]) == 5) {
            v = Peaklass.five.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.five.getN();
        } else if (Integer.parseInt(arvud[0]) == 6) {
            v = Peaklass.six.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.six.getN();
        } else if (Integer.parseInt(arvud[0]) == 7) {
            v = Peaklass.seven.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.seven.getN();
        } else if (Integer.parseInt(arvud[0]) == 8) {
            v = Peaklass.eight.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.eight.getN();
        } else if (Integer.parseInt(arvud[0]) == 9) {
            v = Peaklass.nine.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.nine.getN();
        } else if (Integer.parseInt(arvud[0]) == 0) {
            v = Peaklass.nul.getT().contains(taht[0]) && Integer.parseInt(arvud[0]) == Peaklass.nul.getN();
        }

        //kontrollin, kas teine täht on õige või vale
        if (Integer.parseInt(arvud[1]) == 1) {
            k = Peaklass.one.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.one.getN();
        } else if (Integer.parseInt(arvud[1]) == 2) {
            k = Peaklass.two.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.two.getN();
        } else if (Integer.parseInt(arvud[1]) == 3) {
            k = Peaklass.three.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.three.getN();
        } else if (Integer.parseInt(arvud[1]) == 4) {
            k = Peaklass.four.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.four.getN();
        } else if (Integer.parseInt(arvud[1]) == 5) {
            k = Peaklass.five.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.five.getN();
        } else if (Integer.parseInt(arvud[1]) == 6) {
            k = Peaklass.six.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.six.getN();
        } else if (Integer.parseInt(arvud[1]) == 7) {
            k = Peaklass.seven.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.seven.getN();
        } else if (Integer.parseInt(arvud[1]) == 8) {
            k = Peaklass.eight.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.eight.getN();
        } else if (Integer.parseInt(arvud[1]) == 9) {
            k = Peaklass.nine.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.nine.getN();
        } else if (Integer.parseInt(arvud[1]) == 0) {
            k = Peaklass.nul.getT().contains(taht[1])  && Integer.parseInt(arvud[1]) == Peaklass.nul.getN();
        }
        //soovitus ka
        soov.setText(arvuväli.getText()+ " sõnaks sobib: " + soovitus[Integer.parseInt(arvuväli.getText())]);

        //uus nr arvuväljale
        int arv1 = (int) Math.round(Math.random() * 8 + 1);
        int arv2 = (int) Math.round(Math.random() * 9 + 0);
        String number = String.valueOf(arv1) + String.valueOf(arv2);
        arvuväli.setText(number);

        if(k&&v) {
            tagasiside.setText("Õige!");
        }else{
            tagasiside.setText("Vale!");
        }

    }
}

