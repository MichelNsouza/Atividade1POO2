package com.poo2atv1.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Moeda extends JFrame {
	private JTextField textField;
	private JTextField resultado;
	private String cotaSelecionada;
	
	public Moeda() {
		initialize();
	}

    private void initialize() {
        setTitle("Conversão Monetaria");
        setSize(323, 175);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        SpringLayout springLayout = new SpringLayout();
        getContentPane().setLayout(springLayout);
        
        JLabel lblNewLabel = new JLabel("Valor: R$ ");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, 42, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -229, SpringLayout.EAST, getContentPane());
        getContentPane().add(lblNewLabel);
        
        textField = new JTextField();
        springLayout.putConstraint(SpringLayout.NORTH, textField, 22, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNewLabel);
        springLayout.putConstraint(SpringLayout.SOUTH, textField, -94, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, textField, -10, SpringLayout.EAST, getContentPane());
        getContentPane().add(textField);
        textField.setColumns(10);
        textField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                conversao(); // Chame o método conversao() apenas quando houver uma ação no campo de texto
            }
        });
        
        JComboBox<String> comboBox = new JComboBox<String>();
        springLayout.putConstraint(SpringLayout.EAST, comboBox, -229, SpringLayout.EAST, getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, comboBox, 30, SpringLayout.SOUTH, lblNewLabel);
        springLayout.putConstraint(SpringLayout.WEST, comboBox, 10, SpringLayout.WEST, getContentPane());
        comboBox.setMaximumRowCount(4);
        getContentPane().add(comboBox);
        
        comboBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                cotaSelecionada = (String) comboBox.getSelectedItem();
                conversao(); 
            }
        });
        
        
        resultado = new JTextField();
        resultado.setEditable(false);
        springLayout.putConstraint(SpringLayout.NORTH, resultado, 1, SpringLayout.NORTH, comboBox);
        springLayout.putConstraint(SpringLayout.WEST, resultado, 6, SpringLayout.EAST, comboBox);
        springLayout.putConstraint(SpringLayout.EAST, resultado, 0, SpringLayout.EAST, textField);
        getContentPane().add(resultado);
        resultado.setColumns(10);
        
        comboBox.addItem("Dolar");
        comboBox.addItem("Euro");
        comboBox.addItem("Peso AR");

	}   
    
    public void conversao() {
        try {
            double valor = Double.parseDouble(textField.getText());
            double res = 0; 
            
            switch (cotaSelecionada) {
                case "Euro":
                    res = valor / 5.37;
                    break;
                case "Peso AR": 
                    res = valor / 0.0059;
                    break;
                case "Dolar": 
                    res = valor / 4.95;
                    break;
                default: 
                    resultado.setText("Selecione uma opção válida");
                    return; 
            }
            
            resultado.setText(String.format("%.2f", res));
            
        } catch (NumberFormatException ex) {
            resultado.setText("Digite valores válidos");
        }
    }
}
