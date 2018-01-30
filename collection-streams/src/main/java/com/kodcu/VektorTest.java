

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Collection;

public class VektorTest {

	public static void main(String[] args) {

		Vector sayilar = new Vector();
		sayilar.add("bir");
		sayilar.add("iki");
		sayilar.add("uc");

		String s = (String)sayilar.get(1);
		if (s != null) {
			System.out.println("---> = "+ s);
		}
	       

		// degerleri aliyoruz
		Enumeration elemanlar = sayilar.elements();
		while (elemanlar.hasMoreElements()) {
		    System.out.println("Degerler : " + elemanlar.nextElement());
		}
	}
}

