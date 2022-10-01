package Ejercicio19;

public class trianguloequi {
	double lado ,Perimetro,Altura,Area;
	
	
	public static double perimetro(double lado) {
		return lado * 3;
	}
	
	
	public static double altura(double lado) {
		return  Math.sqrt(Math.pow(lado, 2)-Math.pow(lado/2, 2));
	}
	
	public static double area(double lado) {
		return (lado*trianguloequi.altura(lado))/2;
	}
}
