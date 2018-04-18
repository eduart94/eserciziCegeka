package esercizioMagazzino2;

public class Articoli {
	private String codice;
	private int prezzo;
	private int quantita;
	
	public Articoli(String codice, int prezzo, int quantita)
	{
		this.codice = codice;
		this.prezzo = prezzo;
		this.quantita = quantita;
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
}
