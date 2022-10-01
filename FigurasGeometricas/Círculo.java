package FigurasGeometricas;

public class Círculo {

		int radio; 
		Círculo(int radio) {
		this.radio = radio;
		}
		double calcularArea() {
		return Math.PI*Math.pow(radio,2);
		}
		double calcularPerímetro() {
		return 2*Math.PI*radio;
		}
}
