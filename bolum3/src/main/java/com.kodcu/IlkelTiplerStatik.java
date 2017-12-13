public class  IlkelTiplerStatik {

  static boolean mantiksal_deger;
  static char krakter_deger;
  static byte byter_deger;
  static short short_deger;
  static int int_deger;
  static long long_deger;
  static float float_deger;
  static double double_deger;
  
  public void ekranaBas() {
     System.out.println("Veri Tipleri           Ilk Degerleri");
     System.out.println("static boolean        " + mantiksal_deger );
     System.out.println("static char           [" + krakter_deger + "] "+ (int)krakter_deger ) ; 
     System.out.println("static byte           " + byter_deger );
     System.out.println("static short          " + short_deger );
     System.out.println("static int            " + int_deger );
     System.out.println("static long           " + long_deger );
     System.out.println("static float          " + float_deger );
     System.out.println("static double         " + double_deger);
  }

  public static void main(String args[]) {
	new IlkelTiplerStatik().ekranaBas();
	/*     
	       // yukaridaki ifade yerine 
	       // asagidaki ifadeyi de kullanabilirsiniz.
	       IlkelTiplerStatik its = new IlkelTiplerStatik();
	       its.ekranaBas();
	*/
  }
}

