import java.util.Arrays;

public class NesneTipSiralama {

	public static void ekranaBas( Object[] dizi) {

		System.out.println("-------------------");
		for (int i = 0 ; i < dizi.length ; i ++) {
			System.out.println("dizi["+i+"] = " + dizi[i] );
		}
	}

	public static void main(String args[]) {

		String[] ornekStringDizisi = { 
		    "CPU",
		    "AnaKart",
		    "Monitor",
		    "Fare",
		    "Klavye",
		    "Fan"} ;

		ekranaBas(ornekStringDizisi);
		Arrays.sort( ornekStringDizisi ) ; // dikkat
		ekranaBas(ornekStringDizisi);
	}
}

