package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import exercicios.recebeParametro;


public class Calculadora extends recebeParametro {

	private JFrame frmCalculadora;
	private JTextField Display;
	String display,operacao;
	double n1,n2,total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.getContentPane().setBackground(new Color(51, 51, 51));
		frmCalculadora.setBounds(100, 100, 273, 256);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		Display = new JTextField();
		Display.setBounds(20, 11, 218, 27);
		Display.setDropMode(DropMode.INSERT);
		Display.setHorizontalAlignment(SwingConstants.CENTER);
		Display.setBackground(Color.LIGHT_GRAY);
		frmCalculadora.getContentPane().add(Display);
		Display.setColumns(10);

		JButton btn2 = new JButton("2");
		btn2.setBounds(77, 55, 50, 34);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("2");
			}
		});
		frmCalculadora.getContentPane().add(btn2);

		JButton btn0 = new JButton("0");
		btn0.setBounds(77, 169, 50, 34);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("0");
			}
		});
		frmCalculadora.getContentPane().add(btn0);

		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 55, 50, 34);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("1");
			}
		});
		frmCalculadora.getContentPane().add(btn1);

		JButton btn3 = new JButton("3");
		btn3.setBounds(132, 55, 50, 34);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("3");
			}
		});
		frmCalculadora.getContentPane().add(btn3);

		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 93, 50, 34);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("4");
			}
		});
		frmCalculadora.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.setBounds(77, 93, 50, 34);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("5");
			}
		});
		frmCalculadora.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setBounds(132, 93, 50, 34);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("6");
			}
		});
		frmCalculadora.getContentPane().add(btn6);

		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 131, 50, 34);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("7");
			}
		});
		frmCalculadora.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setBounds(77, 131, 50, 34);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("8");
			}
		});
		frmCalculadora.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.setBounds(132, 131, 50, 34);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionaNumero("9");
			}
		});
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btnClear = new JButton("C");
		btnClear.setBounds(188, 55, 50, 34);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display.setText("");
			}
		});
		frmCalculadora.getContentPane().add(btnClear);
		
		JButton btnSomar = new JButton("+");
		btnSomar.setBounds(188, 93, 50, 34);
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operaçao("+");
			}
		});
		frmCalculadora.getContentPane().add(btnSomar);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setBounds(188, 131, 50, 34);
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operaçao("-");
			}
		});
		frmCalculadora.getContentPane().add(btnSubtrair);
		
		JButton btnResult = new JButton("=");
		btnResult.setBounds(188, 169, 50, 34);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent p) {
				resultadoOperacao();
			}
			
		});
		btnResult.setForeground(Color.BLACK);
		btnResult.setBackground(Color.RED);
		frmCalculadora.getContentPane().add(btnResult);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setBounds(132, 169, 50, 34);
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operaçao("/");
			}
		});
		frmCalculadora.getContentPane().add(btnDividir);
		
		JButton btnMultiplicar = new JButton("X");
		btnMultiplicar.setBounds(20, 169, 50, 34);
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operaçao("X");
			}
		});
		frmCalculadora.getContentPane().add(btnMultiplicar);
	}
	
	public void adicionaNumero (String n) {
		if (operacao != "nova") {
			display= Display.getText();
			display = display + n;
			Display.setText(display);
		}else if(operacao=="nova"){
			limpaDisplay();
			display= Display.getText();
			display = display + n;
			Display.setText(display);
		}
		
	}
	
	public void limpaDisplay() {
	    n1=0;
		n2=0;
		total=0;
		display="";
		Display.setText("");
		operacao="";
	}
	
	public void operaçao(String op) {
		if (display != null) {
			if(op=="+") {
				operacao=op;
			}else if(op=="-") {
				operacao=op;
			}else if(op=="X") {
				operacao=op;
			}else if(op=="/") {
				operacao=op;
			}
			n1=Double.parseDouble(display);
			Display.setText("");
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite um valor");
			Display.requestFocus();
		}
	}
	
	public void resultadoOperacao() {
		n2= Double.parseDouble(display);
		switch(operacao) {
		case"+":
			somaNumero(n1,n2);
			Display.setText(String.valueOf(somaNumero(n1,n2)));
			break;
		case"-":
			subtraiNumero(n1,n2);
			Display.setText(String.valueOf(subtraiNumero(n1,n2)));
			break;
		case"X":
			multiplicaNumero(n1,n2);
			Display.setText(String.valueOf(multiplicaNumero(n1,n2)));
			break;
		case"/":
			divideNumero(n1,n2);
			Display.setText(String.valueOf(divideNumero(n1,n2)));
			break;
		}
		operacao="nova";
	}
}
