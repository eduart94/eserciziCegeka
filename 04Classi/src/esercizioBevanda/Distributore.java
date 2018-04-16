package esercizioBevanda;

import java.util.ArrayList;

public class Distributore
{
	private int disponibilita;
	private ArrayList<Bevanda> bevande;
	private int capacita;
	
	public Distributore(int _capacita)
	{
		this.bevande = new ArrayList();
		this.capacita= _capacita;
		this.disponibilita= this.capacita;
	}
	
	public void addBevanda(Bevanda bevanda, int quantita)
	{
		if(this.disponibilita>=quantita)
		{
			for(int i=0; i<quantita; i++) 
			{
				this.bevande.add(bevanda);
				this.disponibilita --;
			}
		}
		else
		{
			System.out.println("la quantita da inserire supera la capacita del distributore");
		}
		
	}
	
	public void removeBevanda(Bevanda bevanda, int quantita) 
	{
		for(int i=0; i<quantita; i++)
		{
			this.bevande.remove(bevanda);
			this.disponibilita++;
		}
	}
	
	public int contabevande(String bevanda)
	{
		int contatore = 0;
		for(Bevanda d : this.bevande)
		{
			if(d.getNome().equals(bevanda))
			{
				contatore++;
			}
		}
		
		return contatore;
	}
	public int getDisponobilita() {
		return this.disponibilita;
	}
}
