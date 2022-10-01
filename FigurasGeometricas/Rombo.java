package FigurasGeometricas;

public class Rombo {
	double diagonal_mayor;
	double diagonal_menor;
	
	
	Rombo(double diagonal_mayor,double diagonal_menor){
		this.diagonal_mayor= diagonal_mayor;
		this.diagonal_menor = diagonal_menor;
	}
	
	Double calcularArea(){
		return (diagonal_mayor*diagonal_menor)/2;
	}
	Double calcularPerímetro(){
		return 2*Math.sqrt(Math.pow(diagonal_mayor, 2)+Math.pow(diagonal_menor,2));
	}
}
