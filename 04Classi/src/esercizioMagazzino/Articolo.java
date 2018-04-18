package esercizioMagazzino;

public class Articolo {
	private int prezzo;
	private int disponibilita = 0;
	private String codice;
	
	public Articolo(int _prezzo, String _codice, int quantita)
	{
		this.prezzo = _prezzo;
		this.codice = _codice;
		this.disponibilita= quantita;
	}
	
	public String getCodice()
	{
		return this.codice;
	}
	
	public void setCodice(String _codice)
	{
		this.codice = _codice;
	}
	
	public int getDisponibilita()
	{
		return this.disponibilita;
	}
	
	public void setDisponibilita(int _disponibilita)
	{
		this.disponibilita = _disponibilita;
	}
	
	public int getPrezzo()
	{
		return this.prezzo;
	}
	
	public void setPrezzo(int _prezzo)
	{
		this.prezzo = _prezzo;
	}

}
