package esercizioLavoratore;

public abstract class Lavoratore {
	protected String nome;
	protected String cognome;
	protected int stipedioGiornaliero;
	
	protected int feriePerMese = 0;
	
	
	public Lavoratore(String _nome, String _cognome, int _stipendioGiornaliero)
	{
		this.nome = _nome;
		this.cognome = _cognome;
		this.stipedioGiornaliero = _stipendioGiornaliero;
	}
	
	// 2 giorni di ferie al mese 
	public abstract double ferie(int mesi);
	
	
	public double stipendioMensile(int giorniLavoratiMese)
	{
		double salario = this.stipedioGiornaliero * giorniLavoratiMese;
		return salario;
	}
	
}
