import java.util.Random;

public class SicaklikAlgila {
	private Random rand = new Random(); //random class instance ý
   private  int upperbound = 50;
       //0 ile 49 arasi deðer uretir
  private   int int_random = rand.nextInt(upperbound); 
     public void sicaklikOku()
     {
    	String s =String.valueOf(int_random);
    	System.out.printf("Sicaklik Degeri  = "+s);
    }
}
