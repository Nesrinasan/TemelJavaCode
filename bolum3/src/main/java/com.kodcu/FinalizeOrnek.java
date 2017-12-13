

public class FinalizeOrnek {

    public static void main(String[] args) {
        FinalizeOrnek f = new FinalizeOrnek();
        System.gc();
        //System.out.println(f.toString());

    }

    protected void finalize() {
        System.out.println(this + " nesnesi yok edilecek. Az sonraa.");
    }
}
