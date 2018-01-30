
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapTestIki {


	private static HashMap hm = new HashMap();// dikkat

	public static void main(String args[]) {

		hm.put( "Turkiye", "Ankara" );
		hm.put( "Fransa" , "Paris" );
		hm.put( "Fransa" , "Paris" );
		hm.put( "Fransa" , "Paris" );
		hm.put( "Fransa" , "Paris" );
		hm.put( "Fransa" , "Paris" );
		hm.put( "Yunanistan" , "Atina" );
		hm.put(  null , "Ulke ismi yok" );
		hm.put( "Azerbaycan" , "Baku" );
		hm.put( "Rusya" , "Moskava" );
		hm.put(  "ABC" , null );

		

		Set s =  hm.keySet(); // dikkat
		Iterator ulkeler = s.iterator();
		while (ulkeler.hasNext()) {
			System.out.println( "-->" + ulkeler.next());
		}
		
		System.out.println( "----------");

		Collection c  =  hm.values(); // dikkat
		Iterator baskentler = c.iterator();
		while (baskentler.hasNext()) {
			System.out.println( "-->" + baskentler.next());
		}
        System.out.println( "----------");
        System.out.println( "-->" +  hm.entrySet());



	} 



}
