/**
 * Created by Karin on 9.03.2015.
 */
import java.util.ArrayList;
//Klass selleks, et saaksime kasutaja tulemust salvestada!
public class Harjutaja {
    private String nimi;
    public ArrayList<Integer> tulemus;

    public Harjutaja(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
