package introspeccionexemple;

public class Objeto {

	public int publica=15;
	protected int Metal;
	protected int Cristal;
	protected int Deuterio;
	protected short shortexemple;

	

	public short getShortexemple() {
		return shortexemple;
	}

	public void setShortexemple(short shortexemple) {
		this.shortexemple = shortexemple;
	}

	public Objeto() {

	}

	public Objeto(int metal, int cristal, int deuterio) {

		this.Metal = metal;
		this.Cristal = cristal;
		this.Deuterio = deuterio;
		this.shortexemple = (short) metal;
		
	}

	public int getMetal() {
		return Metal;
	}

	public void setMetal(int metal) {
		Metal = metal;
	}

	public int getCristal() {
		return Cristal;
	}

	public void setCristal(int cristal) {
		Cristal = cristal;
	}

	public int getDeuterio() {
		return Deuterio;
	}

	public void setDeuterio(int deuterio) {
		Deuterio = deuterio;
	}

}
