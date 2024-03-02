package com.poo2atv1.swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main {

	private JFrame frmAtividades;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmAtividades.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}

	private void initialize() {
		frmAtividades = new JFrame();
		frmAtividades.setTitle("Atividades");
		frmAtividades.setBounds(100, 100, 354, 247);
		frmAtividades.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmAtividades.getContentPane().setLayout(springLayout);
		
		 JButton btnNewButton = new JButton("Poupança");
	        btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Poupanca poupanca = new Poupanca();
	                poupanca.setVisible(true);
	            }
	        });
		frmAtividades.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Calculadora");
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 118, SpringLayout.WEST, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 10, SpringLayout.WEST, frmAtividades.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora calculadora = new Calculadora();
				calculadora.setVisible(true);
			}
		});
		frmAtividades.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Atividades 1 POO2 ");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 16, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 16, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 88, SpringLayout.WEST, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 43, SpringLayout.NORTH, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -67, SpringLayout.EAST, frmAtividades.getContentPane());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		frmAtividades.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Conversor");
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -13, SpringLayout.WEST, btnNewButton_1_1);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1_1, 16, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1_1, 231, SpringLayout.WEST, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1_1, -10, SpringLayout.EAST, frmAtividades.getContentPane());
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Moeda moeda = new Moeda();
				moeda.setVisible(true);
			}
		});
		frmAtividades.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("M/M/M");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Media media = new Media();
				media.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 21, SpringLayout.SOUTH, btnNewButton_1);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 10, SpringLayout.WEST, frmAtividades.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, 0, SpringLayout.EAST, btnNewButton_1);
		frmAtividades.getContentPane().add(btnNewButton_2);
	}
}

