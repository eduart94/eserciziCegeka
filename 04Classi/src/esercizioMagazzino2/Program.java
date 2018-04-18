package esercizioMagazzino2;

public class Program {

	public static void main(String[] args) {
		
		Articoli art = new Articoli("str012", 10, 5);
		Magazzino m = new Magazzino();
		m.rifornisciArticolo(art);
		System.out.println(m.conteggiaArticoli("str"));
		
		

	}

}
