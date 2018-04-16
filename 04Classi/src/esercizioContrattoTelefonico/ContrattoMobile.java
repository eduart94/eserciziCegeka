package esercizioContrattoTelefonico;

public class ContrattoMobile extends ContrattoTelefonico{
	
	public ContrattoMobile(String nome, String cognome, String codiceFiscale, String numeroTelefono, String operatore, int costo)
	{
		super(nome, cognome, codiceFiscale, numeroTelefono, operatore, costo);
	}
	@Override
	public String getInfo()
	{
		String info;
		info = this.nomeCliente +" " +  this.cognomeCliente +" " +  this.codiceFiscale +" " + this.numeroTelefono +" " + this.operatore +" " +  this.getCostoStringa();
		return info;
	}
	@Override
	public int tariffa(int numeroMesi)
	{
		if(numeroMesi>15)
		{
			this.costoAnnuale = (this.costoMensile*2/3)*numeroMesi;
		}
		else
		{
			this.costoAnnuale= this.costoMensile * numeroMesi;
		}
		return costoAnnuale;
	}
}
