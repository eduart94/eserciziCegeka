package esercizioPersona;

public class Program {

	public static void main(String[] args) {
		
		String infoPersona1;
		String infoPersona2;
		
		Persona persona1 = new Persona("marco", "bianchi");
		Persona persona2 = new Persona("Renato", "Caputo", "sign.", "Barbiere");
		
		infoPersona1 = persona1.personInf();
		System.out.println(infoPersona1);
		
		infoPersona2 = persona2.personInf();
		System.out.println(infoPersona2);
		
		persona1.setTitolo("signore");
		persona1.setProfessione("manutentore elettrico");
		
		infoPersona1 = persona1.personInf();
		System.out.println(infoPersona1);
	}

}
