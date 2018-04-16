package esercizioCinema;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Cinema
{
	DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	private ArrayList<Spettacolo> spettacoli;
	
	
 public Cinema()
	{
		this.spettacoli = new ArrayList();
	
	}

public void aggiungiSpettacolo(Spettacolo spettacolo)
	{
		spettacoli.add(spettacolo);
	}

public void rimuoviSpettacolo(Spettacolo spettacolo)
{
	String titolo = spettacolo.getTitolo();
	for(Spettacolo s: spettacoli)
	{
		if(s.getTitolo().equals(titolo))
		{
			spettacoli.remove(s);
		}
	}
}

public ArrayList<Spettacolo> spettacoloDelGiorno()
{
	ArrayList<Spettacolo> spettacoliDelGiorno = new ArrayList();
	Date dataOggi = Calendar.getInstance().getTime();
    String oggi = this.sdf.format(dataOggi);
    for(Spettacolo s : this.spettacoli)
    {
    	if(s.getDataStringa().equals(oggi))
    	{
    		spettacoliDelGiorno.add(s);
    	}
    }
    return spettacoliDelGiorno;
}

public ArrayList<Spettacolo> spettacoliGiornoSpecifico(String data)
{
	ArrayList<Spettacolo> spettacoli = new ArrayList();
	for(Spettacolo s : this.spettacoli)
	{
		if(s.getDataStringa().equals(data))
		{
			spettacoli.add(s);
		}
	}
	return spettacoli;
}

public String acquistaBiglietto(String titolo, String dataSpettacolo)
{
	String log = "";
	for(Spettacolo s : spettacoli)
	{
		if(s.getTitolo().equals(titolo) && s.getDataStringa().equals(dataSpettacolo))
		{
			log = "acquistato";
		}
		else
		{
			log="acquisto negato";
		}
	}
	return log;
}

}

	
