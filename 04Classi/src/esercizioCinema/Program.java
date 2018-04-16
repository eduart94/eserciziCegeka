package esercizioCinema;

public class Program 
{

	public static void main(String[] args) 
	{
		Cinema cinema = new Cinema();
		
		Spettacolo spettacolo = new Spettacolo(1, "la bella addormentata", "02-08-2018");
		Spettacolo spettacolo2 = new Spettacolo(1, "la brutta addormentata", "16-04-2018");
		cinema.aggiungiSpettacolo(spettacolo);
		cinema.aggiungiSpettacolo(spettacolo2);
		
		System.out.println(spettacolo.getTitolo());
		System.out.println(cinema.acquistaBiglietto("la bella addormentata", "02-08-2018"));
		
		for(Spettacolo s : cinema.spettacoliGiornoSpecifico("02-08-2018"))
		{
			System.out.println(s.getTitolo());
		}
		
		for(Spettacolo s : cinema.spettacoloDelGiorno())
		{
			System.out.println(s.getTitolo());
		}
		

	}

}
