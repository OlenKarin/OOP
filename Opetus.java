/**
 * Created by Karin on 18.03.2015.
 */
//Vajalike pakettide importimine
import java.util.Scanner;
public class Opetus {
    //meetod faili sisu väljastamiseks
    public static void instructions(String fail) throws Exception {
        java.io.File doc = new java.io.File(fail);
        Scanner scanner =  new Scanner(doc, "UTF-8");
        while (scanner.hasNextLine()){
            String rida = scanner.nextLine();
            System.out.println(rida);
        }
        scanner.close();
    }

}
