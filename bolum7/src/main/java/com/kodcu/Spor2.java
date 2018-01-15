package com.kodcu;

interface BuzUstundeKayabilme  {
	  public void buzUstundeKay();
}

interface SutAtabilme  {
	  public void sutAt(); 
}


class  SportmenMehmet implements  BuzUstundeKayabilme , SutAtabilme {

    public void buzUstundeKay() {
	System.out.println("SportmenMehmet buz ustunde kayiyor");
    }

    public void sutAt() {
	System.out.println("SportmenMehmet sut atiyor");
    }
}
