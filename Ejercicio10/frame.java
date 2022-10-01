package Ejercicio10;

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
		
		
		
		
		frame(){
			
			//Declaracion de los campos de texto
			JTextField  text1 = new JTextField();
			JTextField  text2 = new JTextField();
			JTextField  text3 = new JTextField();
			JTextField  text4 = new JTextField();
			
			//Inicializacion de los labels
			JLabel LB1= new JLabel();
			LB1.setVisible(true);
			LB1.setText("Número de inscripcion:");
			LB1.setBackground(new Color(0xad7a54));
			LB1.setOpaque(true);

			JLabel LB2 = new JLabel();
			LB2.setVisible(true);
			LB2.setText("Nombre:");
			LB2.setBackground(new Color(0xad7a54));
			LB2.setOpaque(true);
			
			JLabel LB3 = new JLabel();
			LB3.setVisible(true);
			LB3.setText("Patrimonio:");
			LB3.setBackground(new Color(0xad7a54));
			LB3.setOpaque(true);
			
			JLabel LB4 = new JLabel();
			LB4.setVisible(true);
			LB4.setText("Estrato:" );
			LB4.setBackground(new Color(0xad7a54));
			LB4.setOpaque(true);
			
			//Declaración del boton Enviar
			JButton button1 = new JButton("Envìar");
			button1.addActionListener(new ActionListener(){ 
				
				public void actionPerformed(ActionEvent e){  
					try {
					if (e.getSource()== button1) {
						
	
						
						//Mostrar por pantalla el resultado
						JOptionPane.showMessageDialog(null,matricula.getmatricula(Integer.parseInt(text1.getText()),
								text2.getText(),Integer.parseInt(text3.getText()),Integer.parseInt(text4.getText())),
								"Matrícula",JOptionPane.INFORMATION_MESSAGE);
		        }}
					catch(Exception ee) {
						JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
						
					}
				}}
		    );
			//Declaración del boton Salir
			JButton button2 = new JButton("Salir");
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
			GridLayout grid = new GridLayout(5,2);
			this.setLayout(grid);
			this.setTitle("Matrícula");
			this.setSize(400,500);
			this.setResizable(false);
			this.add(LB1);
			this.add(text1);
			this.add(LB2);
			this.add(text2);
			this.add(LB3);
			this.add(text3);
			this.add(LB4);
			this.add(text4);
			this.add(button1);
			this.add(button2);
			
		
		}
		
	}
	
	

