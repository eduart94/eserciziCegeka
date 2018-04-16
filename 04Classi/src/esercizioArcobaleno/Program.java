package esercizioArcobaleno;

public class Program {

	public static void main(String[] args) {
		
		Arcobaleno primo = new Arcobaleno(5);
		primo.aggiungiColore("blu");
		primo.aggiungiColore("verde");
		primo.aggiungiColore("arancione");
		primo.aggiungiColore("verde");
		primo.aggiungiColore("verde");
		
		
		primo.stampaColori();
		
		

	}

}
