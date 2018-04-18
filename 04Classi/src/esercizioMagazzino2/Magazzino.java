package esercizioMagazzino2;

import java.util.ArrayList;

public class Magazzino {
	
	public ArrayList<Articoli> articoli;
	
	public Magazzino()
	{
		this.articoli = new ArrayList();
	}
	
	public void rifornisciArticolo(Articoli articolo)
	{
		boolean check = true;
		for(Articoli art : articoli)
		{
			if(art.getCodice().equals(articolo.getCodice()))
			{
				art.setQuantita(art.getQuantita()+articolo.getQuantita());
				check=false;
			}
		}
		if(check)
		{
			articoli.add(articolo);
		}
		
	}
	
	public int PrelevaArticolo(String codice, int quantita)
	{
		int ricavo =0;
		for(Articoli art : articoli)
		{
			if(art.getCodice().equals(codice) && art.getQuantita()==quantita)
			{
				articoli.remove(art);
				ricavo = art.getPrezzo()*quantita;
			}
			else if(art.getCodice().equals(codice)&&art.getQuantita()>quantita)
			{
				art.setQuantita(art.getQuantita()-quantita);
				ricavo = art.getPrezzo()*quantita;
			}
		}
		return ricavo;
	}
	public int aggiornaPrezzo(int percentuale)
	{
		int prezzoAggiornato = 0;
		for(Articoli art : articoli)
		{
			prezzoAggiornato = art.getPrezzo()+ art.getPrezzo()*percentuale/100;
			art.setPrezzo(prezzoAggiornato);
		}
		return prezzoAggiornato;
	}
	
	public int conteggiaArticoli(String prefisso)
	{
		int contatore = 0;
		for(Articoli art : articoli)
		{
			if(art.getCodice().startsWith(prefisso))
			{
				contatore= contatore+art.getQuantita();
			}
		}
		return contatore;
	}
}
