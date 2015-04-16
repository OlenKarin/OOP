import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Karin on 15.04.2015.
 */
public class Aeg {
    public static Date startAeg;
    public static Date lõppAeg;

    public Aeg(Date startAeg, Date lõppAeg){
        this.startAeg = startAeg;
        this.lõppAeg = lõppAeg;
    }

   public static String ajaMõõtmine() {
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date d1;
        Date d2;
        long d= 0;
       String dSec= "";
       String dMin = "";
       String dH = "";


       try {
            d1 = date.parse(date.format(startAeg));
            d2 = date.parse(date.format(new Date()));

            //in milliseconds
            d = d2.getTime() - d1.getTime();

            dSec = String.valueOf(d / 1000 % 60);
            dMin = String.valueOf(d / (60 * 1000) % 60);
            dH = String.valueOf(d / (60 * 60 * 1000) % 24);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return dH+"h "+dMin+"min "+dSec+"s";
    }
}
