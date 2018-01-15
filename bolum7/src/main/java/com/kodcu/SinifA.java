package com.kodcu;

public class SinifA {

    public interface A1 {
        public void ekranaBas();
    }  //interface

    public class DahiliSinif1 implements A1 {
        public void ekranaBas() {
            System.out.println("DahiliSinif1.ekranaBas()");
        }
    }  // class DahiliSinif1

    protected class DahiliSinif2 implements A1 {
        public void ekranaBas() {
            System.out.println("DahiliSinif2.ekranaBas()");
        }
    }  // class DahiliSinif2

    class DahiliSinif3 implements A1 {
        public void ekranaBas() {
            System.out.println("DahiliSinif3.ekranaBas()");
        }
    }  // class DahiliSinif3

    private class DahiliSinif4 implements A1 {
        public void ekranaBas() {
            System.out.println("DahiliSinif4.ekranaBas()");
        }
    }  // class DahiliSinif4

    public static void main(String args[]) {
        SinifA.DahiliSinif1 sad1 = new SinifA().new DahiliSinif1();
        SinifA.DahiliSinif2 sad2 = new SinifA().new DahiliSinif2();
        SinifA.DahiliSinif3 sad3 = new SinifA().new DahiliSinif3();
        SinifA.DahiliSinif4 sad4 = new SinifA().new DahiliSinif4();

        sad1.ekranaBas();
        sad2.ekranaBas();
        sad3.ekranaBas();
        sad4.ekranaBas();

        SinifB sb = new SinifB();
        sb.ekranaBas();
    }

}

class SinifB implements SinifA.A1 {
    public void ekranaBas() {
        System.out.println("SinifB.ekranaBas()");
    }
}
