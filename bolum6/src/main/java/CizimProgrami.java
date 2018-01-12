abstract class Cizim {

    // soyut metod
    public abstract void noktaCiz(int x, int y);

    // soyut olmayan metod
    public void cizgiCiz(int x1, int y1, int x2, int y2) {
        // noktaCiz(x,y); // metodunu kullanarak ekrana cizgi ciz
    }
}


class CepTelefonuCizim extends Cizim {

    // iptal ediyor (override)
    public void noktaCiz(int x, int y) {
        // cep telefonu ekrani icin nokta ciz.....
    }
}

class MonitorCizim extends Cizim {

    // iptal ediyor (override)
    public void noktaCiz(int x, int y) {
        // Monitor ekrani icin nokta ciz.....
    }
}

public class CizimProgrami {
    public void baslat(int x1, int y1, int x2, int y2) {
        // cep telefonunun ekranina cizgi cizmek icin
        Cizim c1 = new CepTelefonuCizim();
        c1.cizgiCiz(x1, y1, x2, y2);

        // Monitor ekranina cizgi cizmek icin
        Cizim c2 = new MonitorCizim();
        c2.cizgiCiz(x1, y1, x2, y2);
    }
}
