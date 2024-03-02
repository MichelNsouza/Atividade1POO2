package com.poo2atv1.swing;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Media extends JFrame {
	private JTextField entradaNumeros;
	private JTextField textFieldMaior;
	private JTextField textFieldMenor;
	private JTextField textFieldMedia;
	private ArrayList<Integer> numeros = new ArrayList<>();
	private int maior;
	private int menor;
	private int media;
	
	public Media() {
		initialize();
	}

    private void initialize() {
        setTitle("Maior / Media / menor");
        setSize(334, 273);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        SpringLayout springLayout = new SpringLayout();
        getContentPane().setLayout(springLayout);
        
        JLabel lblNewLabel = new JLabel("Digite o numero:");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 37, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
        getContentPane().add(lblNewLabel);
        
        entradaNumeros = new JTextField();
        springLayout.putConstraint(SpringLayout.NORTH, entradaNumeros, 6, SpringLayout.SOUTH, lblNewLabel);
        springLayout.putConstraint(SpringLayout.WEST, entradaNumeros, 0, SpringLayout.WEST, lblNewLabel);
        springLayout.putConstraint(SpringLayout.EAST, entradaNumeros, 115, SpringLayout.WEST, getContentPane());
        getContentPane().add(entradaNumeros);
        entradaNumeros.setColumns(10);
        
        
        JButton btnok = new JButton("ok");
        springLayout.putConstraint(SpringLayout.WEST, btnok, 6, SpringLayout.EAST, entradaNumeros);
        springLayout.putConstraint(SpringLayout.SOUTH, btnok, -156, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, btnok, 104, SpringLayout.EAST, entradaNumeros);
        getContentPane().add(btnok);
        btnok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numeroTxt = entradaNumeros.getText();
                int numeroNum =  Integer.parseInt(numeroTxt);
            	numeros.add(numeroNum);
            	entradaNumeros.setText("");
            	entradaNumeros.requestFocus();
            }
        });
        
        JLabel lblNewLabel_1 = new JLabel("Maior >>>");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 27, SpringLayout.SOUTH, entradaNumeros);
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, lblNewLabel);
        getContentPane().add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Menor >>>");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 24, SpringLayout.SOUTH, lblNewLabel_1);
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_2, 0, SpringLayout.EAST, lblNewLabel);
        getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Média >>>");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 27, SpringLayout.SOUTH, lblNewLabel_2);
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_3, 0, SpringLayout.EAST, lblNewLabel);
        getContentPane().add(lblNewLabel_3);
        
        textFieldMaior = new JTextField();
        textFieldMaior.setEditable(false);
        springLayout.putConstraint(SpringLayout.NORTH, textFieldMaior, 23, SpringLayout.SOUTH, btnok);
        springLayout.putConstraint(SpringLayout.WEST, textFieldMaior, 0, SpringLayout.WEST, btnok);
        springLayout.putConstraint(SpringLayout.EAST, textFieldMaior, -97, SpringLayout.EAST, getContentPane());
        getContentPane().add(textFieldMaior);
        textFieldMaior.setColumns(10);
        
        textFieldMenor = new JTextField();
        textFieldMenor.setEditable(false);
        springLayout.putConstraint(SpringLayout.NORTH, textFieldMenor, -3, SpringLayout.NORTH, lblNewLabel_2);
        springLayout.putConstraint(SpringLayout.WEST, textFieldMenor, 0, SpringLayout.WEST, btnok);
        springLayout.putConstraint(SpringLayout.EAST, textFieldMenor, 0, SpringLayout.EAST, btnok);
        getContentPane().add(textFieldMenor);
        textFieldMenor.setColumns(10);
        
        textFieldMedia = new JTextField();
        textFieldMedia.setEditable(false);
        springLayout.putConstraint(SpringLayout.NORTH, textFieldMedia, 21, SpringLayout.SOUTH, textFieldMenor);
        springLayout.putConstraint(SpringLayout.WEST, textFieldMedia, 0, SpringLayout.WEST, btnok);
        springLayout.putConstraint(SpringLayout.SOUTH, textFieldMedia, 41, SpringLayout.SOUTH, textFieldMenor);
        springLayout.putConstraint(SpringLayout.EAST, textFieldMedia, 0, SpringLayout.EAST, btnok);
        getContentPane().add(textFieldMedia);
        textFieldMedia.setColumns(10);
        
        JButton btnExibir = new JButton("Exibir");
        springLayout.putConstraint(SpringLayout.WEST, btnExibir, 6, SpringLayout.EAST, textFieldMenor);
        springLayout.putConstraint(SpringLayout.SOUTH, btnExibir, -75, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, btnExibir, 89, SpringLayout.EAST, textFieldMenor);
        getContentPane().add(btnExibir);
        btnExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                defineValores();
            }
        });
	}
    	public void defineValores() {
    	    int soma = 0;
    	    

    	    if (!numeros.isEmpty()) {
    	        maior = numeros.get(0);
    	        menor = numeros.get(0);
    	    }
    	    
    	    for (int numero : numeros) {
    	        if (numero > maior) {
    	            maior = numero;
    	        } else if (numero < menor) {
    	            menor = numero;
    	        }
    	        soma += numero;
    	    }
    	    
    	    if (!numeros.isEmpty()) {
    	        media = soma / numeros.size();
    	    }
    	    
    	    textFieldMaior.setText(String.valueOf(maior));
    	    textFieldMenor.setText(String.valueOf(menor));
    	    textFieldMedia.setText(String.valueOf(media));
    	}
}
