
import java.util.Scanner;

public class NumbridSonadeks {
    public static void tase1() {
        System.out.println("Harjutame foneetilist tähestikku!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        //väljastan suvalise arvu 0-9-ni
        int arv = (int) Math.round(Math.random() * 9 + 0);
        System.out.println("Number: " + arv);

        //küsin kasutajalt, mis tähega on tegu
        Scanner scan = new Scanner(System.in);
        System.out.print("Sisesta täht: ");
        String taht = scan.nextLine();
        scan.close();

        //anname võimaluse programmist ka lahkuda
        //kontrollin, kas on õige või vale
        Numbristik.kontrollEsimene(taht, arv);
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
       /* if (sona.length() > 1) {
            for ....
                Numbristik.kontrollTeine(sona, arv);
            }
        }*/
    }
}
