package parcheggio.privato;

import java.time.LocalTime;

public class Moto extends Mezzo {

	public Moto(String targa) {
		super(targa);
		super.prezzoOrario = 2.0;
	}

	@Override
	public void entra(LocalTime oraArrivo, Parcheggio p) {

		if(p.getnParcheggiMoto()>0) {
			p.setnParcheggiMoto(p.getnParcheggiMoto()-1);
			this.setOraArrivo(oraArrivo);
			p.getMezzi().add(this);
			this.setParcheggio(p);
		}
	}

	@Override
	public double esci(LocalTime oraUscita) {

		
		double tot = 0;
		
		for (Mezzo m:this.getParcheggio().getMezzi()) {
			if(m.getTarga().equals(this.getTarga())) {
				this.getParcheggio().setnParcheggiMoto(this.getParcheggio().getnParcheggiMoto()+1);
				this.getParcheggio().getMezzi().remove(this);
				this.setOraUscita(oraUscita);
				
				double ora = getOra(this.getOraArrivo(), oraUscita);
				tot = this.getPrezzoOrario()*ora;
				this.getParcheggio().setRicavo(this.getParcheggio().getRicavo()+tot);
				break;
			}
			
		}
		
		return tot;
	}

}
