package esercizioFormeGeometriche;

public class Program {

	public static void main(String[] args) {
		
		Rettangolo rtg= new Rettangolo();
		Quadrato quad = new Quadrato();
		TriangoloEquilatero triang = new TriangoloEquilatero();
		
		double areaRettangolo = rtg.area(10, 15);
		double perimetroRettangolo = rtg.perimetro(10, 15);
		
		double areaQuadrato = quad.area(5);
		double perimetroQuadrato = quad.perimetro(5);
		
		double areaTriangolo = triang.area(5);
		double perimetroTriangolo = triang.perimetro(5);
		
	    System.out.println("area rettangolo : " + areaRettangolo);
		System.out.println("perimetro rettangolo : " +perimetroRettangolo);
		
		System.out.println("area quadrato : " +areaQuadrato);
		System.out.println("perimetro quadrato : " +perimetroQuadrato);
		
		System.out.println("area triangolo : " +areaTriangolo);
		System.out.println("perimetro triangolo : " +perimetroTriangolo);
		
		
		
	}

}
