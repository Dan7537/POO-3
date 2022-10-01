package Ejercicio23;

public class ecuacion {
	int avalor,bvalor,cvalor;
	
	
	
	public static String valorposit(double avalor,double bvalor,double cvalor) {
		double valorpo;
		valorpo= (-bvalor+(Math.sqrt(Math.pow(bvalor,2)+(4*avalor*cvalor))))/(2*avalor);
		return Double.toString(valorpo);
	}
	public static String valornega(double avalor,double bvalor,double cvalor) {
		double valornegat;
		valornegat= (-bvalor-(Math.sqrt(Math.pow(bvalor,2)+(4*avalor*cvalor))))/(2*avalor);
		return Double.toString(valornegat);
	}
}
