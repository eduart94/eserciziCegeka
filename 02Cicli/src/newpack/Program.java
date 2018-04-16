package newpack;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// array
		
		String[] arraytest= new String[5];
		
		arraytest[0]= "pippo";
		arraytest[1]= "ciao";
		arraytest[2]= "luca";
		arraytest[3]= "robi";
		arraytest[4]= "bla";
		
		int[] arrayNum= {1,2,3,4,5};
		// secondo modo
		
		
		// ciclo foreach
		
		for(String x: arraytest)
		{
			System.out.println(x);
		}
		
		System.out.println("////");
		
		// ciclo for
		for(int i=0; i<arraytest.length; i++) {
			
			System.out.println(arraytest[i]);		}

		// Costrutto if
		String nome = "Star Wars";
		
		if(nome.contains("xxx")){
			String substring = nome.substring(0,4);
			System.out.println(substring);
		}else {
		  
		}
		
		
		// ciclo while,  pomgo una condizione e finchè è verificata continuerà a svolgere la funzione che li attribuisco sotto.
		
		int num = 1;
		while(num<11) {
			System.out.println("numero: " + num);
			num++;
		}
		
		// ciclo do while - prima esegue l'istruzione e poi verifica la condizione.
		int r=5;
		do {
			r--;
			System.out.println(r);
		}while(r>0);
		
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String upper = s.toUpperCase();
		for(int i=0; i<upper.length();i++) {
			char c = upper.charAt(i);
			
			switch(c) {
			case 'A':
				System.out.println(s.charAt(i));
				break;
			case 'E':
				System.out.println(s.charAt(i));
				break;
			case 'I':
				System.out.println(s.charAt(i));
				break;
			case 'O':
				System.out.println(s.charAt(i));
				break;
			case 'U':
				System.out.println(s.charAt(i));
				break;
			default:
				break;
			
			}
			
		}
   }
	
	

}
