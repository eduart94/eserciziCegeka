package esercizioBevanda;

public class Bevanda
{
	private String nome;
	private int capacitaRimanente;
	private int numeroBottiglie;
	private static int capacita= 33;
	
	public Bevanda(String _nome)
	{
		this.nome = _nome;
		this.capacitaRimanente = this.capacita;
	}
	
	public Bevanda(String _nome, int _numeroBottiglie) 
	{
		this.numeroBottiglie = _numeroBottiglie;
		this.nome = _nome;
		this.capacitaRimanente = this.capacita;
	}
	
	public void bevi(int quantita)
	{
		if(this.capacitaRimanente > quantita)
		{
			this.capacitaRimanente -= quantita;
			
		}
		
	}
	
	public void aggiungiLiquido(int quantita)
	{
		if(quantita + this.capacitaRimanente>this.capacita) 
		{
			this.capacitaRimanente = this.capacita;
		}
		else
		{
			this.capacitaRimanente= this.capacitaRimanente + quantita;
		}
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getLiquidoRimanente()
	{
		return this.capacitaRimanente;
	}
	
	public int getQuantita()
	{
		return this.numeroBottiglie;
	}
	
	public void setQuantita(int quantita)
	{
		this.numeroBottiglie= quantita;
	}
}
