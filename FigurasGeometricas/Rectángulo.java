package FigurasGeometricas;

public class Rectángulo {
	int base; 
	int altura; 

	Rectángulo(int base, int altura) {
	this.base = base;
	this.altura = altura;
	}

	double calcularArea() {
	return base * altura;
	}

	double calcularPerímetro() {
	return (2 * base) + (2 * altura);
	}
}
