package Tienda;

public class Main {

	public static void main(String[] args) {

		Libro lbr1 = new Libro("Bajo la misma estrella", 18);
		Libro lbr2 = new Libro("La chica del tren", 12);
		
		Cd Cd1 = new Cd("One Direction", 5);
		Cd Cd2 = new Cd("Bruno Mars", 12);

       
		System.out.println("CANCELE POR EL LIBRO BAJO LA MISMA ESTRELLA :" + lbr1.getValor1() +  "$");
		System.out.println("CANCELE POR EL LIBRO LA CHICA DEL TREN CUESTA : " + lbr2.getValor1() +  "$"); 
		
		System.out.println("                                                 ");
		
		System.out.println("EL VALOR DEL CD ONE DIRECTION ES DE :" +  Cd1.getValorcd1() +  "$");
		System.out.println("EL VALOR DEL CD BRUNO MARS : "  + Cd2.getValorcd1() +  "$");
	}

}
