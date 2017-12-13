class Harf {
    char c;
}

public class Pas {

    static void f(Harf h) {

        h.c = 'z';
    }

    public static void main(String[] args) {

        Harf x = new Harf();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);

        f(x);

        System.out.println("2: x.c: " + x.c);
    }
}
