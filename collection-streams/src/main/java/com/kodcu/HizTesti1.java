
import java.util.*;

public class HizTesti1 {

	static final int N = 10000;

	static List degerler;

	// artan Integer degerlerinden List 
	// sinifi tipinde nesne olusturuluyor
	 

	static {

		Integer deg[] = new Integer[N];

		Random rsgl = new Random();

		for (int i = 0, suAnkiDeger = 0; i < N; i++) {
			deg[i] = new Integer(suAnkiDeger);
			suAnkiDeger += rsgl.nextInt(100) + 1;
		}

		degerler = Arrays.asList(deg);
	}

	
	// torba icerisindeki her elemana 
	// ikili arama (binary search) kullanilarak
	// erisiliyor

	static long testiBaslat(List lst) {
		long basla = System.currentTimeMillis();

		for (int i = 0; i < N; i++) {

			// ikili arama (binary search) kullanilarak
			// torba icerisindeki her elemana erisiliyor-Dikkat

			int indx = Collections.binarySearch( lst, degerler.get(i) );

			// ikili arama (binary search) sonucunda
			// bulunan deger acaba dogru mu ?

			if (indx != i) { // dogru degilse ekrana hata mesajini bas
				System.out.println("*** Hata ***\n");
			}
		}

		return System.currentTimeMillis() - basla;
	}

	public static void main(String args[]) {

		//  ArrayList sinifini test islemi basliyor

		System.out.println("ArrayList zamani = " +
						   testiBaslat(new ArrayList(degerler)));

		// LinkedList sinifini test islemi basliyor

		System.out.println("LinkedList zamani = " +
						  testiBaslat(new LinkedList(degerler)));
	}
}
