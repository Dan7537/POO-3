package Ejercicio18;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frame extends JFrame implements ActionListener{
	//Creación de los objetos
		JTextField text ;
		JTextField text1 ;
		JTextField text2;
		JTextField text3;
		JTextField text4 ;	
		JButton button ;
		JPanel panel;
		JPanel panel1;
		JFrame EP ;

		frame(){
	//Declaración y configuracion de los textfields,panels y botons
			 text = new JTextField();
			 text1 = new JTextField();
			 text2 = new JTextField();
			 text3 = new JTextField();
			 text4 = new JTextField();
			 button = new JButton("calcular");
			 button.addActionListener(this);
			panel= new JPanel();
			panel.setBackground(new Color(0x0d6bf4));
			panel.setBounds(0, 0,500, 350);
			panel.setOpaque(true);
		    panel1 = new JPanel();
			button.setPreferredSize(new Dimension(200,50));
			panel1.add(button);
			panel1.setBounds(0, 350,500, 100);
			panel1.setBackground(new Color(0x8897cd));
			panel1.setOpaque(true);
			
			//Configuracion del frame
			EP = new JFrame();
			EP.setTitle("EMPLEADO");
			EP.setVisible(true);
			EP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			EP.setLayout(null);
			EP.setSize(500,470);
			EP.setResizable(false);
			
			//Creaación de los labels
			JLabel LB = new JLabel();
			LB.setVisible(true);
			LB.setText("Código:");
			
			JLabel LB1= new JLabel();
			LB1.setVisible(true);
			LB1.setText("Nombre:");

			JLabel LB2 = new JLabel();
			LB2.setVisible(true);
			LB2.setText("Número de horas trabajadas:");
			
			JLabel LB3 = new JLabel();
			LB3.setVisible(true);
			LB3.setText("Valor de horas trabajadas:");
		
			JLabel LB4 = new JLabel();
			LB4.setVisible(true);
			LB4.setText("Porcentaje de retención en la fuente:" );
		
		
			//Configuración de los panels
			GridLayout grid = new GridLayout(5,2);
			panel.setLayout(grid);
			panel.add(LB);
			panel.add(text);
			panel.add(LB1);
			panel.add(text1);
			panel.add(LB2);
			panel.add(text2);
			panel.add(LB3);
			panel.add(text3);
			panel.add(LB4);
			panel.add(text4);
			
			EP.add(panel);
			EP.add(panel1);

		}

	//Configurando el boton Calcular
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()== button) {	
				try{	
				
				//Declaración de los labels
				JLabel codigoL = new JLabel();
				codigoL.setVisible(true);
				codigoL.setBackground(new Color(0xb5c9ce));
				codigoL.setOpaque(true);
				codigoL.setText("Código: "+ Empleado.getcodigo(Integer.parseInt(text.getText())));
				codigoL.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel nombreL = new JLabel();
				nombreL.setVisible(true);
				nombreL.setBackground(new Color(0xb5c9ce));
				nombreL.setOpaque(true);
				nombreL.setText("Nombre: "+Empleado.getnombre(text1.getText()));
				nombreL.setHorizontalAlignment(JLabel.CENTER);

				JLabel salbrutoL = new JLabel();
				salbrutoL.setVisible(true);
				salbrutoL.setBackground(new Color(0xb5c9ce));
				salbrutoL.setOpaque(true);
				salbrutoL.setText("Salario bruto: "+ Empleado.getsalBruto(Double.parseDouble(text3.getText()),Double.parseDouble(text2.getText())));
				salbrutoL.setHorizontalAlignment(JLabel.CENTER);

				JLabel salnetoL = new JLabel();
				salnetoL.setVisible(true);
				salnetoL.setOpaque(true);
				salnetoL.setBackground(new Color(0xb5c9ce));
				salnetoL.setText("Salario neto: " + Empleado.getsalNeto(Double.parseDouble(text3.getText()),Double.parseDouble(text2.getText()),Double.parseDouble(text4.getText())));
				salnetoL.setHorizontalAlignment(JLabel.CENTER);
				

				//Modificacion del frame
				EP.remove(panel);
				EP.remove(panel1);	
				EP.setVisible(true);
				EP.setSize(200,300);
				EP.setResizable(false);
				EP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GridLayout grid = new GridLayout(6,1);
				EP.setLayout(grid);
				
				//Declaración del boton Regresar
				JButton button1 = new JButton("Regresar");
				button1.addActionListener(new ActionListener(){  
					public void actionPerformed(ActionEvent e){  
						if (e.getSource()== button1) {
							//Cerrando el segundo frame  
							EP.dispose();
							//Creando un frame nuevo
							frame frame = new frame();
			        }
					}}
			    );
				//Declaración del boton Salir
				JButton button2 = new JButton("Salir");
				button2.addActionListener(new ActionListener(){  
					public void actionPerformed(ActionEvent e){  
						if (e.getSource()== button2) {
							//Cerrando el segundo frame
							System.exit(0);
			        }
					}}
			    );
				
				EP.add(codigoL);
				EP.add(nombreL);
				EP.add(salbrutoL);
				EP.add(salnetoL);
				EP.add(button1);
				EP.add(button2);
				}
				//Configurando la excepcion
				catch(Exception NumberFormatException ) {
					JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto",
							"ERROR",JOptionPane.ERROR_MESSAGE);
					
					 }
					}

			}

		}

