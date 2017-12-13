public class OtomatikArtveAz {

    static void ekranaYaz(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int i = 1;
        ekranaYaz("i : " + i);
        ekranaYaz("++i : " + ++i); // onek arttirim
        ekranaYaz("i++ : " + i++); // sonek -arttirim
        ekranaYaz("i : " + i);
        ekranaYaz("--i : " + --i); // onek-azaltim
        ekranaYaz("i-- : " + i--); // sonek-azaltim
        ekranaYaz("i : " + i);
    }
}

class Test2 {

    static void hesapla() {
        OtomatikArtveAz.ekranaYaz("selam");
    }
}





