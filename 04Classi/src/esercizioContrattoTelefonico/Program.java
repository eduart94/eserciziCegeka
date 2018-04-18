package esercizioContrattoTelefonico;

public class Program {

	public static void main(String[] args) {
		ContrattoFisso primo = new ContrattoFisso("marco", "rossi", "mrcrsss", "3254443333", "wind", 10, 10, 1);
		ContrattoMobile secondo = new ContrattoMobile("luigi", "di maio", "dmilgisdka", "0292876256", "wind", 10, 10, 1);
		
		System.out.println(primo.tariffa(13));
		System.out.println(secondo.tariffa(12));
		
		System.out.println(primo.getInfo());
		System.out.println(secondo.getInfo());

	}

}
