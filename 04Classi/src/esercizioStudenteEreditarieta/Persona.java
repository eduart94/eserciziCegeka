package esercizioStudenteEreditarieta;

public abstract class Persona {

	protected String nome;
	protected String cognome;
	protected int altezza;
	protected int eta;
	
	public Persona(String _nome, String _cognome, int _altezza, int _eta)
	{
		this.nome = _nome;
		this.cognome = _cognome;
		this.altezza = _altezza;
		this.eta = _eta;
	}
	
	public Persona()
	{
		
	}
	
	public String getInfo()
	{
		String info;
		String eta = Integer.toString(this.eta);
		String altezza = Integer.toString(this.altezza);
		info =  this.nome + this.cognome + eta + altezza;
		return info;
	
	}
	
	public String getNome()
	{
		return this.nome;
	}
	public void setNome(String _nome)
	{
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}
}
