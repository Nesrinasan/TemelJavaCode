
import java.util.*;


public class HizTesti3 {

	static final int N = 60000;

	static Map map = new HashMap();
	
	static List anahtarlar = new ArrayList();
	static List degerler = new ArrayList();

	static {
		
		for (int i=0; i<N; i++) {
			Integer anahtar = new Integer(i);
			anahtarlar.add(i, anahtar); // dikkat
			
			Integer deger = new Integer(i+5);
			degerler.add(deger);

			map.put(anahtar, deger);
		}
		
	}
   

	public static long listTest() {

		long baslangic = System.currentTimeMillis();

		
		for (int i = 0; i<N; i++) {
			int indeks = Collections.binarySearch(anahtarlar, anahtarlar.get(i));
			
			if (indeks != i) {
				System.out.println("! List Hata !");
			}
		}

		// varis suresini hesaplayip geri donduruyoruz
		return System.currentTimeMillis() - baslangic;
	}


	public static long mapTest() {

		long baslangic = System.currentTimeMillis();

		for (int i = 0; i<N; i++) {
			Integer deger = (Integer) map.get( anahtarlar.get(i) );

			if (deger != degerler.get(i)) {
				System.out.println("! Map Hata !");
			}
		}

		// varis suresini hesaplayip geri donduruyoruz
		return System.currentTimeMillis() - baslangic;
	}

	public static void main(String args[]) {

		// ArrayList icin zaman testini baslatiyoruz

		System.out.println("ArrayList zamani  = " + listTest());

		// HashMap icin zaman testini baslatiyoruz

		System.out.println("HashMap zamani  = " +  mapTest());

	}
}
