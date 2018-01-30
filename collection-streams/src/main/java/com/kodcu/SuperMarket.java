
import java.util.ArrayList;

public class SuperMarket {

	public static void main(String args[]) {

		String  meyva1 = "elma";
		Integer i1 = new Integer(4);
		Double  d1 = new Double(5.6);
		String  meyva2  = "portakal";
		String  meyva3  = "mandalina";


		// alis veris basliyor
		ArrayList torba = new ArrayList();
		torba.add(meyva1);
		torba.add(meyva2);
		torba.add(i1);
		torba.add(meyva3);
		torba.add(d1);
		

		// alis veris bitti, kasaya odeme yapma zamani
		for (int i=0; i<torba.size(); i++) {
			String alinan;
           alinan = (String) torba.get(i); // dikkat


            /*Object obj=torba.get(i);   // Cozum bu mu??
           if(obj instanceof String)
           {
               alinan=(String)obj;
           }
            else
           {
               alinan="Gecersiz tip";
           }*/

			System.out.println( alinan + " --> odeme yapildi");
		}
	}
}



