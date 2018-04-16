package esercizioDipendente;

public class Dipendente {
	
	private String name;
	private double salary;
	
	public Dipendente() {
		
	}
	public Dipendente(String _name, double _salary) {
		this.name = _name;
		this.salary = _salary;
	}
	
	public String getNome() {
		return this.name;
	}
	public void getDipendente() {
		System.out.println(this.name + " "+ this.salary);
	}
	
	public void setStipendio(double _salario) {
		this.salary= _salario;
	}
	
	public void setName(String nuovoNome) {
		this.name= nuovoNome;
	}
	
	public double aumento(double percentuale) {
		double interesse = this.salary*percentuale/100;
		this.salary = salary+interesse;
		return salary;
	}

}
