package pr2.pu1;

public class KomplexeZahlKlein2 extends KomplexeZahl {

	public KomplexeZahlKlein2(double realanteil, double imaginaeranteil) throws KZKException {
		super(realanteil, imaginaeranteil);

		if (imaginaeranteil > 10) {
			throw new KZKException();
		}
	}

	@SuppressWarnings("serial")
	public class KZKException extends Throwable {
		@Override
		public String getMessage() {
			return "Die Zahl fuer den imaginaeren Anteil ist zu groﬂ!\nReeller Anteil: " + KomplexeZahlKlein2.this.re();
		}
	}
}
