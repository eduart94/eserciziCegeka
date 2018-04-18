package esercizioPoligonoInterfaccia;

public class Rettangolo extends Poligono implements Calcolo{
	double base;
	double altezza;
	
	
	public Rettangolo(double _base, double _altezza)
	{
		this.base = _base;
		this.altezza = _altezza;
		super.numeroLati = 4;
	}
	@Override
	public double area() 
	{
		double area = this.base * this.altezza;
		return area;
	}

	@Override
	public double perimetro() 
	{
		double perimetro = (this.base + this.altezza)*2;
		return perimetro;
	}
	
	

	
}
