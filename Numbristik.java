
/**
 * Created by Karin on 9.03.2015.
 */
import java.util.Scanner;

public class Numbristik{
    //meetod pikkade numbrite päheõppimise harjutamiseks
    public static void jätaMeelde(){
        System.out.println("Oled jõudnud numbrite meelde jätmise tasemeni. Anname sulle ette ühe" +
                "ja pika arvu, mille saad eelnevalt õpitud meetodeid kasutades meelde jätta. " +
                "Pähe õppimise aega saad sa ise reguleerida, vajutades Enterit." +
                "Numbri ilmumise hetkest hakkab tiksuma aeg. Arvu meelde jätmiseks kulunud aeg" +
                " näitabki Sinu arengut. Mõnusat elamust!" +
                "Kui enam harjutada ei soovi, siis sisesta 0.");
        Scanner scan1 = new Scanner(System.in);
        while(true) {
            String asi1 = scan1.nextLine();
            long arv = (int) Math.round(Math.random() * 999999999 + 1000000000);
            System.out.println("Number: " + arv);
            long startAeg = System.currentTimeMillis();

            System.out.println("Jätkamiseks vajuta ENTER");
            String asi2 = scan1.nextLine();

            for(int i=0;i<20;i++) {
                System.out.println();
            }

            //küsin kasutajalt, mis numbriga on tegu

            System.out.print("Sisesta number: ");
            long number = scan1.nextLong();
            long lopuAeg   = System.currentTimeMillis();
            long aegKokku = lopuAeg - startAeg;

            if (number != 0) {
                if (arv == number) {
                    System.out.println("Õige! :)");
                } else {
                    System.out.println("Kahjuks läks midagi valesti!");
                }
                System.out.println("Aega kulus: "+aegKokku);
                System.out.println();

            } else {
                System.out.println("Tubli, et harjutasid!");
                break;
            }
        }
    }
}
