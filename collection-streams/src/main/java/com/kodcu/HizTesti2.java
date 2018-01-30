import java.util.*;

    public class HizTesti2 {
        static final int N = 50000;

        //  torbanin icerisine N adet nesneyi atmak
	//  ne kadar surer
        static long testiBaslat(List lst) {
            long start = System.currentTimeMillis();

            Object nesne = new Object();

            for (int i = 0; i < N; i++) {
                lst.add(0, nesne);
            }

            return System.currentTimeMillis() - start;
        }

        public static void main(String args[]) {

           //  ArrayList sinifini test islemi basliyor

            System.out.println(
                "ArrayList zamani = " +
                testiBaslat(new ArrayList()));

            // LinkedList sinifini test islemi basliyor

            System.out.println(
                "LinkedList zamani = " +
                testiBaslat(new LinkedList()));
        }
    } 
