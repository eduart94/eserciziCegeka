package esercizioBanca;

public class BankAccount {
		
		private double saldo;
		private String password;
		private double versamento;
		private double prelievo;
		private double interessi;
		
		// costruisco un bank account
		
		public BankAccount(double saldo, String password) {
			if(saldo>0) {
			this.saldo=saldo;
			this.password=password;
			}else {
				System.out.println("devi versare alemno 1 euro");
			}
		}
		
		
		// visualizzare il saldo
		public double visualizzaSaldo(String password) {
			if(controllaPassword(password)) {
				return saldo;	
			}
			return 0;
		}
		
		// versare una somma di denaro
		public double versamentoSomma(double versamento) {
			this.saldo = saldo + versamento;
			return this.saldo;
		}
		// prelievo una somma di denaro
		public double prelievo(double prelievo) {
			if(this.saldo > prelievo) {
				this.saldo = saldo-prelievo;
			}else {
				System.out.println("non puoi prelevare piu di quanto hai sul conto");
			}
			return this.saldo;
		}
		
		//calcolo gli interessi
		public double saldoConInteressi(String password) {
			if(controllaPassword(password)) {
			this.interessi = saldo*7/100;
			System.out.println("l interesse ammonta a: " + interessi);
			this.saldo = saldo+interessi;
			}
			return this.saldo;
		
		}
		
		public boolean controllaPassword(String password) {
			if(this.password.equals(password)) {
				return true;
			}else {
				return false;
			}
			
		}
}
