package parcheggio.privato;

import java.time.LocalTime;
import java.util.ArrayList;

public class Parcheggio {

	private ArrayList<Mezzo> mezzi;
	private int nParcheggi;
	private int nParcheggiMoto;
	private int nParcheggiAuto;
	private int nParcheggiCamion;
	private String nome;
	private String indirizzo;
	private double ricavo;

	public Parcheggio(String nome, String indirizzo, int nParcheggiMoto, int nParcheggiAuto, int nParcheggiCamion) {

		this.mezzi = new ArrayList();
		this.nParcheggiMoto = nParcheggiMoto;
		this.nParcheggiAuto = nParcheggiAuto;
		this.nParcheggiCamion = nParcheggiCamion;
		this.nParcheggi = this.nParcheggiMoto + this.nParcheggiAuto + this.nParcheggiCamion;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public int getnParcheggi() {
		return nParcheggi;
	}
    
	public int contaMezzi()
	{
		int contatore=0;
		for(Mezzo m : mezzi)
		{
			contatore++;
		}
		return contatore;
	}
	

	public void setnParcheggi(int nParcheggi) {
		this.nParcheggi = nParcheggi;
	}

	public int getnParcheggiMoto() {
		return nParcheggi;
	}

	public void setnParcheggiMoto(int nParcheggiMoto) {
		this.nParcheggiMoto = nParcheggiMoto;
	}

	public int getnParcheggiAuto() {
		return nParcheggiAuto;
	}

	public void setnParcheggiAuto(int nParcheggiAuto) {
		this.nParcheggiAuto = nParcheggiAuto;
	}

	public int getnParcheggiCamion() {
		return nParcheggiCamion;
	}

	public void setnParcheggiCamion(int nParcheggiCamion) {
		this.nParcheggiCamion = nParcheggiCamion;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public double getRicavo() {
		return ricavo;
	}

	public void setRicavo(double ricavo) {
		this.ricavo = ricavo;
	}

	public ArrayList<Mezzo> getMezzi() {
		return mezzi;
	}

	public void setMezzi(ArrayList<Mezzo> mezzi) {
		this.mezzi = mezzi;
	}

}
