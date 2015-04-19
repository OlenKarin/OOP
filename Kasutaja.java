import java.io.*;

public class Kasutaja {
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

    public static void kirjutaLogisse(Kasutaja a)throws IOException{
        FileOutputStream fout = new FileOutputStream("kasutajad.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(a);

    }
    public static Kasutaja loeLogist(Kasutaja kasutaja)throws IOException, ClassNotFoundException{
        FileInputStream in = new FileInputStream("kasutajad.txt");
        ObjectInputStream objectIn = new ObjectInputStream(in);
        Object obj = objectIn.readObject();
        objectIn.close();
        kasutaja = (Kasutaja) obj;
        return kasutaja;
    }
    public static void skooriKontroll(Kasutaja a, String tagasiside_tekt, String vana_skoor, String uus_skoor){
        vana_skoor = vana_skoor.toLowerCase().replaceAll("[min hsek]", "");
        String[] vj = vana_skoor.split("");
        uus_skoor = uus_skoor.toLowerCase().replaceAll("[min hsek]", "");
        String[] uj = uus_skoor.split("");

        if(tagasiside_tekt.equals("Õige!")){
            if(t(uj[0]) < t(vj[0])){
                a.setSkoor(uus_skoor);
            }else if(t(uj[0]) == t(vj[0]) && t(uj[1]) < t(vj[1])){
                a.setSkoor(uus_skoor);
            }else if(t(uj[0]) == t(vj[0]) && t(uj[1]) == t(vj[1]) && t(uj[1]) < t(vj[1])){
                a.setSkoor(uus_skoor);
            }
        }
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
