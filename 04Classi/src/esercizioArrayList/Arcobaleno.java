package esercizioArrayList;

import java.util.ArrayList;

public class Arcobaleno 
{
	private ArrayList<String> colori;
	
	public Arcobaleno()
	{
		this.colori= new ArrayList();
	}
	
	public void addColour(String colore)
	{
		boolean check = false;
		
		if(this.colori.size()>0) 
		{
			
		
		for(String c : this.colori)
		{
			if(colore.equals(c)) 
			{
				check = true;
			}
			
		}
		if(check==false) 
		{
			this.colori.add(colore);
		}
		}else
		{
			this.colori.add(colore);
		}
	}
	
	public void removeColour(String colore)
	{
		
		for(String c : this.colori) 
		{
			if(c.equals(colore)) {
				colori.remove(colore);
				break;
			}
		}
	}
	
	public ArrayList<String> getColours()
	{
		return this.colori;
	}
	
	public int numColori() {
		return colori.size();
	}
	
	
	
}
