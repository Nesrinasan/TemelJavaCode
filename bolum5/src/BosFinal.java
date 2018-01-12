class Kalem {
}

public class BosFinal {

    final int a = 0;
    final int b; // Bos final
    final Kalem k; // Blank final nesne alani

    // Bos final alanlar ilk degerlerini
    // yapilandiricalarda icerisinde alirlar

    BosFinal() {
        k = new Kalem();
        b = 1; // bos final alanina ilk degeri ver
    }

    BosFinal(int x) {
        b = x; // bos final alanina ilk degeri ver
        k = new Kalem();
    }

    public static void main(String[] args) {
        BosFinal bf = new BosFinal();
    }

} 
