
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTestBir {


	public static void ekranaBas(Set s) {

		Iterator iterator = s.iterator();
		while (iterator.hasNext() ) {
			Object nesne = iterator.next();
			if (nesne instanceof String) {
				// otomatik olarak String nesnesine donusuyor
				System.out.println("--> "+ nesne );
			} else if (nesne instanceof Double) {
				System.out.println("--> "+ (Double) nesne );
			} else {
				System.out.println("Torbadan tanimlanamayan bir nesne cikti :( " );
			}
			
		}
	}


	public static void main(String args[]) {

		double ilkeld1 = 2.33 ;
		Double d1 = new Double(ilkeld1);

		double ilkeld2 = 5.89 ;
		Double d2 = new Double(ilkeld2);

		double ilkeld3 = 1.29 ;
		Double d3 = new Double(ilkeld3);

		double ilkeld4 = 1.899 ;
		Double d4 = new Double(ilkeld4);

		double ilkeld5 = 0.49 ;
		Double d5 = new Double(ilkeld5);

		// d5 == d6 dikkat
		double ilkeld6 = 0.49 ;
		Double d6 = new Double(ilkeld6);

		String s1 = "Java ve JavaScript birbirinden farkli seylerdir !!" ;
		
		HashSet hs = new HashSet();// dikkat

		hs.add(d1);
		hs.add(d2);
		hs.add(d3);
		hs.add(d4);
		hs.add(d5);
		hs.add(d6);
		hs.add(s1);
		
		ekranaBas(hs);

    }
} 

