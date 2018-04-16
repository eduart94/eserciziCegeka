package esercizioBevanda;

public class Bevanda
{
	private String nome;
	private int quantitaRimanente;
	private int numeroBottiglie;
	private static int capacita= 33;
	
	public Bevanda(String _nome)
	{
		this.nome = _nome;
		this.quantitaRimanente = this.capacita;
	}
	
	public Bevanda(String _nome, int _numeroBottiglie) 
	{
		this.numeroBottiglie = _numeroBottiglie;
		this.nome = _nome;
		this.quantitaRimanente = this.capacita;
	}
	
	public void bevi(int quantita)
	{
		if(this.quantitaRimanente > quantita)
		{
			this.quantitaRimanente -= quantita;
			
		}
		
	}
	
	public void aggiungiLiquido(int quantita)
	{
		if(quantita + this.quantitaRimanente>this.capacita) 
		{
			this.quantitaRimanente = 33;
		}
		else
		{
			this.quantitaRimanente= this.quantitaRimanente + quantita;
		}
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getQuantita()
	{
		return this.quantitaRimanente;
	}
}
