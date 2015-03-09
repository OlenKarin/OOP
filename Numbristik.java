/**
 * Created by Karin on 9.03.2015.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;

public class Numbristik {
    //klass numbrite  ja tähtede harjutamise jaoks 0-9-ni
    public void numbriharjutus() {
        System.out.println("Harjutame foneetilist tähestikku!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");
        ArrayList<Integer> numbrid = new ArrayList<Integer>();
        numbrid.addAll(Arrays.asList(0, 1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7, 8, 9, 9, 9));
        StringBuilder tahed = new StringBuilder("nlgkmtfvwpbsrjhd");

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
        if (tahed.indexOf(taht) == (numbrid.indexOf(arv))) {
            System.out.println("Õige!");
        } else {
            System.out.println("Vale!");
            System.out.println("Õige täht on " + tahed.charAt(numbrid.get(arv)));
        }
        }
}