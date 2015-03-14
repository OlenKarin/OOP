
import java.util.Scanner;

public class NumbridSonadeks {
    public static void tase1(String[] soovitus) {
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
            if (!taht.equals("EXIT")) {
                //kontrollin, kas on õige või vale
                if (arv == 0) {
                    Peaklass.nul.kontrollEsimene(taht, arv);
                } else if (arv == 1) {
                    Peaklass.one.kontrollEsimene(taht, arv);
                } else if (arv == 2) {
                    Peaklass.two.kontrollEsimene(taht, arv);
                } else if (arv == 3) {
                    Peaklass.three.kontrollEsimene(taht, arv);
                } else if (arv == 4) {
                    Peaklass.four.kontrollEsimene(taht, arv);
                } else if (arv == 5) {
                    Peaklass.five.kontrollEsimene(taht, arv);
                } else if (arv == 6) {
                    Peaklass.six.kontrollEsimene(taht, arv);
                } else if (arv == 7) {
                    Peaklass.seven.kontrollEsimene(taht, arv);
                } else if (arv == 8) {
                    Peaklass.eight.kontrollEsimene(taht, arv);
                } else if (arv == 9) {
                    Peaklass.nine.kontrollEsimene(taht, arv);
                }
            } else {
                System.out.println("Tubli, et harjutasid!");
                break;
            }

        }

    }

    public static void tase2(String[] soovitus) {
        System.out.println("Harjutame kirjutama sõnu, mis sisaldavad õiget tähte!" + "\n" +
                "Siin tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks vaid ÜHTE foneetilist tähte!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT! :)");

        while (true) {
            //väljastan suvalise arvu 0-9-ni
            int arv = (int) Math.round(Math.random() * 9 + 0);
            System.out.println("Number: " + arv);

            //küsin kasutajalt, mis tähega on tegu
            Scanner scan = new Scanner(System.in);
            System.out.print("Sisesta sõna: ");
            String sona = scan.nextLine();

            if (!sona.equals("EXIT")) { //anname võimaluse programmist ka lahkuda
                boolean v = true;
                if (sona.length() > 1) {
                    sona = sona.toLowerCase().replaceAll("[aceiouõüöäq]", "");

                    //kontrollin, kas sõna sisaldab piisavalt tähti
                    if (sona.length() == 1) {
                        v = taheÕigsus(arv, sona); //kontrollin, kas on täht õige või vale
                    } else {
                        v = false;
                    }
                    if (v) {
                        System.out.println("Õige!");
                    } else {
                        System.out.println("Vale!");
                    }
                } else {
                    System.out.println("Sisestada tuleb sõna!");
                }
                //sõna soovitus ka
                System.out.println("sõnaks sobib: "+soovitus[arv]);
            }  else {
                System.out.println("Aitäh, et harjutasid! :)");
                break;
            }


        }
    }


    public static void tase3(String[] soovitus) {
        System.out.println("Harjutame kirjutama sõnu, mis sisaldavad õigeid tähti!" + "\n" +
                "Sisestada tuleb sõna, mis sisaldab kahte foneetilist tähte, mis on ka õiges järjekorras. " + "\n" +
                "Tuleb silmas pidada, et sõna oleks tähendusega ning sisaldaks tõepoolest KAHTE foneetilist tähte!" + "\n" +
                "Kui soovite harjutamise lõpetada, siis trükkige EXIT!");

        while (true) {
            //väljastan suvalise arvu 0-9-ni
            int arv1 = (int) Math.round(Math.random() * 8 + 1);
            int arv2 = (int) Math.round(Math.random() * 9 + 0);
            String number = String.valueOf(arv1) + String.valueOf(arv2);
            System.out.println("Number: " + number);

            //küsin kasutajalt, mis tähega on tegu
            Scanner scan = new Scanner(System.in);
            System.out.print("Sisesta sõna: ");
            String sona = scan.nextLine();

            if (!sona.equals("EXIT")) { //anname võimaluse programmist ka lahkuda
                boolean v = true;
                boolean k = true;
                if (sona.length() > 1) {
                    sona = sona.toLowerCase().replaceAll("[aceiouõüöäq]", "");
                    String[] taht = sona.split("");
                    //kontrollin, kas sõna sisaldab piisavalt tähti
                    if (taht.length == 2) {
                        v = taheÕigsus(arv1, taht[0]); //kontrollin, kas on täht õige või vale
                        k = taheÕigsus(arv2, taht[1]);
                    } else {
                        v = false;
                    }
                    if (v&&k) {
                        System.out.println("Õige!");
                    } else {
                        System.out.println("Vale!");
                    }
                } else {
                    System.out.println("Sisestada tuleb sõna!");
                }
                //soovitus
                System.out.println("sõnaks sobib: "+soovitus[Integer.parseInt(String.valueOf(arv1) + String.valueOf(arv2))]);
            }  else {
                System.out.println("Aitäh, et harjutasid! :)");
                scan.close();
                break;
            }


        }
    }



    public static boolean taheÕigsus(int arv, String taht) {
        if (arv == 0) {
            return Peaklass.nul.kontrollTeine(taht, arv);
        } else if (arv == 1) {
            return Peaklass.one.kontrollTeine(taht, arv);
        } else if (arv == 2) {
            return Peaklass.two.kontrollTeine(taht, arv);
        } else if (arv == 3) {
            return Peaklass.three.kontrollTeine(taht, arv);
        } else if (arv == 4) {
            return Peaklass.four.kontrollTeine(taht, arv);
        } else if (arv == 5) {
            return Peaklass.five.kontrollTeine(taht, arv);
        } else if (arv == 6) {
            return Peaklass.six.kontrollTeine(taht, arv);
        } else if (arv == 7) {
            return Peaklass.seven.kontrollTeine(taht, arv);
        } else if (arv == 8) {
            return Peaklass.eight.kontrollTeine(taht, arv);
        } else if (arv == 9) {
            return Peaklass.nine.kontrollTeine(taht, arv);
        }else{
            return false;
        }
    }
}


