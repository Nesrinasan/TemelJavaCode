
class Bocek {

    static int x1 = ekranaBas("static Bocek.x1 ilk deger verildi"); //1
    int a = 10;
    int b;

    Bocek() {
        ekranaBas("a = " + a + ", b = " + b); //4
        b = 17;
    }

    static int ekranaBas(String s) {
        System.out.println(s);
        return 18;
    }
}

public class Bocekcik extends Bocek {


    int x2 = ekranaBas("static Bocekcik.x2 ilk deger verildi"); //2
    static int k = ekranaBas("Bocekcik.k ilk deger verildi"); //5

    Bocekcik() {
        ekranaBas("k = " + k); //6
        ekranaBas("b = " + b); //6
    }

    public static void main(String[] args) {
        ekranaBas("Bocekcik - basla.. "); //3
        Bocekcik b = new Bocekcik(); // -> 4
    }
} 