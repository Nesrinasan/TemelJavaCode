
public class FinalParametre {

    public static int topla(final int a, final int b) {

        // a = 5 // ! Hata !
        // b = 9 // ! Hata !
        return a + b;
    }

    public static void main(String args[]) {

        if ((args.length != 2)) {
            System.out.println("Eksik veri Girildi");
            System.exit(-1); // Uygulamayi sonlandir
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sonuc = FinalParametre.topla(a, b);
        System.out.println("Sonuc = " + sonuc);
    }
}
