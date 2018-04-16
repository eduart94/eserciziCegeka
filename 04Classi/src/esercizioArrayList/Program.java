package esercizioArrayList;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		Arcobaleno arco = new Arcobaleno();
		
		
		arco.addColour("arancione");
		arco.addColour("blu");
		arco.addColour("bianco");
		arco.addColour("bianco");
		arco.removeColour("bianco");
		arco.removeColour("arancione");
		
		
		for(String color : arco.getColours())
		{
		System.out.println(color);	
		}

	}

}
