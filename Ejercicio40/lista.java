package Ejercicio40;

import java.util.ArrayList;

public class lista {
	String ju;
	
	public static ArrayList<Double> obtener(String ju){
		
	        String[] str = ju.split(",");
	        ArrayList<Double> list = new ArrayList<Double>();
	        for(String s: str){
	            double d = Double.parseDouble(s);
	            list.add(d);
	        }
	
	        return list;
	}
}
