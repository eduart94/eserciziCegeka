package esercizioEnum;

public class Program {

	public static void main(String[] args) 
	{
		
		// l'auto spende 1 litro per km
		//l'auto spende 5 litri per km --> con il metodo commentato
		
		// mentre adesso l'auto percorre 20km con 1 litro
		Car auto  = new Car(20, TipoCarburante.gas);
		
		
		// l'auto parte da zero carburante e viene aggiunto una quantita di 150
		auto.aggiungiCarburante(150, TipoCarburante.gas);
		System.out.println(auto.getCarburanteContenuto());
		
		// effettuo 15 km e spendo 5 litri per ogni km ,
		//5*15 ----> quindi spendo 75 litri e andrò a togliere ai 150 della q aggiunta prima
		
		// adesso invece l'auto effettua 20km e spende 1lt, come deciso sopra
		auto.riduzioneCarburante(20);
		System.out.println(auto.getCarburanteContenuto());
		
		System.out.println(auto.checkDiesel());

	}

}
