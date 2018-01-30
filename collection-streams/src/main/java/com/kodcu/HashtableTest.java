

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Collection;

public class HashtableTest {

	public static void main(String[] args) {

		Hashtable sayilar = new Hashtable();
		sayilar.put("bir", new Integer(1));
		sayilar.put("iki", new Integer(2));
		sayilar.put("uc",  new Integer(3));

		Integer s = (Integer)sayilar.get("iki");
		if (s != null) {
			System.out.println("iki = "+ s);
		}

		// anahtarlari aliyoruz
		Enumeration enumeration = sayilar.keys();
		while (enumeration.hasMoreElements()) {
		    System.out.println("Anahtarlar " + enumeration.nextElement());
		}

		// degerleri aliyoruz
		Collection c = sayilar.values();
		Iterator iterator = c.iterator();
		while (iterator.hasNext()) {
		    System.out.println("Degerler " + iterator.next());
		}
	}
}
