package esercizioEnum;

public class Car
{
	
	private double resa;
	private double carburanteContenuto;
	private TipoCarburante carburante;
	
	
	public Car(double _resa, TipoCarburante _carburante ) 
	{
		this.resa= _resa;

		this.carburante = _carburante;
		this.carburanteContenuto = 0;
	}
	
	public void riduzioneCarburante(double km)
	{
//		//controllo se carburante basta 
//		if(this.resa*km<= this.carburanteContenuto )
//		{
//			this.carburanteContenuto -= resa*km;
//		}
//		
		this.carburanteContenuto = this.carburanteContenuto-(km/this.resa);
	}
	
	
	public void aggiungiCarburante(double quantita, TipoCarburante _carburante) 
	{
		if(controlloCarburante(_carburante)) 
		{
			this.carburanteContenuto += quantita;
		}
	}
	
	
	public double getCarburanteContenuto()
	{
		return this.carburanteContenuto;
	}
	
	
	public boolean controlloCarburante(TipoCarburante _carburante)
	{
		if(this.carburante==_carburante)
		{
			return true;
		}else
		{
			System.out.println("carburante errato");
			return false;
		}
	}
	
	public boolean checkDiesel() 
	{
		boolean check= false;
		if(this.carburante==TipoCarburante.diesel)
		{
			check= true;
			return check;
		}
		else 
		{
		    return false;	
		}
		
	}

}
