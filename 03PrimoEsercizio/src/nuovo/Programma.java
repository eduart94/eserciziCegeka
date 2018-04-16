package nuovo;

public class Programma {

	public static void main(String[] args) {
		
		int[] arrayDiInteri = new int[20];
		StringBuilder str = new StringBuilder();
		
		
		for(int i=0; i<arrayDiInteri.length; i++) {
			
			arrayDiInteri[i]=i;
			System.out.println(arrayDiInteri[i]);
			
		}
		
		for(int x : arrayDiInteri) {
			
			if(x%2==0) {
				
				System.out.println(x);
			}else {
				
				str.append(arrayDiInteri[x]+ " ");
			}
			
		}
		System.out.println(str.toString());

	}

}
