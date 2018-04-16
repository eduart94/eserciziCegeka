package esercizioContrattoTelefonico;

public class ContrattoFisso extends ContrattoTelefonico{

	
	public ContrattoFisso(String nome, String cognome, String codiceFiscale, String numeroTelefono, String operatore, int costo)
	{
		super(nome,cognome, codiceFiscale, numeroTelefono, operatore, costo);
	}
	@Override
	public String getInfo()
	{
		String info = this.nomeCliente +" " +  this.cognomeCliente +" " +  this.codiceFiscale +" " +  this.numeroTelefono +" " +  this.operatore +" " +  this.getCostoStringa();
		return info;
	}
	@Override
	public int tariffa(int numeroMesi)
	{
		if(numeroMesi>12)
		{
			this.costoAnnuale = (this.costoMensile/2)*numeroMesi;
		}
		else
		{
			this.costoAnnuale = this.costoMensile * numeroMesi;
		}
		return costoAnnuale;
	}
}
