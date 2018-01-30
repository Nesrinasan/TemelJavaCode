

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public class TreeMapTestBir {

	private static TreeMap tm = new TreeMap();

	public static void main(String args[]) {

		tm.put( "Turkiye", "Ankara" );
		tm.put( "Fransa" , "Paris" );
		tm.put( "Fransa" , "Paris" );
		tm.put( "Fransa" , "Paris" );
		tm.put( "Fransa" , "Paris" );
		tm.put( "Fransa" , "Paris" );
		tm.put( "Yunanistan" , "Atina" );
		//tm.put(  null , "Ulke ismi yok" ); // ! Hata !
		tm.put( "Azerbaycan" , "Baku" );
		tm.put( "Rusya" , "Moskava" );
		tm.put(  "ABC" , null );



		Set s =  tm.keySet(); // dikkat
		Iterator ulkeler = s.iterator();
		while (ulkeler.hasNext()) {
			System.out.println( "-->" + ulkeler.next());
		}

		System.out.println( "----------");

		Collection c  =  tm.values(); // dikkat
		Iterator baskentler = c.iterator();
		while (baskentler.hasNext()) {
			System.out.println( "-->" + baskentler.next());
		}
	} 
}
