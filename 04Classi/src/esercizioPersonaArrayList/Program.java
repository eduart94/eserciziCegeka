package esercizioPersonaArrayList;

public class Program
{

	public static void main(String[] args)
	{
		Persona pers1= new Persona("marco", "inzoli", "Milano", 24);
		Persona pers2= new Persona("emanuel", "babaj", "milano", 12);
		Persona pers3= new Persona("alessandro", "matraxia", "Milano", 22);
		
	for(String persona : pers3.getInfo()) 
	{
		System.out.println(persona);

	}

	}	
}
