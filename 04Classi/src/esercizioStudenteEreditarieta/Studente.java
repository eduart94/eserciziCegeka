package esercizioStudenteEreditarieta;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona {
	
	private int numeroMatricola;
	private int voto;
	
	public Studente(String nome, String cognome, int eta, int altezza, int _numeroMatricola, int voto)
	{
		super(nome, cognome, eta, altezza);
		this.numeroMatricola = _numeroMatricola;
		this.voto = voto;
	}
	
	public String getInfo()
	{
		String info ;
		String voto = Integer.toString(this.voto);
		String numeroMatricola = Integer.toString(this.numeroMatricola);
		info = voto + " " + numeroMatricola+ " "  + this.nome+ " "  + this.cognome+ " "  + this.altezza+ " "  + this.eta;
		return info;
	}
	
	
}
