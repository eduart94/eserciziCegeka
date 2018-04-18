package esercizioContrattoTelefonico;

public class ContrattoFisso extends ContrattoTelefonico{

	
	public ContrattoFisso(String nome, String cognome, String codiceFiscale, String numeroTelefono, String operatore, int costo, int costoMinuto, int scattoRisposta)
	{
		super(nome,cognome, codiceFiscale, numeroTelefono, operatore, costo, costoMinuto, scattoRisposta);
	}
	@Override
	public String getInfo()
	{
		String info = this.nomeCliente +" " +  this.cognomeCliente +" " +  this.codiceFiscale +" " +  this.numeroTelefono +" " +  this.operatore +" ";
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
	
	@Override
	public int costoChiamata(int numeroMinuti)
	{
		int costo;
		if(numeroMinuti>10)
		{
			this.scattoRisposta=0;
			costo = this.costoMinuto*numeroMinuti + this.scattoRisposta;
		}
		else 
		{
			costo = this.costoMinuto*numeroMinuti + this.scattoRisposta;
		}
		return costo;
		
	}
}
