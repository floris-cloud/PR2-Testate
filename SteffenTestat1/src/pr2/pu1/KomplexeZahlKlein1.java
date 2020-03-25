package pr2.pu1;

public class KomplexeZahlKlein1 extends KomplexeZahl {

	public KomplexeZahlKlein1(double realanteil, double imaginaeranteil) throws Exception {
		super(realanteil, imaginaeranteil);

		if (this.im() > 10) {
			throw new Exception("Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + this.re());
		}
	}
}
