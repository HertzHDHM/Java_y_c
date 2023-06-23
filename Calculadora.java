import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JFrame implements ActionListener{

String signo;
float n1,n2;

	public JButton cero;
	public JButton uno;
	public JButton dos;
	public JButton tres;
	public JButton cuatro;
	public JButton cinco;
	public JButton seis;
	public JButton siete;
	public JButton ocho;
	public JButton nueve;

	public JButton punto;

	public JButton suma;
	public JButton resta;
	public JButton multi;
	public JButton divi;

	public JButton igual;
	public JButton ce;

	public JTextField pantalla;
	

	public Calculadora(){

		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(0,0,0));//Color de fondo
		setIconImage(new ImageIcon(getClass().getResource("Calculadora logo.jpg")).getImage());//ICONO
		Font fuente = new Font("Arial",Font.PLAIN,32);//Tamaño Fuente de letra y tipo de fuente
		Font decimal = new Font("Arial",Font.BOLD,25);
		setTitle("Calculadora Hackeada");
		pantalla = new JTextField();
		pantalla.setHorizontalAlignment(SwingConstants.RIGHT);//Sentido del texto en el campo de texto
		pantalla.setFont(fuente);
		pantalla.setBackground(new Color(64,64,64));//Color de campo de texto
		pantalla.setForeground(Color.CYAN);//Color de letras
		pantalla.setBounds(25,50,300,100);
		add(pantalla);

		Font tecla = new Font("Arial",Font.PLAIN,18);
		cero = new JButton("0");
		cero.setFont(tecla);
		cero.setForeground(Color.RED);
		cero.setBackground(Color.ORANGE);
		cero.setBounds(25,360,105,45);
		add(cero);

		//Punto decimal
		punto = new JButton(".");
		punto.setFont(decimal);
		punto.setForeground(Color.RED);
		punto.setBackground(Color.ORANGE);
		punto.setBounds(145,360,45,45);
		add(punto);

		//Signo +
		suma = new JButton("+");
		suma.setFont(tecla);
		suma.setForeground(Color.RED);
		suma.setBackground(Color.YELLOW);
		suma.setBounds(205,360,45,45);
		add(suma);

		//Igual
		igual = new JButton("=");
		igual.setFont(tecla);
		igual.setBackground(Color.RED);
		igual.setForeground(Color.WHITE);
		igual.setBounds(265,300,60,105);
		add(igual);

		uno = new JButton("1");
		uno.setFont(tecla);
		uno.setForeground(Color.RED);
		uno.setBackground(Color.ORANGE);
		uno.setBounds(25,300,45,45);
		add(uno);

		dos = new JButton("2");
		dos.setFont(tecla);
		dos.setForeground(Color.RED);
		dos.setBackground(Color.ORANGE);
		dos.setBounds(85,300,45,45);
		add(dos);

		tres = new JButton("3");
		tres.setFont(tecla);
		tres.setForeground(Color.RED);
		tres.setBackground(Color.ORANGE);
		tres.setBounds(145,300,45,45);
		add(tres);


		//Signo de menos
		resta = new JButton("-");
		resta.setFont(tecla);
		resta.setForeground(Color.RED);
		resta.setBackground(Color.YELLOW);
		resta.setBounds(205,300,45,45);
		add(resta);

		//multiplicacion
		multi = new JButton("x");
		multi.setFont(tecla);
		multi.setForeground(Color.RED);
		multi.setBackground(Color.YELLOW);
		multi.setBounds(205,240,45,45);
		add(multi);

		//division
		divi = new JButton("/");
		divi.setFont(tecla);
		divi.setForeground(Color.RED);
		divi.setBackground(Color.YELLOW);
		divi.setBounds(205,180,45,45);
		add(divi);

		//limpiar pantalla
		ce = new JButton("CE");
		ce.setFont(tecla);
		ce.setForeground(Color.WHITE);
		ce.setBackground(Color.RED);
		ce.setBounds(265,180,60,105);
		add(ce);

		cuatro = new JButton("4");
		cuatro.setFont(tecla);
		cuatro.setForeground(Color.RED);
		cuatro.setBackground(Color.ORANGE);
		cuatro.setBounds(25,240,45,45);
		add(cuatro);
		cinco = new JButton("5");
		cinco.setFont(tecla);
		cinco.setForeground(Color.RED);
		cinco.setBackground(Color.ORANGE);
		cinco.setBounds(85,240,45,45);
		add(cinco);
		seis = new JButton("6");
		seis.setFont(tecla);
		seis.setForeground(Color.RED);
		seis.setBackground(Color.ORANGE);
		seis.setBounds(145,240,45,45);
		add(seis);
		siete = new JButton("7");
		siete.setFont(tecla);
		siete.setForeground(Color.RED);
		siete.setBackground(Color.ORANGE);
		siete.setBounds(25,180,45,45);
		add(siete);
		ocho = new JButton("8");
		ocho.setFont(tecla);
		ocho.setForeground(Color.RED);
		ocho.setBackground(Color.ORANGE);
		ocho.setBounds(85,180,45,45);
		add(ocho);
		nueve = new JButton("9");
		nueve.setFont(tecla);
		nueve.setForeground(Color.RED);
		nueve.setBackground(Color.ORANGE);
		nueve.setBounds(145,180,45,45);
		add(nueve);

		cero.addActionListener(this);
		uno.addActionListener(this);
		dos.addActionListener(this);
		tres.addActionListener(this);
		cuatro.addActionListener(this);
		cinco.addActionListener(this);
		seis.addActionListener(this);
		siete.addActionListener(this);
		ocho.addActionListener(this);
		nueve.addActionListener(this);

		suma.addActionListener(this);
		resta.addActionListener(this);
		multi.addActionListener(this);
		divi.addActionListener(this);
		punto.addActionListener(this);
		igual.addActionListener(this);
		ce.addActionListener(this);
	
	}//fin constructor

	public void actionPerformed(ActionEvent operacion){
		
	
		if(operacion.getSource()==cero){
			pantalla.setText(pantalla.getText()+"0");
		}
		if(operacion.getSource()==uno){
			pantalla.setText(pantalla.getText()+"1");
		}
			if(operacion.getSource()==dos){
			pantalla.setText(pantalla.getText()+"2");
		}
		if(operacion.getSource()==tres){
			pantalla.setText(pantalla.getText()+"3");
		}
			if(operacion.getSource()==cuatro){
			pantalla.setText(pantalla.getText()+"4");
		}
		if(operacion.getSource()==cinco){
			pantalla.setText(pantalla.getText()+"5");
		}
			if(operacion.getSource()==seis){
			pantalla.setText(pantalla.getText()+"6");
		}
		if(operacion.getSource()==siete){
			pantalla.setText(pantalla.getText()+"7");
		}
			if(operacion.getSource()==ocho){
			pantalla.setText(pantalla.getText()+"8");
		}
		if(operacion.getSource()==nueve){
			pantalla.setText(pantalla.getText()+"9");
		}


			if(operacion.getSource()==suma){
			n1 = Float.parseFloat(pantalla.getText());
			signo="+";
			pantalla.setText("");

		}
		if(operacion.getSource()==resta){
			n1 = Float.parseFloat(pantalla.getText());
			signo="-";
			pantalla.setText("");
			
			
		}
			if(operacion.getSource()==multi){
			n1 = Float.parseFloat(pantalla.getText());
			signo="*";
			pantalla.setText("");
			
		}
		if(operacion.getSource()==divi){
			n1 = Float.parseFloat(pantalla.getText());
			signo="/";
			pantalla.setText("");
			
		}
		if(operacion.getSource()==ce){
			pantalla.setText("");
			
		}
		if(operacion.getSource()==punto){
			pantalla.setText(pantalla.getText()+".");
		}

		if(operacion.getSource()==igual){
			n2 = Float.parseFloat(pantalla.getText());
			
			switch(signo){
 
			case "+":
				
				pantalla.setText(Float.toString(n1+n2));
				break;
				case "-":
					pantalla.setText(Float.toString(n1-n2));
					break;
					case "*":
						pantalla.setText(Float.toString(n1*n2));
						break;
						case "/":
						pantalla.setText(Float.toString(n1/n2));
							break;
				}
			}
		}

	public static void main(String args[]){
		Calculadora hackeado = new Calculadora();

		hackeado.setBounds(460,200,365,460);
		hackeado.setVisible(true);

	}
}