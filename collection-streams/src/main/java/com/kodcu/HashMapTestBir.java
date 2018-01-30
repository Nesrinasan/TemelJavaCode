import java.util.HashMap;

public class HashMapTestBir {
   
    
	private static HashMap hm = new HashMap();// dikkat

    	private static String plakalar[][] = { 
	    {"06", "Ankara"},
	    {"07", "Antalya"},
	    {"41", "Kocaeli"},
	    {"34", "Istanbul"},
	    {"77", "Yalova"}
	};

	
	public static void degerBul(String anahtar) {
	    System.out.println( "-->" + hm.get(anahtar) );
	}


	public static void main(String args[]) {
		
		// HashMap icerisine referanslari atiyoruz
		for (int i=0; i<plakalar.length; i++) {
		    hm.put( plakalar[i][0], plakalar[i][1] );
		}
		
        degerBul("06");
		degerBul("41");
		degerBul("08");
		degerBul("77");

		// HashMap icerisindeki tum elemanlari
		// ekrana bas
		System.out.println( hm );
	}
} 



