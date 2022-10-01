package Ejercicio19;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class frame extends JFrame {
	
  frame(){	
	 //Declaracion de las variables
	double lado = 0,flag=0;
	//Captura de los datos	  
			  String j ;
			  j = JOptionPane.showInputDialog("Ingrese la medida del lado: ");
			if (j == null  ) {
				System.exit(0);
			}
			
			else {	try {
				         lado =Double.parseDouble(j);
				         flag=1;
			             }
			catch (Exception ee) {
				JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",
						JOptionPane.ERROR_MESSAGE);
				
				new frame();
			}}
	
if (flag ==1) {
    //Creacion de los labels
	JLabel perimetroL = new JLabel("El perimetro del triángulo equilatero es: " +
    trianguloequi.perimetro(lado));
	perimetroL.setSize(110, 100);
	perimetroL.setBackground(Color.CYAN);
	perimetroL.setOpaque(true);
	
	
	JLabel alturaL = new JLabel("La altura del triángulo equilatero es: " +  trianguloequi.altura(lado));
	alturaL.setSize(100,100);
	
	JLabel areaL = new JLabel("El area del triángulo equilatero es: " +  trianguloequi.area(lado));
	areaL.setSize(100,100);
	areaL.setBackground(Color.CYAN);
	areaL.setOpaque(true);
	
	JButton button = new JButton("Regresar");
	button.setSize(100, 100);
	
	JButton button1 = new JButton("Salir");
	button.setSize(100, 100);
	
	//Creando el frame
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridLayout grid = new GridLayout(5,1);
	frame.setLayout(grid);
	frame.setSize(410,400);
	frame.setTitle("Triángulo equilatero");
	frame.setResizable(false);
	frame.add(perimetroL);
	frame.add(alturaL);
	frame.add(areaL);
	frame.add(button);
	frame.add(button1);
	
	//Configurando el boton Regresar
	button.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			if (e.getSource()== button) {
				//Cerrando el frame
				frame.dispose();
				//Reestableciendo el proceso
				new frame();
        }
		}}
    );
	//Configurando el boton Salir
	button1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			if (e.getSource()== button1) {
				//Cerrando el frame
				System.exit(0);
        }
		}}
    );
	
}
  }

}
