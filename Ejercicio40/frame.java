package Ejercicio40;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class frame extends JFrame{
	
	JFrame frame1;
	JTextField  text1;
	JButton button1;
	JButton button2;
		frame(){
			
			//Creacion del label y textfield
			JLabel LB1= new JLabel();
			LB1.setVisible(true);
			LB1.setText("Escriba los numeros:");
			LB1.setBackground(new Color(0x8b7c7e));
			LB1.setOpaque(true);			
		    text1 = new JTextField();
			
			//Declaracion del boton Enviar
			button1 = new JButton("Envìar");
			button1.setBackground(new Color(0xc1b9b1));
			button1.setOpaque(true);
			button1.addActionListener(new ActionListener(){ 
				
				//Configuracion del bonton Enviar
				public void actionPerformed(ActionEvent e){  
					try {												
					if (e.getSource()== button1 ) {
						//Obtencion de los numeros
						    ArrayList<Double> list = lista.obtener(text1.getText());
						    
					        //Definicion de los bordos
					        Border border = BorderFactory.createLineBorder(Color.white, 2);
      
					        JLabel label1 = new JLabel();
					        label1.setText("Número");
					        label1.setHorizontalAlignment(JLabel.CENTER);
					        label1.setBorder(border);
					        label1.setBackground(Color.gray);
					        label1.setOpaque(true);
					        		
					        JLabel label2 = new JLabel();
					        label2.setText("Raíz");
					        label2.setHorizontalAlignment(JLabel.CENTER);
					        label2.setBorder(border);
					        label2.setBackground(Color.gray);
					        label2.setOpaque(true);
					        
					        JLabel label3 = new JLabel();
					        label3.setText("Cuadrado");
					        label3.setHorizontalAlignment(JLabel.CENTER);
					        label3.setBorder(border);
					        label3.setBackground(Color.gray);
					        label3.setOpaque(true);
					        
					        JLabel label4 = new JLabel();
					        label4.setText("Cubo");
					        label4.setHorizontalAlignment(JLabel.CENTER);  
					        label4.setBorder(border);
					        label4.setBackground(Color.gray);
					        label4.setOpaque(true);
					        
					        JPanel panelre= new JPanel();
					        panelre.add(label1);
				        	panelre.add(label2);
				        	panelre.add(label3);
				        	panelre.add(label4);
					        //Creacion de las filas 
					        for (double r:list) {
					        	double ra,cua,cub;
					        	ra=Math.sqrt(r);
					        	cua=Math.pow(r, 2);
					        	cub=Math.pow(r, 3);
					        	
					        	JLabel lb= new JLabel();
					        	lb.setText(Double.toString(r));
					        	lb.setHorizontalAlignment(JLabel.CENTER);
					        	lb.setBackground(Color.ORANGE);
					        	lb.setOpaque(true);
					        	lb.setBorder(border);
					        	
					        	JLabel lb1= new JLabel();
					        	lb1.setText(Double.toString(ra));
					        	lb1.setHorizontalAlignment(JLabel.CENTER);
					        	lb1.setBackground(Color.ORANGE);
					        	lb1.setOpaque(true);
					        	lb1.setBorder(border);
					        	
					        	JLabel lb2= new JLabel();
					        	lb2.setText(Double.toString(cua));
					        	lb2.setHorizontalAlignment(JLabel.CENTER);
					        	lb2.setBackground(Color.ORANGE);
					        	lb2.setOpaque(true);
					        	lb2.setBorder(border);
					        	
					        	JLabel lb3= new JLabel();
					        	lb3.setText(Double.toString(cub));
					        	lb3.setHorizontalAlignment(JLabel.CENTER);
					        	lb3.setBackground(Color.ORANGE);
					        	lb3.setOpaque(true);
					        	lb3.setBorder(border);
					        	
					        	panelre.add(lb);
					        	panelre.add(lb1);
					        	panelre.add(lb2);
					        	panelre.add(lb3);
					        }
					        
					        JLabel otro= new JLabel();      	        
				        	JLabel otro1= new JLabel();
    	
				        	JButton buttonr = new JButton("Regresar");
				        	buttonr.addActionListener(new ActionListener(){  
								public void actionPerformed(ActionEvent e){  
									if (e.getSource()== buttonr) {
										frame1.dispose();
										new frame();
						        }
								}}
						    );
				        	JButton buttons = new JButton("Salir");
				        	buttons.addActionListener(new ActionListener(){  
								public void actionPerformed(ActionEvent e){  
									if (e.getSource()== buttons) {
										//Cerrando el frame
										System.exit(0);
						        }
								}}
						    );
				        	
				        	
				        	
				        	GridLayout gt = new GridLayout(list.size()+2,4);
					        panelre.setLayout(gt);
					        panelre.add(otro);
					        panelre.add(buttonr);
					        panelre.add(buttons);
					        panelre.add(otro1);
					        
					        
					        
					        
					        frame1.remove(LB1);
							frame1.remove(text1);
							frame1.remove(button1);
							frame1.remove(button2);
					        
					        //Declaracion del frame
					        
					        frame1.setVisible(true);
					        frame1.setResizable(true);
					        frame1.setTitle("Tabla");
					        frame1.setBackground(Color.ORANGE);
					        frame1.setMinimumSize(new Dimension(320,355));
					        GridLayout g = new GridLayout(1,1);
					        frame1.setLayout(g);
					        frame1.add(panelre);
		        }}
					catch(Exception ee) {
						JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",
								JOptionPane.ERROR_MESSAGE);						
					}}});
				
			//Declaración del boton Salir
			button2 = new JButton("Salir");
			button2.setBackground(new Color(0xc1b9b1));
			button2.setOpaque(true);
			button2.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					if (e.getSource()== button2) {
						//Cerrando el frame
						System.exit(0); 
		        }
				}});
			
			//Configuracion del frame
		    frame1 = new JFrame();
			frame1.setVisible(true);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GridLayout grid = new GridLayout(2,2);
			frame1.setLayout(grid);
			frame1.setTitle("Números");
			frame1.setSize(300,100);
			frame1.setResizable(false);
			frame1.add(LB1);
			frame1.add(text1);
			frame1.add(button1);
			frame1.add(button2);
		}
	}

