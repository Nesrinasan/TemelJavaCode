
class Xmodel {

    public void sesAc() {
        System.out.println("X model televizyon sesAc()");
    }

    public void sesKapa() {
        System.out.println("X model televizyon sesKapa()");
    }

    public void kanalDegistir() {
        System.out.println("X model televizyon kanalDegistir()");
    }
}

class Ymodel extends Xmodel {

    public void sesAc() {  // iptal etme (override)
        System.out.println("Y model televizyon sesAc()");
    }

    public void sesKapa() { // iptal etme (override)
        System.out.println("Y model televizyon sesKapa()");
    }

    public void kanalDegistir() {  // iptal etme (override)
        System.out.println("Y model televizyon kanalDegistir() ");
    }

    public void teleText() { // kat�lan yeni bir �zellik
        System.out.println("Y model televizyon teleText()");
    }

}

public class Televizyon {
    public static void main(String args[]) {

        // yukari dogru cevirim ( upcasting )
        Xmodel x_model_kumanda = new Ymodel();
        x_model_kumanda.sesAc();
        x_model_kumanda.sesKapa();
        x_model_kumanda.kanalDegistir();

        //!! hata !! , bu kumandanin boyle bir dugmesi yok :)
        // x_model_kumanda.teleText() ;
    }
}

