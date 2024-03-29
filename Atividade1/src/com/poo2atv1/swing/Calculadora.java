package com.poo2atv1.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JFrame frame;
	private JTextField txtTeste;

	public Calculadora() {
		initialize();
	}

	public String conta = " ";
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Calculadora");
	    setSize(354, 299);
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    setLocationRelativeTo(null);
	    SpringLayout springLayout = new SpringLayout();
	    getContentPane().setLayout(springLayout);
	    
	    JButton btnNewButton = new JButton("7");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 41, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, getContentPane());
	    getContentPane().add(btnNewButton);
	    btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "7";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1 = new JButton("4");
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -4, SpringLayout.NORTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 95, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 0, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -115, SpringLayout.SOUTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, -258, SpringLayout.EAST, getContentPane());
	    getContentPane().add(btnNewButton_1);
	    btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "4";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1 = new JButton("1");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 6, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 0, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1, 56, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -258, SpringLayout.EAST, getContentPane());
	    getContentPane().add(btnNewButton_1_1);
	    btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "1";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_1 = new JButton("8");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1, 41, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_1, 86, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -6, SpringLayout.WEST, btnNewButton_1_1_1);
	    getContentPane().add(btnNewButton_1_1_1);
	    btnNewButton_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "8";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2 = new JButton("9");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2, 41, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2, 172, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_1, -6, SpringLayout.WEST, btnNewButton_1_1_2);
	    getContentPane().add(btnNewButton_1_1_2);
	    btnNewButton_1_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "9";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_3 = new JButton("/");
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2, -6, SpringLayout.WEST, btnNewButton_1_1_3);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_3, -22, SpringLayout.SOUTH, btnNewButton);
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_3, 41, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_3, 257, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_3, -1, SpringLayout.EAST, getContentPane());
	    getContentPane().add(btnNewButton_1_1_3);
	    btnNewButton_1_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "/";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_1_1 = new JButton("5");
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_1, -6, SpringLayout.NORTH, btnNewButton_1_1_1_1);
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_1_1, 6, SpringLayout.SOUTH, btnNewButton);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_1_1, 6, SpringLayout.EAST, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_1_1, 0, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_1_1, 0, SpringLayout.EAST, btnNewButton_1_1_1);
	    getContentPane().add(btnNewButton_1_1_1_1);
	    btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "5";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_1 = new JButton("6");
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2, -4, SpringLayout.NORTH, btnNewButton_1_1_2_1);
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_1, 0, SpringLayout.NORTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_1, 6, SpringLayout.EAST, btnNewButton_1_1_1_1);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_1, 0, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_1, 86, SpringLayout.EAST, btnNewButton_1_1_1_1);
	    getContentPane().add(btnNewButton_1_1_2_1);
	    btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta += "6";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_2 = new JButton("3");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_2, 6, SpringLayout.SOUTH, btnNewButton_1_1_2_1);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_2, -59, SpringLayout.SOUTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_2, 0, SpringLayout.EAST, btnNewButton_1_1_2);
	    getContentPane().add(btnNewButton_1_1_2_2);
	    btnNewButton_1_1_2_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta += "3";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_3 = new JButton("*");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_3, 6, SpringLayout.SOUTH, btnNewButton_1_1_3);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_3, 6, SpringLayout.EAST, btnNewButton_1_1_2);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_3, -42, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_3, -1, SpringLayout.EAST, getContentPane());
	    getContentPane().add(btnNewButton_1_1_2_3);
	    btnNewButton_1_1_2_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "*";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_4 = new JButton("0");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_4, 6, SpringLayout.SOUTH, btnNewButton_1_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_4, 0, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_4, -10, SpringLayout.SOUTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_4, 0, SpringLayout.EAST, btnNewButton);
	    getContentPane().add(btnNewButton_1_1_2_4);
	    btnNewButton_1_1_2_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "0";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_6 = new JButton("2");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_6, 6, SpringLayout.SOUTH, btnNewButton_1_1_1_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_6, 6, SpringLayout.EAST, btnNewButton_1_1);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_6, -59, SpringLayout.SOUTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_6, -172, SpringLayout.EAST, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_2, 6, SpringLayout.EAST, btnNewButton_1_1_2_6);
	    getContentPane().add(btnNewButton_1_1_2_6);
	    btnNewButton_1_1_2_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "2";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_7 = new JButton("-");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_7, 11, SpringLayout.NORTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_7, 6, SpringLayout.EAST, btnNewButton_1_1_2_2);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_7, -11, SpringLayout.SOUTH, btnNewButton_1);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_7, 0, SpringLayout.EAST, btnNewButton_1_1_3);
	    getContentPane().add(btnNewButton_1_1_2_7);
	    btnNewButton_1_1_2_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "-";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_8 = new JButton(".");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_8, 6, SpringLayout.SOUTH, btnNewButton_1_1_2_6);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_8, 6, SpringLayout.EAST, btnNewButton_1_1_2_4);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_8, 49, SpringLayout.SOUTH, btnNewButton_1_1_2_2);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_8, 0, SpringLayout.EAST, btnNewButton_1_1_1);
	    getContentPane().add(btnNewButton_1_1_2_8);
	    btnNewButton_1_1_2_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  ".";
            	txtTeste.setText(conta);
            }
        });
	    
	    JButton btnNewButton_1_1_2_8_1 = new JButton("=");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_8_1, 6, SpringLayout.SOUTH, btnNewButton_1_1_2_2);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_8_1, 0, SpringLayout.WEST, btnNewButton_1_1_2);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_8_1, 0, SpringLayout.SOUTH, btnNewButton_1_1_2_4);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_8_1, 0, SpringLayout.EAST, btnNewButton_1_1_2);
	    getContentPane().add(btnNewButton_1_1_2_8_1);
	    btnNewButton_1_1_2_8_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	calculaResultado();
            }
        });
	    
	    JButton btnNewButton_1_1_2_8_1_1 = new JButton("+");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1_2_8_1_1, 6, SpringLayout.SOUTH, btnNewButton_1_1_2_7);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1_2_8_1_1, 6, SpringLayout.EAST, btnNewButton_1_1_2_8_1);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_1_1_2_8_1_1, -97, SpringLayout.SOUTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1_2_8_1_1, 0, SpringLayout.EAST, btnNewButton_1_1_3);
	    getContentPane().add(btnNewButton_1_1_2_8_1_1);
	    btnNewButton_1_1_2_8_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	conta +=  "+";
            	txtTeste.setText(conta);
            }
        });
	    
	    txtTeste = new JTextField();
	    springLayout.putConstraint(SpringLayout.NORTH, txtTeste, 0, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.WEST, txtTeste, 0, SpringLayout.WEST, getContentPane());
	    springLayout.putConstraint(SpringLayout.SOUTH, txtTeste, 37, SpringLayout.NORTH, getContentPane());
	    springLayout.putConstraint(SpringLayout.EAST, txtTeste, 0, SpringLayout.EAST, btnNewButton_1_1_3);
	    txtTeste.setEditable(false);
	    getContentPane().add(txtTeste);
	    txtTeste.setColumns(10);
	    
	    JButton btnNewButton_2 = new JButton("<-");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, -28, SpringLayout.SOUTH, btnNewButton_1_1_2_4);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 0, SpringLayout.WEST, btnNewButton_1_1_3);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2, 0, SpringLayout.SOUTH, btnNewButton_1_1_2_4);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton_1_1_3);
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		conta = conta.substring(0, conta.length() - 1);
	    		txtTeste.setText(conta);
	    	}
	    });
	    getContentPane().add(btnNewButton_2);
	    
	    JButton btnNewButton_2_1 = new JButton("CC");
	    springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2_1, 21, SpringLayout.SOUTH, btnNewButton_1_1_2_8_1_1);
	    springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2_1, 0, SpringLayout.WEST, btnNewButton_1_1_3);
	    springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton_2_1, -6, SpringLayout.NORTH, btnNewButton_2);
	    springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2_1, 0, SpringLayout.EAST, btnNewButton_1_1_3);
	    btnNewButton_2_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		conta = "";
	    		txtTeste.setText(conta);
	    	}
	    });
	    getContentPane().add(btnNewButton_2_1);
	    
	    
	}
	
	public void calculaResultado() {
	        if (!conta.isEmpty()) {
	            try {
	                String[] dados = conta.split("(?<=[\\+\\-\\*\\/])|(?=[\\+\\-\\*\\/])");
	                double resultado = Double.parseDouble(dados[0]);
	
	                for (int i = 1; i < dados.length; i += 2) {
	                    char operador = dados[i].charAt(0);
	                    double numero = Double.parseDouble(dados[i + 1]);
	
	                    switch (operador) {
	                        case '+':
	                            resultado += numero;
	                            break;
	                        case '-':
	                            resultado -= numero;
	                            break;
	                        case '*':
	                            resultado *= numero;
	                            break;
	                        case '/':
	                            if (numero == 0) {
	                                txtTeste.setText("Erro: Divisão por zero");
	                                return;
	                            }
	                            resultado /= numero;
	                            break;
	                    }
	                }
	                txtTeste.setText(String.format("%.2f", resultado));
	
	            } catch (NumberFormatException ex) {
	                txtTeste.setText("Erro: Formato inválido");
	            }
	        } else {
	            txtTeste.setText("Erro: Expressão vazia");
	        }
	    }
}

