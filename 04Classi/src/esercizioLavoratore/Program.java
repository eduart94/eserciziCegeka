package esercizioLavoratore;

public class Program {

	public static void main(String[] args) {
		
		Dirigente marco = new Dirigente("marco", "inzoli", 80, 1200);
		
		System.out.println(marco.toString());
		System.out.println(marco.ferie(15));

	}

}
