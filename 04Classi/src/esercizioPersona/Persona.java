package esercizioPersona;

public class Persona {
	
	private String nome;
	private String cognome;
	private String titolo;
	private String professione;
	StringBuilder str = new StringBuilder();
	
	// costruttori
	public Persona(String _nome, String _cognome, String _titolo, String _professione) {
		this.nome = _nome;
		this.cognome = _cognome;
		this.titolo = _titolo;
		this.professione = _professione;
	}
	public Persona(String _nome, String _cognome) {
		this.nome = _nome;
		this.cognome = _cognome;
		this.titolo = "";
		this.professione = "disoccupato";
	}
	
	// metodo per appendere le informazioni su una stringa
		public String personInf() {
		String informazione = this.nome+" "+this.cognome+", "+this.professione+", "+this.titolo;
		return informazione;
		}
		

		
	// get and set
		public String getNome() {
			return nome;
		}
		public void setNome(String _nome) {
			this.nome= _nome;
		}
		public String getCognome() {
			return cognome;
		}
		public void setCognome(String _cognome) {
			this.cognome = _cognome;
		}
		public String getTitolo() {
			return titolo;
		}
		public void setTitolo(String _titolo) {
			this.titolo = _titolo;
			
		}
		public String getProfessione() {
			return professione;
		}
		public void setProfessione(String _professione) {
			this.professione = _professione;
		
		}
		
}
