package FigurasGeometricas;

public class Trapecio {

	double baseMayor;
	double baseMenor;
	double altura;
	Trapecio(double baseMayor,double baseMenor,double altura){
		this.baseMayor=baseMayor;
		this.baseMenor=baseMenor;
		this.altura=altura;
	}
	double calcularArea(){
		return (baseMayor+baseMenor)/2*altura;
	}
	double calcularPerímetro(){
		return baseMayor+baseMenor+2*Math.sqrt(Math.pow(altura, 2)+Math.pow((baseMayor-baseMenor)/2, 2));
	}
}
