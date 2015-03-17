//Vajalike pakettide importimine
import java.util.Scanner;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Opetus {
	
	static String fail;
	
	
	    //konstruktori moodi asi faili asikoha saamiseks
	public Opetus(String fail){
	    Failitee = Paths.get(fail);
	  }
	
		  //meetod faili sisu väljastamiseks
	public static void valjastamine() throws Exception {
	    Scanner scanner =  new Scanner(Failitee, ENCODING.name());{
	      while (scanner.hasNextLine()){
	    	  String rida = scanner.nextLine();
	    	  System.out.println(rida);
	      }      
	    scanner.close();
	    }
	    
	  }
	 
	private static Path Failitee;
	private static Charset ENCODING = StandardCharsets.UTF_8;  //kodeering UTF-8st
	  
	} 


