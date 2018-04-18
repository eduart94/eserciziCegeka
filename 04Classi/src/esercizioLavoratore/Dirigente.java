package esercizioLavoratore;

public class Dirigente extends Lavoratore {
	protected double premioAnnuale ;
	
	public Dirigente(String nome, String cognome, int stipendioGiornaliero, double premioAnnuale)
	{
		super(nome, cognome, stipendioGiornaliero);
		this.premioAnnuale = premioAnnuale;
	}
	
	@Override
	public String toString()
	{
		String stipendio = Integer.toString(stipedioGiornaliero);
		String informazioni = this.nome + this.cognome + stipendio;
		return informazioni;
	}
	
	@Override
	public double stipendioMensile(int giorniLavoratiMese)
	{
		double stipendioMensile = (this.stipedioGiornaliero*giorniLavoratiMese) + (this.premioAnnuale/12);
		return stipendioMensile;
	}
	
	
	@Override
	public double ferie(int mesi) {
		if(mesi>0)
		{
		
		for(int i=0; i<mesi; i++)
		{
			feriePerMese = feriePerMese+2;
		}
		
		}
		return feriePerMese;
	}
	
}
