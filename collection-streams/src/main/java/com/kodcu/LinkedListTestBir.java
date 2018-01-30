
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListTestBir {

	public static void main(String args[]) {

		
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		Integer i4 = new Integer(4);
		


		// alis veris basliyor
		LinkedList torba = new LinkedList();
		torba.add(i1);
		torba.add(i2);
		torba.addFirst(i3);
		torba.addLast(i4);
		
		
		Iterator iterator = torba.iterator();
		while (iterator.hasNext()) {
		    Integer i = (Integer)iterator.next();
		    System.out.println("-->"  + i);
		}
		
	}
}




