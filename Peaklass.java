/**
 * Created by Karin on 9.03.2015.
 */
import java.util.Scanner;

public class Peaklass {
    static Foneetiline nul = new Foneetiline("n",0);
    static Foneetiline one = new Foneetiline("l",1);
    static Foneetiline two = new Foneetiline("k,g",2);
    static Foneetiline three = new Foneetiline("m",3);
    static Foneetiline four = new Foneetiline("t",4);
    static Foneetiline five = new Foneetiline("v,w,f",5);
    static Foneetiline six = new Foneetiline("p,b",6);
    static Foneetiline seven = new Foneetiline("s",7);
    static Foneetiline eight = new Foneetiline("r",8);
    static Foneetiline nine = new Foneetiline("j,h,d",9);


    public static void main(String[] args){
        String[] soovitus = {"nui","luu","kuu","ma","Tai","vai","puu","sai","rai",
                "jää","Lina, laine","Luule, leil","Luuk,leek, lõug",
                "Liim, laama, leem","Laut, laat", "Liiv, laava, laev",
                "Luup, laup, leib","Leesi, loos","Loor, Laar, leer",
                "Luud, lood, laud ","Kana, kaan, küna ","Keel, kaal, kiil, kali",
                "Kiik, kook, köök","Kama","Koot, kuut","Kaev","Keep, kiip, kabe ",
                "Köis, küüs, Kais", "Kari, kuur, karu ","Giid, gaid, koda ",
                "Muna, miin ","Male, muul ","Mõõk, magu ","Muumia, maim ",
                "Mõte","Movie","Amööb","Moos, mais ","Muru ","Madu, mood, muda ",
                "Tina, Taani","Talu, tool","Tigu, tõke, tiik","Tuum","Tita, tuut",
                "Tuvi","Teip, tibi","Toos","Tüür, taara, tõru","Teed, taud, tädi",
                "Vein, viin","Viiul, viil, vaal","Vaik","Vaim",
                "Võti, viit, vaat, vööt","WiFi (– ruuter)","V.I.P, vibu",
                "Vaas antiik, Võsa, veis","Vaarao,vari, veri, vöör","Vaha, voodi",
                "Paun, peni","Palee","Piik, paak","Piim, puuma, pime",
                "Paat, piit, peet","Päev","Piip","Pesa, pisa, põis, puus",
                "Puur, puri","Pada, padi, pöid, pide","Saan, seen",
                "Siil, sõel","Saag","Sumo, seeme","Aste, sete, osuti",
                "Šeif, savi","Seep, saba","Uss",
                "Sari, saar","Süda","Ruun","Raal, rool","Riik, röga, rauk",
                "Rooma, arm","Riit","Riiv (toidu, ukse), reiv","Raba, urb",
                "Roos","Urr","Reha, raha, raadio","Hein, hani","Huul",
                "Hoki, juga","Aadam, daim","Jeti","Haav, ahv","Hape, habe",
                "Hiis","Hiir","Haud"};

        //Küsin kas soovitakse tutvuda õpetusega
        System.out.println("Tere! Olete sisenenud ühe äärmiselt kasuliku mälutehnika" +
                "õppimise ja harjutamise keskkonda! :) ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Soovite tutvuda õpetusega? (jah-1/ei-2): ");
        int vastus = scan.nextInt();
        if(vastus==1){
            //õpetuse saamise asi
        }
        scan.close();
        System.out.println("Hästi! Järgmisena liigume harjutamise juurde. ");

        while(true) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Valige harjutamise TASE (1,2,3) või kui soovite lõpetada (4): ");
            int tase = scan.nextInt();
            switch (tase) {
                case 1:
                    NumbridSonadeks.tase1(soovitus);
                case 2:
                    NumbridSonadeks.tase2(soovitus);
                case 3:
                    NumbridSonadeks.tase3(soovitus);
                case 4:
                    System.out.println("Tubli töö!");
                    scan1.close();
            }
        }






    }


}
