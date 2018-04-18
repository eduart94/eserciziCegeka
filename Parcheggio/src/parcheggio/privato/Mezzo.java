package parcheggio.privato;

import java.time.LocalTime;

public abstract class Mezzo {
	
	protected int nParcheggio;
	protected LocalTime oraArrivo;
	protected LocalTime oraUscita;
	protected double prezzoOrario;
	protected String targa;
	protected Parcheggio parcheggio;
	

	
	public Mezzo(String targa) {
		
		this.targa = targa;
	}
	
	public abstract void entra(LocalTime oraArrivo, Parcheggio p);
	
	public abstract double esci(LocalTime oraUscita);
	
	public double getOra(LocalTime oraArrivo,LocalTime oraUscita) {
		int hour = oraUscita.getHour();
		int minuti = oraUscita.getMinute();
		int hour2 = oraArrivo.getHour();
		int minuti2 = oraArrivo.getMinute();
		double tempo = (((hour*60)+minuti) - ((hour2 * 60)+minuti2))/60 ;
		return tempo;
	}
	
	
	public int getNparcheggio() {
		return this.nParcheggio;
		
	}
	
	public void setNparcheggio(int nParcheggio) {
		this.nParcheggio = nParcheggio;
	}
	
	public LocalTime getOraArrivo() {
		return this.oraArrivo;
		
	}
	
	public void setOraArrivo(LocalTime oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public LocalTime getOraUscita() {
		return oraUscita;
	}

	public void setOraUscita(LocalTime oraUscita) {
		this.oraUscita = oraUscita;
	}

	public double getPrezzoOrario() {
		return prezzoOrario;
	}

	public void setPrezzoOrario(double prezzoOrario) {
		this.prezzoOrario = prezzoOrario;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public Parcheggio getParcheggio() {
		return parcheggio;
	}

	public void setParcheggio(Parcheggio parcheggio) {
		this.parcheggio = parcheggio;
	}
	
	
}
