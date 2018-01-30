
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTestBir {

    public static void main(String args[]) {
    
	    String s1 = "Ankara";
	    String s2 = "Kocaeli";
	    String s3 = "EskiSehir";
	    String s4 = "Sakarya";
	    String s5 = "Bursa";
	    

	    ArrayList sehirler = new ArrayList();
	    sehirler.add(s1);
	    sehirler.add(s2);
	    sehirler.add(s3);
	    sehirler.add(s4);
	    sehirler.add(s5);
	    
	    
	    Iterator iterator = sehirler.iterator(); // dikkat
	    while (iterator.hasNext()) {
		String sehirIsmi = (String) iterator.next(); // dikkat
		if (sehirIsmi.equals("Sakarya")) {
		    iterator.remove(); // silme islemi
		}
		System.out.println(" Sehir : " + sehirIsmi);
	    }
	    
	    // silme islemi acaba gerceklesmi mi ? 
	     System.out.println("silme islemi acaba gerceklesmi mi ?");
	    iterator = sehirler.iterator(); // dikkat
	    while (iterator.hasNext()) {
		String sehirIsmi = (String) iterator.next(); // dikkat
		System.out.println(" Sehir : " + sehirIsmi);
	    }
    }
}

