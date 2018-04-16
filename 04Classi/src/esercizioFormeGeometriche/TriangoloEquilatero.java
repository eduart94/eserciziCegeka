package esercizioFormeGeometriche;

public class TriangoloEquilatero {
	
	private double lato;
	
	public TriangoloEquilatero(double lato) {
		this.lato=lato;
	}
	public TriangoloEquilatero() {
		
	}
	
	public double perimetro(double lato) {
		double perimetro = lato * 3;
		return perimetro;
	}
	public double area(double lato) {
		double area = (lato * lato)/2;
		return area;
	}
	
	public double getLato() {
		return lato;
	}
	public void setLato(double lato) {
		this.lato=lato;
	}
}
