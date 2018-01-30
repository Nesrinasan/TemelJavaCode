
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTestIki {
   


	public static void main(String args[]) {

		float ilkelf1 = 10.89f ;
		Float f1 = new Float(ilkelf1);

		float ilkelf2 = 12.1f ;
		Float f2 = new Float(ilkelf2);
		
		Float f3 = null ; // dikkat

		
		HashSet hs = new HashSet(20, 0.8f);// dikkat
		hs.add(f1);
		hs.add(f2);
		hs.add(f3); // dikkat
		
		for (int i=0; i<26; i++) {
			float fRasgele = ((float) (Math.random()*100));
			Float fNesne = new Float(fRasgele);
			hs.add(fNesne);
		}
		
		System.out.println(hs);
		
	}
} 


