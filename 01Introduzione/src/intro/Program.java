package intro;

public class Program {
	
	public static void main(String[] args) {
		
		String film = "Star wars wpisodio 6: ";
		String title = "Una nuova speranza";
		
		
		// lunghezza di una stringa 
		int number= film.length();
		System.out.println(number);
		
		
		// char nella posizione specificata
		char c = film.charAt(3);
		System.out.println(c);
		
		
		// sommo due stringhe
		String tcomplete= film.concat(title);
		System.out.println(tcomplete);
		
		
		// ottengo una parte della stringa
		String star= film.substring(0, 3);
		System.out.println(star);
		
		
		// utilizziamo la classe sottostante per creare o modificare stringhe
		StringBuilder str = new StringBuilder();
		str.append(film);
		str.append(c);
		System.out.println(str.toString());
		
		int z=1000;
		int f = 14;
		int result = z/f;
		System.out.println(result);
		
		
		// faccio un cast
		// ovvero forzo il valore ad essere di un determinato tipo
		double res = (double)z/f;
		System.out.println(res);
		
	    
		
				
	}
}
