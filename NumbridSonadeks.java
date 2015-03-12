
import java.util.Scanner;

public class NumbridSonadeks{
    public static void tase1() {
        System.out.println("Harjutame foneetilist tähestikku!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        //while(true){  KUIDAS MA SAAN NII, ET SCÄNNER EI NUSSIKS???
        while (true) {
            //väljastan suvalise arvu 0-9-ni
            int arv = (int) Math.round(Math.random() * 9 + 0);
            System.out.println("Number: " + arv);

            //küsin kasutajalt, mis tähega on tegu
            Scanner scan = new Scanner(System.in);
            System.out.print("Sisesta täht: ");
            String taht = scan.nextLine();




            //anname võimaluse programmist ka lahkuda
            if (!taht.equals("EXIT")){
                //kontrollin, kas on õige või vale
                if (arv == 0) {
                    Peaklass.nul.kontrollEsimene(taht, arv);
                } else if (arv == 1) {
                    Peaklass.one.kontrollEsimene(taht, arv);
                } else if (arv == 2) {
                    Peaklass.two.kontrollEsimene(taht, arv);
                } else if (arv==3) {
                    Peaklass.three.kontrollEsimene(taht, arv);
                } else if (arv==4) {
                    Peaklass.four.kontrollEsimene(taht, arv);
                } else if (arv==5) {
                    Peaklass.five.kontrollEsimene(taht, arv);
                } else if (arv==6) {
                    Peaklass.six.kontrollEsimene(taht, arv);
                } else if (arv==7) {
                    Peaklass.seven.kontrollEsimene(taht, arv);
                } else if (arv==8) {
                    Peaklass.eight.kontrollEsimene(taht, arv);
                } else if (arv==9) {
                    Peaklass.nine.kontrollEsimene(taht, arv);
                }else{
                    System.out.println("Sisestasid midagi hoopis valesti");
                }
        }else {
                System.out.println("Tubli, et harjutasid!");
                scan.close();
                break;
            }

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
                String taht = sona.substring(i, i+1);
                if (taht.contains("nlkgmtfvwpbsrjhd") || !v) {
                    if (arv==0) {
                        v = Peaklass.nul.kontrollTeine(taht, arv);
                    } else if (arv==1) {
                        v = Peaklass.one.kontrollTeine(taht, arv);
                    } else if (arv==2) {
                        v = Peaklass.two.kontrollTeine(taht, arv);
                    } else if (arv==3) {
                        v = Peaklass.three.kontrollTeine(taht, arv);
                    } else if (arv==4) {
                        v = Peaklass.four.kontrollTeine(taht, arv);
                    } else if (arv==5) {
                        v = Peaklass.five.kontrollTeine(taht, arv);
                    } else if (arv==6) {
                        v = Peaklass.six.kontrollTeine(taht, arv);
                    } else if (arv==7) {
                        v = Peaklass.seven.kontrollTeine(taht, arv);
                    } else if (arv==8) {
                        v = Peaklass.eight.kontrollTeine(taht, arv);
                    } else if (arv==9) {
                        v = Peaklass.nine.kontrollTeine(taht, arv);
                    }

                }
                //kontrollin, kas harjutaja sisestas õigesti!
                if (v){
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
