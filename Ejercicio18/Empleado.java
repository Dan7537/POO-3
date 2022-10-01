package Ejercicio18;

public class Empleado {
	
	 int codigo,numHoras;
	 String nombre;
	 double valorHora,porcenRetencion;
	
	
	
	public static int getcodigo(int codigo) {
		return codigo;
	}
	
	public static String getnombre(String nombre) {
		return nombre;
	}
	
	public static double getsalBruto(double valorHora,double numHoras) {
		return valorHora*numHoras;
	}
	public static double getsalNeto(double valorHora,double numHoras,double porcenRetencion) {
		return (valorHora*numHoras)-(valorHora*numHoras*porcenRetencion/100);
	}
}
