package esercizioMagazzino;

public class Program {

	public static void main(String[] args) {
		Articolo maglia = new Articolo(15, "str123", 5);
		Magazzino magazzino = new Magazzino();
		magazzino.rifornisciArticolo(maglia);
		System.out.println(magazzino.conteggiaArticoli("str"));

		magazzino.vendiArticolo("str123", 3);
		System.out.println(magazzino.conteggiaArticoli("str"));
		
		System.out.println(magazzino.aggiornaPrezzi(20));
		
		
	
		
	}

}
