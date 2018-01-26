
class YuksekSeviyeliIstisna extends Exception {
	YuksekSeviyeliIstisna(Throwable cause) {
		super(cause);
	}
}

class OrtaSeviyeliIstisna extends Exception {
	OrtaSeviyeliIstisna(Throwable cause) {
		super(cause);
	}
}

class DusukSeviyeliIstisna extends Exception {
}

public class Kisaltma {
	public static void main(String args[]) {
		try {
			a();
		} catch(YuksekSeviyeliIstisna e) {
			e.printStackTrace();
		}
	}
	static void a() throws YuksekSeviyeliIstisna {
		try {
			b();
		} catch(OrtaSeviyeliIstisna e) {
			throw new YuksekSeviyeliIstisna(e);
		}
	}
	static void b() throws OrtaSeviyeliIstisna {
		c();
	}   
	static void c() throws OrtaSeviyeliIstisna {
		try {
			d();
		} catch(DusukSeviyeliIstisna e) {
			throw new OrtaSeviyeliIstisna(e);
		}
	}
	static void d() throws DusukSeviyeliIstisna { 
		e();
	}
	static void e() throws DusukSeviyeliIstisna {
		throw new DusukSeviyeliIstisna();
	}
}



