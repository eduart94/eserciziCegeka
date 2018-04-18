package esercizioMagazzino;

import java.util.ArrayList;

public class Magazzino {
	private ArrayList<Articolo> articoli; 
	private int disponibilita;
	
	public Magazzino()
	{
		this.articoli = new ArrayList();
	}
	
	public void rifornisciArticolo(Articolo articolo)
	{
		boolean check = true;
		for(Articolo art : this.articoli)
		{
			if(art.getCodice().equals(articolo.getCodice()))
			{
				art.setDisponibilita(art.getDisponibilita()+articolo.getDisponibilita());
				check=false;
			}
		}
		if(check)
		{
			articoli.add(articolo);
		}
	}
	
	public int vendiArticolo(String codice, int quantita)
	{
		int ricavo=0;
		for(Articolo art: articoli)
		{
			if(art.getCodice().equals(codice)&&art.getDisponibilita()==quantita)
			{
				articoli.remove(art);
				ricavo = art.getPrezzo()*quantita;
			}
			else if(art.getCodice().equals(codice)&&art.getDisponibilita()>quantita)
			{
				art.setDisponibilita(art.getDisponibilita()-quantita);
				ricavo = art.getPrezzo()*quantita;
			}
		}
		return ricavo;
	}
	
	public int aggiornaPrezzi(int percentuale)
	{
		int prezzoAggiornato=0;
		for(Articolo art: articoli)
		{
			prezzoAggiornato =art.getPrezzo() + art.getPrezzo()*percentuale/100; 
			 art.setPrezzo(prezzoAggiornato);
		}
		return prezzoAggiornato;
	}
	
	public int conteggiaArticoli(String prefisso)
	{
		int contatore = 0;
		
		for(Articolo art : articoli)
		{
			if(art.getCodice().startsWith(prefisso))
			{
				contatore+=art.getDisponibilita();
			}
		}
		return contatore;
	}

}
