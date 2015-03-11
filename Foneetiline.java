/**
 * Created by Karin on 9.03.2015.
 */
public class Foneetiline {
    private static String T;
    private static int N;

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
    public static boolean kontrollTeine(Foneetiline a, String taht, int arv) {
            return T.contains(taht) && arv == N;
        }

//meetot kontrollimaks, kas täht ja number on vastavuses - tagastatakse õige täht
    public static void kontrollEsimene(Foneetiline a, String taht, int arv) {
        if (T.contains(taht) && arv == N) {
            System.out.println("Õige!");
        } else {
            System.out.println("Vale! Õige on " + T);
        }
    }
}