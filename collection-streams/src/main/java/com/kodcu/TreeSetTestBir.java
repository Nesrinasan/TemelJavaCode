
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetTestBir {

	public static void main(String args[]) {

		String s1 = "Mersin";
		String s2 = "Balikesir";
		String s3 = "Ankara";
		
		String s4 = "Antalya";
		String s5 = "Antalya";
		String s6 = "Antalya";
		String s7 = "Antalya";
		String s8 = "Antalya";
		String s9 = "Antalya";

		String s10 = "Gaziantep";


		TreeSet ts = new TreeSet();// dikkat
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);	
		ts.add(s4);	
		ts.add(s5);	
		ts.add(s6);	
		ts.add(s7);	
		ts.add(s8);	
		ts.add(s9);	
		ts.add(s10);	

		Iterator iterator = ts.iterator();
		while (iterator.hasNext()) {
			System.out.println("--> "+ iterator.next());
		}
	}
} 



