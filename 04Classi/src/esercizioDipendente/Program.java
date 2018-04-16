package esercizioDipendente;

public class Program {
	public static void main(String[] args) {
		Dipendente primo = new Dipendente("marco", 1800);
		String nome = primo.getNome();
		System.out.println(nome);
		
		primo.setName("luigi");
		primo.setStipendio(1500);
		primo.getDipendente();
		
		primo.aumento(10);
		primo.getDipendente();
		
		
	}
	

	
}
