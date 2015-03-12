/**
 * Created by Karin on 9.03.2015.
 */
public class Foneetiline {
    private String T;
    private int N;

    public Foneetiline(String t, int n) {
        T = t;
        N = n;
    }

    public String getT() {
        return T;
    }

    public int getN() {
        return N;
    }

    //meetot kontrollimaks, kas täht ja number on vastavuses - tagastatakse tõeväärtus
    public boolean kontrollTeine(String taht, int arv) {
            return (T.contains(taht) && arv == N);
        }

//meetot kontrollimaks, kas täht ja number on vastavuses - tagastatakse õige täht
    public void kontrollEsimene(String taht, int arv) {
        if (T.contains(taht) && arv == N) {
            System.out.println("Õige!");
        } else {
            System.out.println(this);
            System.out.println("Vale! Õige on " + T);
        }
    }

    public String toString() {
        return "T = "+T+" N= "+N;
    }
}