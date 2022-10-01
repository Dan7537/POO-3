package Ejercicio41;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frame extends JFrame{
	
	frame(){
		
		//Creacion del label y textfield
		JLabel LB1= new JLabel();
		LB1.setVisible(true);
		LB1.setText("Escriba los numeros:");
		LB1.setBackground(new Color(0x9cf4be));
		LB1.setOpaque(true);
		
		
		JTextField  text1 = new JTextField();
		
		
		//Declaracion del boton Enviar
		JButton button1 = new JButton("Envìar");
		button1.setBackground(new Color(0x0b7a9c));
		button1.setOpaque(true);
		button1.addActionListener(new ActionListener(){ 
			
			//Configuracion del bonton Enviar
			public void actionPerformed(ActionEvent e){  
				try {
					
					//Obtencion de los numeros
					
		
				        if (e.getSource()== button1 ) { 
				        	JOptionPane.showMessageDialog(null,"El mayor valor de la lista es: " + lista.mayor(text1.getText()),"Mayor valor",JOptionPane.INFORMATION_MESSAGE);
				        }}
				catch(Exception ee) {
					JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
					
				}
			}}
	         );
		
		
		
		
		
		
		//Declaración del boton Salir
		JButton button2 = new JButton("Salir");
		button2.setBackground(new Color(0x0b7a9c));
		button2.setOpaque(true);
		button2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				if (e.getSource()== button2) {
					//Cerrando el frame
					System.exit(0);
	        }
			}}
	    );
		
		//Configuracion del frame
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(2,2);
		this.setLayout(grid);
		this.setTitle("Mayor valor");
		this.setSize(300,100);
		this.setResizable(false);
		this.add(LB1);
		this.add(text1);
		this.add(button1);
		this.add(button2);
	}
}

