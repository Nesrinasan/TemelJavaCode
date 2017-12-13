public class DiziElemanlariGosterimBir {

    public static void main(String args[]) {

        double[] d = {2.1, 3.4, 4.6, 1.1, 0.11 };
        String[] s = {"defter", "kalem", "sarman", "tekir", "boncuk"};

        // double tipindeki dizimizi ekrana bastiriyoruz
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[" + i + "] = " + d[i]);
            //System.out.println("d["+78+"] = " + d[78] ); // ! Hata !
        }
        System.out.println("---------------");
        // String tipindeki dizimizi ekrana bastiriyoruz
        for (int x = 0; x < s.length; x++) {
            System.out.println("s[" + x + "] = " + s[x]);
            // System.out.println("s["+78+"] = " + s[78] );  // ! Hata !
        }
    }
}

