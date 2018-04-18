package esercizioPoligonoInterfaccia;

public class Quadrato extends Poligono implements Calcolo{
	private int lato;
	public Quadrato(int _lato) {
		super.numeroLati = 4;
		this.lato = _lato;
		
	}

	@Override
	public double area() {
		double area = this.lato * this.lato;
		return area;
		
	}

	@Override
	public double perimetro() {
		double perimetro = this.numeroLati * this.lato;
		return perimetro;
	}
	
	
}
