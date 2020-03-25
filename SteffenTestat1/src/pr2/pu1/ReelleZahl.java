package pr2.pu1;

public class ReelleZahl extends KomplexeZahl {

	public ReelleZahl(double realanteil) {
		super(realanteil, 0.0);
	}

	@Override
	public String toString() {
		return String.valueOf(this.re());
	}
}
