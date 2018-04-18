package parcheggio.privato;

import java.time.LocalTime;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.of(20, 30);
		LocalTime lt2 = LocalTime.of(21, 30);
		Parcheggio p = new Parcheggio("dokljhnaw", "dewoaiheoja", 5, 5, 5);
		Camion c = new Camion("wdknaw");
		Moto m = new Moto("aaaa");
		Auto a = new Auto("bbbb");
		m.entra(lt, p);
		a.entra(lt, p);
		c.entra(lt, p);
	
		ArrayList<Mezzo> mezzi = p.getMezzi();
		
		for(Mezzo mezzo : mezzi) {
			System.out.println(mezzo.getTarga());
			System.out.println(mezzo.getOraArrivo());
			System.out.println(mezzo.getOra(lt, lt2));
		}
		System.out.println("numero mezzi: "+p.contaMezzi());
		
		System.out.println("camion: "+c.esci(lt2));
		System.out.println("auto: "+a.esci(lt2));
		System.out.println("moto: "+m.esci(lt2));
		System.out.println("numero mezzi: "+p.contaMezzi());
		
		System.out.println(p.getRicavo());
		
		
		
	}

}
