package Ejercicio10;

public class matricula {
	int numInsc,patrimonio;
	Double estrato;
	String nombre;
	
	public static String getmatricula(int numInsc,String nombre,int patrimonio,int estrato) {
		
		Double valMatri,valEst = 50000.0;
		String message;
		if (patrimonio > 2000000 && estrato > 3) {
			valMatri = valEst + (patrimonio * 0.03);
			
		}
		else {
			valMatri = valEst;
			
		}
		
		 message = "El estudiante con número de inscripción "+ numInsc +
					" y nombre "+nombre + " debe pagar $"+ valMatri;
		
		
		return message;
		
	}
	
}
