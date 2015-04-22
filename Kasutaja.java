import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;

public class Kasutaja implements Serializable{
    public String nimi;
    public String skoor;

    public String getNimi() {
        return nimi;
    }

    public String getSkoor() {
        return skoor;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSkoor(String skoor) {
        this.skoor = skoor;
    }

    Kasutaja(String nimi, String skoor){
        this.nimi = nimi;
        this.skoor = skoor;
    }

    public static void kirjutaLogisse(ObservableList<Kasutaja> a)throws IOException{

        FileOutputStream fout = new FileOutputStream("kasutajad.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        for(Kasutaja elem : a ) {
            out.writeObject(elem);
        }
        fout.close();
        out.close();
    }
    public static ArrayList<Kasutaja> loeLogist(ArrayList<Kasutaja> list)throws IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("kasutajad.txt");
        ObjectInputStream objectIn = new ObjectInputStream(in);
        while(true) {
            try {
                Object obj = objectIn.readObject();
                Kasutaja kasutaja = (Kasutaja) obj;
                list.add(kasutaja);

            } catch (EOFException e) {
                return list;
            }
        }
    }
    public String skooriKontroll(String tagasiside_tekt, String vana_skoor, String uus_skoor){
        vana_skoor = vana_skoor.toLowerCase().replaceAll("[Skoor:min hs]", "");
        System.out.println(vana_skoor);
        String[] vj = vana_skoor.split(" ");
        uus_skoor = uus_skoor.toLowerCase().replaceAll("[Skoor:minhs]", "");
        String[] uj = uus_skoor.split(" ");
        System.out.println(uj[0]);
        System.out.println(uj[1]);
        System.out.println(uj[2]);
        String[] SKOOR = this.getSkoor().toLowerCase().replaceAll("[Skoor:minhs]", "").split(" ");
        System.out.println(SKOOR[0]);
        System.out.println(SKOOR[1]);
        System.out.println(SKOOR[2]);
        if(tagasiside_tekt.equals("Õige!")){
            if(t(uj[0]) < t(vj[0]) ||
                    t(uj[0]) == t(vj[0]) && t(uj[1]) < t(vj[1]) ||
                    t(uj[0]) == t(vj[0]) && t(uj[1]) == t(vj[1]) && t(uj[1]) < t(vj[1])) {
                SKOOR[0] = uj[0];
                SKOOR[1] = uj[1];
                SKOOR[2] = uj[2];
            }
        }
        return SKOOR[0]+"h "+SKOOR[1]+"min "+SKOOR[2]+"s";
    }
    public static int t(String arvusona){
        int arv = Integer.parseInt(arvusona);
        return arv;
    }

    @Override
    public String toString() {
        return nimi + " - skoor: " + skoor;
    }
}
