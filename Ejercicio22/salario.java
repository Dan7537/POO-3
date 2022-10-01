package Ejercicio22;

public class salario {
	 String nombres;
     int horas;
     double valor_hora;
     
     
     
     public static String obtener(String nombres,double horas, double valor_hora) {
    	 double salario;
    	 String message;
			salario = horas * valor_hora;
			if (salario > 450000) {
	        	message ="Nombre del empleado: " + nombres + " Salario mensual: $" + salario;
	        }
	        else  {
	        	message ="Nombre del empleado: " + nombres;
	        }
			return message;
     }
}
