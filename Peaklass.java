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


    public static void main(String[] args) throws Exception{

        //Küsin kas soovitakse tutvuda õpetusega
        System.out.println("Tere! Olete sisenenud ühe äärmiselt kasuliku mälutehnika" +
                " õppimise ja harjutamise keskkonda! :) ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Soovite tutvuda õpetusega? (jah/ei): ");
        String vastus = scan.nextLine();
        if(vastus.equals("jah")){
            //õpetuse saamise asi
            Opetus.instructions("src/opetus_sissejuhatus.txt");
            System.out.print("Edasi minemiseks vajuta ENTER");
            Opetus.instructions("C:/Users/Karin/IdeaProjects/MY Projects/src/foneetiline_tahestik.txt");
            System.out.print("Edasi minemiseks vajuta ENTER");
            Opetus.instructions("C:/Users/Karin/IdeaProjects/MY Projects/src/numbrite_teisendamine.txt");

        }else {
            System.out.println("Hästi! Järgmisena liigume harjutamise juurde. ");
        }
        /*while(true) {
            System.out.println();
            System.out.print("Valige harjutamise TASE (1,2,3,4) või kui soovite lõpetada (5): ");
            int tase = scan.nextInt();

                if(tase==1) {
                    System.out.println();
                    System.out.println();
                    NumbridSonadeks.tase1(primaryStage, stseen1);
                }
                else if(tase==2) {
                    System.out.println();
                    System.out.println();
                    NumbridSonadeks.tase2();
                }
                else if(tase==3) {
                    System.out.println();
                    System.out.println();
                    NumbridSonadeks.tase3();
                }
                else if(tase==4) {
                    System.out.println();
                    System.out.println();
                    Numbristik.jätaMeelde();
                } else{
                    System.out.println();
                    System.out.println("Tubli töö!");
                    break;
            }

        }*/



    }


}
