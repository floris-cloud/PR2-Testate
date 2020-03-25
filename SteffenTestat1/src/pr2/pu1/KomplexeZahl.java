package pr2.pu1;

import pr2.pu1.KomplexeZahlKlein2.KZKException;

public class KomplexeZahl {

	private final double realanteil;
	private final double imaginaeranteil;

	public double re() {
		return this.realanteil;
	}

	public double im() {
		return this.imaginaeranteil;
	}

	public KomplexeZahl(double realanteil, double imaginaeranteil) {
		this.realanteil = realanteil;
		this.imaginaeranteil = imaginaeranteil;
	}

	@Override
	public String toString() {
		return this.realanteil + " + " + this.imaginaeranteil + "i";
	}

	public KomplexeZahl add(KomplexeZahl komplexeZahl) {
		return new KomplexeZahl((this.realanteil + komplexeZahl.re()), (this.imaginaeranteil + komplexeZahl.im()));
	}

	public static KomplexeZahl add(KomplexeZahl komplexeZahl1, KomplexeZahl komplexeZahl2) {
		return new KomplexeZahl((komplexeZahl1.re() + komplexeZahl2.re()), (komplexeZahl1.im() + komplexeZahl2.im()));
	}

	public KomplexeZahl prod(KomplexeZahl komplexeZahl) {
		return new KomplexeZahl((this.realanteil * komplexeZahl.re() - this.imaginaeranteil * komplexeZahl.im()),
				(this.realanteil * komplexeZahl.im() + this.imaginaeranteil * komplexeZahl.re()));
	}

	public static KomplexeZahl prod(KomplexeZahl komplexeZahl1, KomplexeZahl komplexeZahl2) {
		return new KomplexeZahl((komplexeZahl1.re() * komplexeZahl2.re() - komplexeZahl1.im() * komplexeZahl2.im()),
				(komplexeZahl1.re() * komplexeZahl2.im() + komplexeZahl1.im() * komplexeZahl2.re()));
	}

	public static void main(String[] args) {
		KomplexeZahl x = new KomplexeZahl(2.5, 4.5);
		System.out.println("x = " + x.toString());
	}
}
