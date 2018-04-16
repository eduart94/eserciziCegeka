package esercizioBanca;

public class Program {

	public static void main(String[] args) {
		
//		realizzare una classe bank account che permetta di:
//		visualizzare il saldo presente sul conto
//		versare una determinata somma di denaro
//		prelevare una somma di denaro(se disponibile)
//		calcolare la maturazione la maturazione degli interessi sul conto in un anno(tasso 7%)
//		
//		NB. non è possibile creare un account senza soldi
//		testare i metodi e stampare i risultati

		BankAccount primo = new BankAccount(124, "password");
		double prelievo = primo.prelievo(15);
		System.out.println(prelievo);
		
		double versamento = primo.versamentoSomma(80);
		System.out.println(versamento);
		
		double visualiSaldo = primo.visualizzaSaldo("password");
		System.out.println("il saldo attuale è: " + visualiSaldo);
		
		double saldoConInteressi = primo.saldoConInteressi("password");
		System.out.println("il saldo compreso di interessi è : " + saldoConInteressi);
	}

}
