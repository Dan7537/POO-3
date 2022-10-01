package Ejercicio7;
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
	
	//Constructor
	frame(){
		
		//Creacion de entradas de texto
		JTextField a = new JTextField();
		JTextField b = new JTextField();
		
		//Creacion de los labels
		JLabel aL = new JLabel("Ingrese el primer numero (A):");
		aL.setBackground(new Color(0x02b4b0));
		aL.setOpaque(true);
		JLabel bL = new JLabel("Ingrese el segundo numero (B):");
		bL.setBackground(new Color(0x02b4b0));
		bL.setOpaque(true);
		//Creacion del boton Enviar
		
		JButton button = new JButton("Enviar");
		//Configuracion del boton Enviar
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
				String message;
				String titlemessage = "Comprobación";
				//Declaracion de la logica matematica
				if (e.getSource()== button) {
					try {
					
					message = Mayor.mayor(Double.parseDouble(a.getText()),Double.parseDouble(b.getText()));
					
					JOptionPane.showMessageDialog(null, message,titlemessage,JOptionPane.INFORMATION_MESSAGE);
					}
					catch(Exception ee) {
						JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
					}
	        }
			}}
	    );
		//Creacion del boton Salir
		JButton button1 = new JButton("Salir");
	
		
		// Configuracion del frame
		this.setVisible(true);
		this.setSize(400,300);
		this.setResizable(false);
		GridLayout grid = new GridLayout(3,2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(grid);
		this.setTitle("Diferencia");
		this.add(aL);
		this.add(a);
		this.add(bL);
		this.add(b);
		this.add(button);
		this.add(button1);
		
		//Configuracion del boton Salir
		button1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				if (e.getSource()== button1) {
					System.exit(0);
				}
				
			}});
}
}