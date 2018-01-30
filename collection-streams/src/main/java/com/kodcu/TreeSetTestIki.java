
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Iterator;


public class TreeSetTestIki {

	public static void main(String args[]) {

		Integer i1 = new Integer(56);
		Integer i2 = new Integer(17);
		Integer i3 = new Integer(115);
		Integer i4 = new Integer(2);
		Integer i5 = new Integer(85);

		ArrayList al = new ArrayList();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		al.add(i5);

		TreeSet ts = new TreeSet(al);// dikkat
		// ts.add(null); // !hata!
		
		Iterator iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println("--> "+ iterator.next());
		}
	}
} 




