package esercizioFormeGeometriche;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	
	// costruttore 
	public Rettangolo(double base, double altezza) {
		this.altezza=altezza;
		this.base=base;
	}
	// secondo costruttore senza però argomenti
	public Rettangolo() {
		
	}
	// metodo perimetro
	public double perimetro(double altezza, double base) {
		double result;
		result = (altezza + base) * 2;
		return result;
	}
	// metodo area
	public double area(double base, double altezza) {
		double result;
		result = base * altezza;
		return result;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base=base;
	}
	
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
}
