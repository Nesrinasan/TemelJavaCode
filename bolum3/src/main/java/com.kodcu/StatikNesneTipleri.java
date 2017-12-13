public class  StatikNesneTipleri {
   static String s ; 
   
  public static void main(String args[]) {
	StatikNesneTipleri snt = new StatikNesneTipleri();
	System.out.println("s = " + snt.s );
	// snt.s = snt.s.trim(); //hata
  }
}



