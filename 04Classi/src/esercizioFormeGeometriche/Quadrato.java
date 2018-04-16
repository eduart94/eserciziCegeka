package esercizioFormeGeometriche;

public class Quadrato {
	
		private double lato;
		
	// costruttore di un quadrato con argomento lato
		public Quadrato(double lato) {
			this.lato=lato;
		}
		
	// costruttore di un quadrato senza argomenti
		public Quadrato() {
			
		}
		
	// metodo per il calcolo del perimetro
		public double perimetro(double lato) {
			double result;
			result = lato * 4;
			return result;
		}
		
	// metodo per il calcolo dell'area
		public double area(double lato) {
			double result;
			result = lato * lato;
			return result;
		}
	// metodi get and set per l'incapsulamento
		
		public double getLato() {
			return lato;
		}
		
		public void setLato(double lato) {
			this.lato=lato;
		}
}
