package Ejercicio7;

public class Mayor {
	double A,B;
	
	public static String mayor(double a,double b ){
		double dife = b-a;
		String mayo;
		if (dife == 0) {
			 mayo = "A es igual que B" ;
			
		}
		else if (dife > 0 ) {
			 mayo =("A es menor que B");
		}
		else {
			 mayo =("A es mayor que B");
		}
		return mayo;
	}
	
}
