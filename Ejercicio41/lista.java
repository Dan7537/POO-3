package Ejercicio41;

import java.util.ArrayList;

public class lista {
	String ju;
	
	public static String mayor(String ju) {
		
		 
	        String[] str = ju.split(",");
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        for(String s: str){
	            int d = Integer.parseInt(s);
	            list.add(d);
	        }
	        int mayor=0;
	        for (int f:list) {
	        	if (f > mayor) {
	        		mayor = f;
	        	}
	        	
	        }
		
		return  Integer.toString(mayor);
			
		
	}
}
