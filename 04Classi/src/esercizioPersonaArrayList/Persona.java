package esercizioPersonaArrayList;

import java.util.ArrayList;
import java.util.List;

public class Persona
{
	private String nome;
	private String cognome;
	private String citta;
	private int eta;
	
	public Persona(String _nome, String _cognome, String _citta, int _eta) 
	{
		this.nome=_nome;
		this.cognome=_cognome;
		this.citta=_citta;
		this.eta=_eta;
	}
	
	public List<String> getInfo() 
	{
		ArrayList<String > informazioni= new ArrayList();
		informazioni.add(this.nome);
		informazioni.add(this.cognome);
		informazioni.add(this.citta);
		String eta = Integer.toString(this.eta);
		informazioni.add(eta);
		
		return informazioni;
		
	}
	
}
