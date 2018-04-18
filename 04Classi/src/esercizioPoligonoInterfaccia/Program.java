package esercizioPoligonoInterfaccia;

public class Program {

	public static void main(String[] args) {
		 Quadrato q = new Quadrato(10);
		 System.out.println(q.area());
		 System.out.println(q.perimetro());
		 
		 Rettangolo r = new Rettangolo(10, 15);
		 System.out.println(r.area());
		 System.out.println(r.perimetro());

	}

}
