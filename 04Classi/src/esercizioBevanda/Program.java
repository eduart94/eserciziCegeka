package esercizioBevanda;

public class Program
{

	public static void main(String[] args)
	{
		Bevanda cocaCola = new Bevanda("coca cola", 30);
		Bevanda fanta = new Bevanda("fanta", 5);
		Bevanda acqua = new Bevanda("acqua", 7);
		
		Distributore uno = new Distributore(25);
		
		uno.addBevanda(cocaCola, 5);
		uno.addBevanda(acqua, 5);
		uno.addBevanda(fanta, 4);
		uno.removeBevanda(fanta, 2);
		
		System.out.println(uno.contabevande("fanta"));
		System.out.println(uno.getDisponobilita());
		System.out.println(fanta.getQuantita());
		
		Bevanda sprite = new Bevanda("sprite");
		sprite.bevi(10);
		System.out.println(sprite.getLiquidoRimanente());
		
		sprite.aggiungiLiquido(5);
		
		System.out.println(sprite.getLiquidoRimanente());

	}

}
