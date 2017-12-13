public class HayvanlarAlemi {

    String isimler[][][]  ;  
	
    public HayvanlarAlemi() {
	   isimler = new String[2][2][3] ;
	   veriAta();
    }
    public void veriAta() {
	 isimler[0][0][0] = "aslan" ;
	 isimler[0][0][1] = "boz AyI" ;
	 isimler[0][0][2] = "ceylan";

	 isimler[0][1][0] = "deniz AnasI" ;
	 isimler[0][1][1] = "essek" ;
	 isimler[0][1][2] = "fare"  ;

	 isimler[1][0][0] = "geyik" ;
	 isimler[1][0][1] = "hamsi" ;
	 isimler[1][0][2] = "inek" ;

	 isimler[1][1][0] = "japon baligi" ;;
	 isimler[1][1][1] = "kedi"  ;
	 isimler[1][1][2] = "lama" ;
         ekranaBas() ;
    }

    public void ekranaBas() {
	for (int x = 0 ; x < isimler.length ; x++) {
	    for (int y = 0 ; y < isimler[x].length ; y++) {
			for (int z = 0 ; z < isimler[x][y].length ; z ++) {
				System.out.println("isimler["+x+"]["+y+"]["+z+"]  =" + isimler[x][y][z]);
			}
	    }
	}
    }
    public static void main(String args[]) {
	HayvanlarAlemi ha = new HayvanlarAlemi();
    } 
}
