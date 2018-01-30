
import java.util.*;


public class HizTesti4 {

	static final int N = 50000;

	static HashMap hashmap = new HashMap();
	static TreeMap treemap = new TreeMap();
	
	static List anahtarlar = new ArrayList();
	static List degerler = new ArrayList();

	static {
		
		for (int i=0; i<N; i++) {
			Integer anahtar = new Integer(i);
			anahtarlar.add(i, anahtar); // dikkat
			
			Integer deger = new Integer(i+5);
			degerler.add(deger);

			hashmap.put(anahtar, deger);
			treemap.put(anahtar, deger);
		}
	}


	public static long mapTest(Map map) {

		long baslangic = System.currentTimeMillis();

		for (int i = 0; i<N; i++) {
			Integer deger = (Integer) map.get( anahtarlar.get(i) );

			if (deger != degerler.get(i)) {
				System.out.println("! Hata !");
			}
		}

		// varis suresini hesaplayip geri donduruyoruz
		return System.currentTimeMillis() - baslangic;
	}

	public static void main(String args[]) {

		// HashMap icin zaman testini baslatiyoruz

		System.out.println("HashMap zamani  = " + mapTest(hashmap));

		// TreeMap icin zaman testini baslatiyoruz

		System.out.println("TreeMap zamani  = " +  mapTest(treemap));

	}
}

