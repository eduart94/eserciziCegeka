package parcheggio.privato;

import java.time.LocalTime;

public class Camion extends Mezzo {
	

		public Camion(String targa) {
		super(targa);
		super.prezzoOrario = 5.0;
	}

		@Override
		public void entra(LocalTime oraArrivo, Parcheggio p) {
			
			if(p.getnParcheggiCamion()>0) {
				p.setnParcheggiCamion(p.getnParcheggiCamion()-1);
				p.getMezzi().add(this);
				this.setOraArrivo(oraArrivo);
				this.setParcheggio(p);
			}
			
		}

		@Override
		public double esci(LocalTime oraUscita) {
			
			double tot = 0;
			for(Mezzo mezzo : this.getParcheggio().getMezzi()) {
				if(mezzo.getTarga().equals(this.getTarga())){
					this.getParcheggio().setnParcheggiCamion(this.getParcheggio().getnParcheggiCamion()+1);
					this.getParcheggio().getMezzi().remove(this);
					this.setOraUscita(oraUscita);
					double ora = getOra(this.getOraArrivo(), oraUscita);
					tot = this.getPrezzoOrario() * ora;
					this.getParcheggio().setRicavo(this.getParcheggio().getRicavo()+tot);
					
					break;
				}
			
			}
			
			return tot;
		}


}
