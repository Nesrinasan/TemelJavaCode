class Hayvan {

    public Hayvan() {
        System.out.println("Hayvan Yapilandiricisi");
    }
}

class Yarasa extends Hayvan {

    public Yarasa() {
        System.out.println("Yarasa Yapilandiricisi");
    }
}

class UcanYarasa extends Yarasa {

    public UcanYarasa() {
        System.out.println("UcanYarasa Yapilandiricisi");
    }

    public static void main(String args[]) {
        UcanYarasa uy = new UcanYarasa();
    }
}
