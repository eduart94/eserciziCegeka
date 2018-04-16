package esercizioArcobaleno;

public class Arcobaleno {
	
	private String[] colori;
	private int numeroColori;
	
	public Arcobaleno(int colMax) {
		this.numeroColori=colMax;
		this.colori = new String[colMax];
	}
	
	public void aggiungiColore(String colore) {
		for(int i=0; i<colori.length;i++) {
			if(colori[i]==null) {
				colori[i]= colore;
				break;
			}
		}
	}
	
	public void rimuoviColore(String colore) {
		for(int i=0; i<colori.length;i++) {
			if(colori[i]==colore) {
				colori[i]=null;
			}
		}
	}
	
	public int numeroColori() {
		int contacolori=0;
		for(int i=0; i<colori.length;i++) {
			if(colori[i]!=null) {
				contacolori++;
			}
		}
		return contacolori;
	}
	
	public void stampaColori() {
		for(String colore : colori) {
			System.out.println(colore);
		}
	}
	
//	public Arcobaleno(int numeroColori){
//	    this.colori = new String[numeroColori];
//	    numeroColori=0;
//	}
//	
//	public void aggiungiColore(String nuovoColore) {
//		if(numeroColori<=colori.length) {
//			colori[numeroColori] = nuovoColore;
//			numeroColori++;
//		}
//	}

}
