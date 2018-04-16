package esercizioContrattoTelefonico;

public abstract class ContrattoTelefonico 
{
	protected String nomeCliente;
	protected String cognomeCliente;
	protected String codiceFiscale;
	protected String operatore;
	protected int costoMensile;
	protected String numeroTelefono;
	protected int costoAnnuale;
	
	public ContrattoTelefonico (String _nomeCliente, String _cognomeCliente, String _codiceFiscale, String _numeroTelefono, String _operatore, int _costo)
	{
		this.nomeCliente = _nomeCliente;
		this.operatore = _operatore;
		this.costoMensile = _costo;
		this.codiceFiscale = _codiceFiscale;
		this.cognomeCliente = _cognomeCliente;
		this.numeroTelefono = _numeroTelefono;
		
	}
	
	public ContrattoTelefonico()
	{
		
	}
	
	// metodo calcolo della tariffa
	
	public int tariffa(int numeroMesi)
	{
		int annuale ;
		annuale = this.costoMensile * 12;
		return annuale;
	}
	public String getCostoStringa()
	{
		String costo = Integer.toString(costoMensile);
		return costo;
	}
	
	
	public String getInfo()
	{
		String costoMensile = Integer.toString(this.costoMensile);
		String info = this.nomeCliente + " " + this.cognomeCliente+ " " +this.codiceFiscale+ " " + this.operatore+ " " +costoMensile;
		return info;
	}
	
	public void setNome(String _nome)
	{
		this.nomeCliente = _nome;
	}
	
	public void setCognome(String _cognome)
	{
		this.cognomeCliente = _cognome;
	}

	public String getNomeCliente() 
	{
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente)
	{
		this.nomeCliente = nomeCliente;
	}

	public String getCognomeCliente() 
	{
		return cognomeCliente;
	}

	public void setCognomeCliente(String cognomeCliente) 
	{
		this.cognomeCliente = cognomeCliente;
	}

	public String getCodiceFiscale() 
	{
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) 
	{
		this.codiceFiscale = codiceFiscale;
	}

	public String getOperatore() 
	{
		return operatore;
	}

	public void setOperatore(String operatore) 
	{
		this.operatore = operatore;
	}

	public int getCostoMensile()
	{
		return costoMensile;
	}

	public void setCostoMensile(int costoMensile)
	{
		this.costoMensile = costoMensile;
	}
	
	

}
