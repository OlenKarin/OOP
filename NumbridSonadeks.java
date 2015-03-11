
import java.util.Scanner;

public class NumbridSonadeks{
    public static void tase1() {
        System.out.println("Harjutame foneetilist tähestikku!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        //while(true){  KUIDAS MA SAAN NII, ET SCÄNNER EI NUSSIKS???

        //väljastan suvalise arvu 0-9-ni
        int arv = (int) Math.round(Math.random() * 9 + 0);
        System.out.println("Number: " + arv);

        //küsin kasutajalt, mis tähega on tegu
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta täht: ");
        String taht = scan.nextLine();
        scan.close();

        //anname võimaluse programmist ka lahkuda
        if(taht.equals("EXIT"))

        //kontrollin, kas on õige või vale
            if (taht.equals("n")) {
                Foneetiline.kontrollEsimene(Peaklass.nul, taht, arv);
            } else if (taht.equals("l")) {
                Foneetiline.kontrollEsimene(Peaklass.one, taht, arv);
            } else if (taht.equals("k") || taht.equals("g")) {
                Foneetiline.kontrollEsimene(Peaklass.two, taht, arv);
            } else if (taht.equals("m")) {
                Foneetiline.kontrollEsimene(Peaklass.three, taht, arv);
            } else if (taht.equals("t")) {
                Foneetiline.kontrollEsimene(Peaklass.four, taht, arv);
            } else if (taht.equals("v") || taht.equals("w") || taht.equals("f")) {
                Foneetiline.kontrollEsimene(Peaklass.five, taht, arv);
            } else if (taht.equals("b") || taht.equals("p")) {
                Foneetiline.kontrollEsimene(Peaklass.six, taht, arv);
            } else if (taht.equals("s")) {
                Foneetiline.kontrollEsimene(Peaklass.seven, taht, arv);
            } else if (taht.equals("r")) {
                Foneetiline.kontrollEsimene(Peaklass.eight, taht, arv);
            } else if (taht.equals("j") || taht.equals("h") || taht.equals("d")) {
                Foneetiline.kontrollEsimene(Peaklass.nine, taht, arv);
            }
        else{
                System.out.println("Tubli, et harjutasid!");
                //break;   ET WHILE TSÜKKLIT LÕPETADA!
            }
    }
    public static void tase2() {
        System.out.println("Harjutame kirjutama sõnu, mis sisaldavad õigeid tähti!" + "\n" +
                "Kõigepealt sõnad, mis sisaldavad vaid ühte foneetilist tähte. " + "\n" +
                "Siin tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks tõepoolest vaid ÜHTE foneetilist tähte!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        //väljastan suvalise arvu 0-9-ni
        int arv = (int) Math.round(Math.random() * 9 + 0);
        System.out.println("Number: " + arv);

        //küsin kasutajalt, mis tähega on tegu
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta täht: ");
        String sona = scan.nextLine();
        scan.close();

        //anname võimaluse programmist ka lahkuda
        //kontrollin, kas on õige või vale
       if (sona.length() > 1) {
        boolean v = true;
            for (int i = 0;i< sona.length(); i++ ){
                String[] q = sona;
                String taht = sona.copyValueOf(q.);
                if (taht.equals("n")) {
                    if (taht.equals("n")) {
                        v = Foneetiline.kontrollTeine(Peaklass.nul, taht, arv);
                    } else if (taht.equals("l")) {
                        v = Foneetiline.kontrollTeine(Peaklass.one, taht, arv);
                    } else if (taht.equals("k") || taht.equals("g")) {
                        v = Foneetiline.kontrollTeine(Peaklass.two, taht, arv);
                    } else if (taht.equals("m")) {
                        v = Foneetiline.kontrollTeine(Peaklass.three, taht, arv);
                    } else if (taht.equals("t")) {
                        v = Foneetiline.kontrollTeine(Peaklass.four, taht, arv);
                    } else if (taht.equals("v") || taht.equals("w") || taht.equals("f")) {
                        v = Foneetiline.kontrollTeine(Peaklass.five, taht, arv);
                    } else if (taht.equals("b") || taht.equals("p")) {
                        v = Foneetiline.kontrollTeine(Peaklass.six, taht, arv);
                    } else if (taht.equals("s")) {
                        v = Foneetiline.kontrollTeine(Peaklass.seven, taht, arv);
                    } else if (taht.equals("r")) {
                        v = Foneetiline.kontrollTeine(Peaklass.eight, taht, arv);
                    } else if (taht.equals("j") || taht.equals("h") || taht.equals("d")) {
                        v = Foneetiline.kontrollTeine(Peaklass.nine, taht, arv);
                    }

                }
                //kontrollin, kas harjutaja sisestas õigesti!
                if (v == true){
                    System.out.println("Õige!");
                }
                 else{
                        System.out.println("Vale");
                    }
                //soovitus ka!!!!!

            }
        }
    }
}
