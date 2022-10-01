package Ejercicio23;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frame extends JFrame{
		
		//Declaracion de variables
		String valorpo;
		String valorne;
		String message;
		frame(){
			//Declaracion de los campos de texto
			JTextField  text1 = new JTextField();
			JTextField  text2 = new JTextField();
			JTextField  text3 = new JTextField();
			
			//Inicializacion de los labels
			JLabel LB1= new JLabel();
			LB1.setVisible(true);
			LB1.setText("Escriba el valor de  A:");
			LB1.setBackground(new Color(0x8b7c7e));
			LB1.setOpaque(true);

			JLabel LB2 = new JLabel();
			LB2.setVisible(true);
			LB2.setText("Escriba el valor de  B:");
			LB2.setBackground(new Color(0x8b7c7e));
			LB2.setOpaque(true);
			
			JLabel LB3 = new JLabel();
			LB3.setVisible(true);
			LB3.setText("Escriba el valor de  C:");
			LB3.setBackground(new Color(0x8b7c7e));
			LB3.setOpaque(true);
									
			//Declaración del boton Enviar
			JButton button1 = new JButton("Envìar");
			button1.setBackground(new Color(0xc1b9b1));
			button1.setOpaque(true);
			button1.addActionListener(new ActionListener(){ 
				
				public void actionPerformed(ActionEvent e){  
					try {
					if (e.getSource()== button1) {
						
						//Asignacion de las variables
						valorpo=ecuacion.valorposit(Double.parseDouble(text1.getText()),
								Double.parseDouble(text2.getText()),
								Double.parseDouble(text3.getText()));
						valorne=ecuacion.valornega(Double.parseDouble(text1.getText()),
								Double.parseDouble(text2.getText()),
								Double.parseDouble(text3.getText()));
						
						message = "Las posibles soluciones de la ecuacion son: "+valorpo + " Y " + valorne;
						//Mostrar por pantalla el resultado
						JOptionPane.showMessageDialog(null,message,"Raices",JOptionPane.INFORMATION_MESSAGE);
		        }}
					catch(Exception ee) {
						JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",
								JOptionPane.ERROR_MESSAGE);
						
					}
				}}
		    );
			//Declaración del boton Salir
			JButton button2 = new JButton("Salir");
			button2.setBackground(new Color(0xc1b9b1));
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
			GridLayout grid = new GridLayout(4,2);
			this.setLayout(grid);
			this.setTitle("Trinomio cuadrado perfecto");
			this.setSize(330,300);
			this.setResizable(false);
			this.add(LB1);
			this.add(text1);
			this.add(LB2);
			this.add(text2);
			this.add(LB3);
			this.add(text3);
			this.add(button1);
			this.add(button2);
			
		
		}
	}

