package parcheggio.privato;

import java.time.LocalTime;

public class Auto extends Mezzo {


	public Auto(String targa) {
		super(targa);
		super.prezzoOrario = 3.0;
	}

	@Override
	public void entra(LocalTime oraArrivo, Parcheggio p) {

			if(p.getnParcheggiAuto()>0) {
				p.setnParcheggiAuto(p.getnParcheggiAuto()-1);
				p.getMezzi().add(this);
				this.setOraArrivo(oraArrivo);
				this.setParcheggio(p);
			}
	}

	@Override
	public double esci(LocalTime oraUscita) {
			
		double tot =0;
		for(Mezzo m : this.getParcheggio().getMezzi()) {
			if(m.getTarga().equals(this.getTarga())){
				this.getParcheggio().setnParcheggiAuto(this.getParcheggio().getnParcheggiAuto()+1);
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
