package FigurasGeometricas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

 

public class frame extends JFrame implements ActionListener{
	
	
	
		JTextField text ;
		JTextField text1 ;
		JTextField text2;
		JTextField text3;
		JTextField text4 ;	
		JTextField text5 ;
		JTextField text6 ;
		JTextField text7 ;
		JTextField text8 ;
		JTextField text9 ;
		JTextField text10 ;
		JTextField text11 ;
		JPanel panel0;
		JPanel panel;
		JPanel panel1;
		JButton button ;
		JFrame EP ;

		frame(){
	//Declaración y configuracion de los textfields,panels y botons
			 text = new JTextField();
			 text1 = new JTextField();
			 text2 = new JTextField();
			 text3 = new JTextField();
			 text4 = new JTextField();
			 text5 = new JTextField();
			 text6 = new JTextField();
			 text7= new JTextField();
			 text8 = new JTextField();
			 text9 = new JTextField();
			 text10 = new JTextField();
			 
			 
			 button = new JButton("calcular");
			 button.addActionListener(this);
			 button.setPreferredSize(new Dimension(200,50));
			 button.setHorizontalAlignment(JButton.CENTER);
			 button.setVerticalAlignment(JButton.CENTER);
			 
			 
			//Cofiguracion del bordo
				Border border = BorderFactory.createLineBorder(Color.white, 2);
				Border border1 = BorderFactory.createLineBorder(Color.black, 2);


				
			 panel0 = new JPanel();
			panel0.setBounds(0, 0,1000, 65);
			panel0.setBackground(new Color(0x8897cd));
			panel0.setBorder(border1);
			
			 panel= new JPanel();
			panel.setBackground(new Color(0x0d6bf4));
			panel.setBounds(0, 65,1000, 300);
			panel.setOpaque(true);
			panel.setBorder(border1);
			
			 panel1 = new JPanel();
			panel1.add(button);
			panel1.setBounds(0, 365,1000, 70);
			panel1.setBackground(new Color(0x8897cd));
			panel1.setOpaque(true);
			panel1.setBorder(border1);

			//Configuracion del frame
			EP = new JFrame();
			EP.setTitle("Figuras geometicas");
			EP.setVisible(true);
			EP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			EP.setLayout(null);
			EP.setSize(1000,470);
			EP.setResizable(false);
			

			//Creaación de los labels
			
			JLabel LB0 = new JLabel();
			LB0.setVisible(true);
			LB0.setHorizontalAlignment(JLabel.CENTER);
			LB0.setVerticalAlignment(JLabel.CENTER);
			LB0.setText("Figuras geometrícas");
			LB0.setFont(new Font("",Font.PLAIN,30));
		
			
			JLabel LB = new JLabel();
			LB.setVisible(true);
			LB.setHorizontalAlignment(JLabel.RIGHT);
			LB.setText("Circulo                                                        Radio:");
			LB.setBorder(border);
			
			JLabel LB1= new JLabel();
			LB1.setVisible(true);
			LB1.setHorizontalAlignment(JLabel.CENTER);
			LB1.setText("Rectángulo               Base:");
			LB1.setBorder(border);

			JLabel LB2 = new JLabel();
			LB2.setVisible(true);
			LB2.setHorizontalAlignment(JLabel.CENTER);
			LB2.setText("Altura:");
			LB2.setBorder(border);
			
			JLabel LB3 = new JLabel();
			LB3.setVisible(true);
			LB3.setHorizontalAlignment(JLabel.RIGHT);
			LB3.setText("Cuadrado                                                       Lado:");
			LB3.setBorder(border);
		
			JLabel LB4 = new JLabel();
			LB4.setVisible(true);
			LB4.setHorizontalAlignment(JLabel.CENTER);
			LB4.setText("Triángulo rectángulo             Base:" );
			LB4.setBorder(border);
		
			JLabel LB5 = new JLabel();
			LB5.setVisible(true);
			LB5.setHorizontalAlignment(JLabel.CENTER);
			LB5.setText("Altura:" );
			LB5.setBorder(border);
			
			JLabel LB6 = new JLabel();
			LB6.setVisible(true);
			LB6.setHorizontalAlignment(JLabel.CENTER);
			LB6.setText("Rombo               Diagonal mayor:" );
			LB6.setBorder(border);
			
			JLabel LB7 = new JLabel();
			LB7.setVisible(true);
			LB7.setHorizontalAlignment(JLabel.CENTER);
			LB7.setText("Diagonal menor:" );
			LB7.setBorder(border);
		
			JLabel LB8 = new JLabel();
			LB8.setVisible(true);
			LB8.setHorizontalAlignment(JLabel.CENTER);
			LB8.setText("Trapecio         Base mayor:" );
			LB8.setBorder(border);
		
			JLabel LB9 = new JLabel();
			LB9.setVisible(true);
			LB9.setHorizontalAlignment(JLabel.CENTER);
			LB9.setText("Base menor:" );
			LB9.setBorder(border);
		
			JLabel LB10 = new JLabel();
			LB10.setVisible(true);
			LB10.setHorizontalAlignment(JLabel.CENTER);
			LB10.setText("Altura:" );
			LB10.setBorder(border);
		
		
			
			//Configurando las filas
			
			JPanel panelcir= new JPanel();
			GridLayout gri = new GridLayout(1,2);
			panelcir.setLayout(gri);
			panelcir.setBackground(new Color(0x0d6bf4));
			panelcir.add(LB);
			panelcir.add(text);
			
			
			JPanel panelrec= new JPanel();
			GridLayout gri1 = new GridLayout(1,4);
			panelrec.setLayout(gri1);
			panelrec.setBackground(new Color(0x0d6bf4));
			panelrec.add(LB1);
			panelrec.add(text1);
			panelrec.add(LB2);
			panelrec.add(text2);
			
			
			JPanel panelcua= new JPanel();
			GridLayout gri2 = new GridLayout(1,2);
			panelcua.setLayout(gri2);
			panelcua.setBackground(new Color(0x0d6bf4));
			panelcua.add(LB3);
			panelcua.add(text3);
			
			
			JPanel paneltrire= new JPanel();
			GridLayout gri3 = new GridLayout(1,4);
			paneltrire.setLayout(gri3);
			paneltrire.setBackground(new Color(0x0d6bf4));
			paneltrire.add(LB4);
			paneltrire.add(text4);
			paneltrire.add(LB5);
			paneltrire.add(text5);
			
			
			JPanel panelrom= new JPanel();
			GridLayout gri4 = new GridLayout(1,4);
			panelrom.setLayout(gri4);
			panelrom.setBackground(new Color(0x0d6bf4));
			panelrom.add(LB6);
			panelrom.add(text6);
			panelrom.add(LB7);
			panelrom.add(text7);
			
			
			
			JPanel paneltra= new JPanel();
			GridLayout gri5 = new GridLayout(1,6);
			paneltra.setLayout(gri5);
			paneltra.setBackground(new Color(0x0d6bf4));
			paneltra.add(LB8);
			paneltra.add(text8);
			paneltra.add(LB9);
			paneltra.add(text9);
			paneltra.add(LB10);
			paneltra.add(text10);
		
			
			
			
			
			
			
			//Configuración de los panels
			GridLayout grid = new GridLayout(6,2);
			panel.setLayout(grid);
			
			panel0.add(LB0);
			panel.add(panelcir);
			panel.add(panelcua);
			panel.add(panelrec);
			panel.add(paneltrire);
			panel.add(panelrom);
			panel.add(paneltra);
			
			
			EP.add(panel0);
			EP.add(panel);
			EP.add(panel1);

		}
		
			

		
	//Configurando el boton Calcular
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()== button) {
				
				
				
				try{	
					
				
					//Creación de los objetos
					
					Círculo circulo = new Círculo(Integer.parseInt(text.getText()));
					Rectángulo rectangulo = new Rectángulo(Integer.parseInt(text1.getText()),Integer.parseInt(text2.getText()));
					Cuadrado cuadrado = new Cuadrado(Integer.parseInt(text3.getText()));
					TriánguloRectángulo trianrectan = new TriánguloRectángulo(Integer.parseInt(text4.getText()),Integer.parseInt(text5.getText()));
					Rombo rombo = new Rombo(Integer.parseInt(text6.getText()),Integer.parseInt(text7.getText()));
					Trapecio trapecio = new Trapecio(Integer.parseInt(text8.getText()),Integer.parseInt(text9.getText()),Integer.parseInt(text10.getText()));

					EP.remove(panel0);
					EP.remove(panel);
					EP.remove(panel1);
					
				//Creación del segundo frame
				//JFrame EP=new JFrame();
				EP.setVisible(true);
				EP.setSize(600,400);
				EP.setTitle("Figuras");
				EP.setLayout(null);
				EP.setResizable(false);
				EP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				

				//Cofiguracion del bordo
				Border border2 = BorderFactory.createLineBorder(Color.white, 2);
				
				
				
				//Declaración de los labels
				JLabel figura = new JLabel();
				figura.setVisible(true);
				figura.setBackground(new Color(0x9da492));
				figura.setOpaque(true);
				figura.setText("Figura ");
				figura.setBorder(border2);
				figura.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel perimetro = new JLabel();
				perimetro.setVisible(true);
				perimetro.setBackground(new Color(0x9da492));
				perimetro.setOpaque(true);
				perimetro.setText("Perímetro");
				perimetro.setBorder(border2);
				perimetro.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel area = new JLabel();
				area.setVisible(true);
				area.setBackground(new Color(0x9da492));
				area.setOpaque(true);
				area.setText("Área");
				area.setBorder(border2);
				area.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel circulol = new JLabel();
				circulol.setVisible(true);
				circulol.setBackground(new Color(0xb5c9ce));
				circulol.setOpaque(true);
				circulol.setText("Círculo");
				circulol.setBorder(border2);
				circulol.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel pericirculo = new JLabel();
				pericirculo.setVisible(true);
				pericirculo.setBackground(new Color(0xb5c9ce));
				pericirculo.setOpaque(true);
				pericirculo.setText(Double.toString(circulo.calcularPerímetro()));
				pericirculo.setBorder(border2);
				pericirculo.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel areacirculo = new JLabel();
				areacirculo.setVisible(true);
				areacirculo.setBackground(new Color(0xb5c9ce));
				areacirculo.setOpaque(true);
				areacirculo.setText(Double.toString(circulo.calcularArea()));
				areacirculo.setBorder(border2);
				areacirculo.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel cuadrad = new JLabel();
				cuadrad.setVisible(true);
				cuadrad.setBackground(new Color(0xb5c9ce));
				cuadrad.setOpaque(true);
				cuadrad.setText("Cuadrado");
				cuadrad.setBorder(border2);
				cuadrad.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel pericuadr = new JLabel();
				pericuadr.setVisible(true);
				pericuadr.setBackground(new Color(0xb5c9ce));
				pericuadr.setOpaque(true);
				pericuadr.setText(Double.toString(cuadrado.calcularPerímetro()));
				pericuadr.setBorder(border2);
				pericuadr.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel areacuadra = new JLabel();
				areacuadra.setVisible(true);
				areacuadra.setBackground(new Color(0xb5c9ce));
				areacuadra.setOpaque(true);
				areacuadra.setText(Double.toString(cuadrado.calcularArea()));
				areacuadra.setBorder(border2);
				areacuadra.setHorizontalAlignment(JLabel.CENTER);


				JLabel rectan = new JLabel();
				rectan.setVisible(true);
				rectan.setBackground(new Color(0xb5c9ce));
				rectan.setOpaque(true);
				rectan.setText("Rectángulo");
				rectan.setBorder(border2);
				rectan.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel perirectan = new JLabel();
				perirectan.setVisible(true);
				perirectan.setBackground(new Color(0xb5c9ce));
				perirectan.setOpaque(true);
				perirectan.setText(Double.toString(rectangulo.calcularPerímetro()));
				perirectan.setBorder(border2);
				perirectan.setHorizontalAlignment(JLabel.CENTER);

				
				JLabel arearectan = new JLabel();
				arearectan.setVisible(true);
				arearectan.setBackground(new Color(0xb5c9ce));
				arearectan.setOpaque(true);
				arearectan.setText(Double.toString(rectangulo.calcularArea()));
				arearectan.setBorder(border2);
				arearectan.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel trianrecta = new JLabel();
				trianrecta.setVisible(true);
				trianrecta.setBackground(new Color(0xb5c9ce));
				trianrecta.setOpaque(true);
				trianrecta.setText("Triángulo rectángulo");
				trianrecta.setBorder(border2);
				trianrecta.setHorizontalAlignment(JLabel.CENTER);

				
				
				JLabel peritriarecta = new JLabel();
				peritriarecta.setVisible(true);
				peritriarecta.setBackground(new Color(0xb5c9ce));
				peritriarecta.setOpaque(true);
				peritriarecta.setText(Double.toString(trianrectan.calcularPerímetro()));
				peritriarecta.setBorder(border2);
				peritriarecta.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel areatrianrecta = new JLabel();
				areatrianrecta.setVisible(true);
				areatrianrecta.setBackground(new Color(0xb5c9ce));
				areatrianrecta.setOpaque(true);
				areatrianrecta.setText(Double.toString(trianrectan.calcularArea()));
				areatrianrecta.setBorder(border2);
				areatrianrecta.setHorizontalAlignment(JLabel.CENTER);

				
				

				
				
				JLabel romb = new JLabel();
				romb.setVisible(true);
				romb.setBackground(new Color(0xb5c9ce));
				romb.setOpaque(true);
				romb.setText("Rombo");
				romb.setBorder(border2);
				romb.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel perirombo = new JLabel();
				perirombo.setVisible(true);
				perirombo.setBackground(new Color(0xb5c9ce));
				perirombo.setOpaque(true);
				perirombo.setText(Double.toString(rombo.calcularPerímetro()));
				perirombo.setBorder(border2);
				perirombo.setHorizontalAlignment(JLabel.CENTER);
				
				JLabel arearombo = new JLabel();
				arearombo.setVisible(true);
				arearombo.setBackground(new Color(0xb5c9ce));
				arearombo.setOpaque(true);
				arearombo.setText(Double.toString(rombo.calcularArea()));
				arearombo.setHorizontalAlignment(JLabel.CENTER);
				arearombo.setBorder(border2);

				
				JLabel trape = new JLabel();
				trape.setVisible(true);
				trape.setBackground(new Color(0xb5c9ce));
				trape.setOpaque(true);
				trape.setText("Trapecio");
				trape.setHorizontalAlignment(JLabel.CENTER);
				trape.setBorder(border2);
				
				JLabel peritrape = new JLabel();
				peritrape.setVisible(true);
				peritrape.setBackground(new Color(0xb5c9ce));
				peritrape.setOpaque(true);
				peritrape.setText(Double.toString(trapecio.calcularPerímetro()));
				peritrape.setHorizontalAlignment(JLabel.CENTER);
				peritrape.setBorder(border2);
				
				JLabel areatrape = new JLabel();
				areatrape.setVisible(true);
				areatrape.setBackground(new Color(0xb5c9ce));
				areatrape.setOpaque(true);
				areatrape.setText(Double.toString(trapecio.calcularArea()));
				areatrape.setHorizontalAlignment(JLabel.CENTER);
				areatrape.setBorder(border2);

				

				
				
				
				
				
				
				
				
				
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
							//Cerrando el frame
							System.exit(0);
			        }
					}}
			    );
				
				
				
				//Declaracion de los panels
				JPanel jp0 = new JPanel();
				GridLayout grid = new GridLayout(7,3);
				jp0.setLayout(grid);
				jp0.setBounds(0,0,600,300);
				
				jp0.add(figura);
				jp0.add(perimetro);
				jp0.add(area);
				
				jp0.add(circulol);
				jp0.add(pericirculo);
				jp0.add(areacirculo);
				
				jp0.add(rectan);
				jp0.add(perirectan);
				jp0.add(arearectan);
				
				jp0.add(cuadrad);
				jp0.add(pericuadr);
				jp0.add(areacuadra);
				
				jp0.add(trianrecta);
				jp0.add(peritriarecta);
				jp0.add(areatrianrecta);
				
				jp0.add(romb);
				jp0.add(perirombo);
				jp0.add(arearombo);
				jp0.add(perirombo);
				
				jp0.add(trape);				
				jp0.add(peritrape);
				jp0.add(areatrape);
				
				
				
				
				
				JPanel jp1 = new JPanel();
				GridLayout gir = new GridLayout(1,2);
				jp1.setLayout(gir);
				jp1.setBounds(0,300,600,50);
				jp1.add(button1);
				jp1.add(button2);
				

				EP.add(jp0);
				EP.add(jp1);
				}
				//Configurando la excepcion
				catch(Exception NumberFormatException ) {
					JOptionPane.showMessageDialog(null, "El formato ingresado es incorrecto","ERROR",JOptionPane.ERROR_MESSAGE);
					
					 }
					}

			}

		}

