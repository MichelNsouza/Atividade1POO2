package com.poo2atv1.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class JogoAdv extends JFrame {
	private JTextField painelResposta;
	private JTextField txtChute;
	private String chute;
    Random random = new Random();
    private int numeroAleatorio = random.nextInt(100) + 1;
    
	public JogoAdv() {
		initialize();
	}

    private void initialize() {
        setTitle("Adivinhe o Numero");
        setSize(400, 288);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        SpringLayout springLayout = new SpringLayout();
        getContentPane().setLayout(springLayout);
        
        JLabel lblNewLabel = new JLabel("Adivinhe o número");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 14, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -210, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -113, SpringLayout.EAST, getContentPane());
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Eu tenho um número entre 1 e 100,");
        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -10, SpringLayout.EAST, getContentPane());
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setPreferredSize(lblNewLabel_1.getPreferredSize());
        getContentPane().add(lblNewLabel_1);
        
        JButton enviarChute = new JButton("Enviar");
        springLayout.putConstraint(SpringLayout.WEST, enviarChute, 10, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, enviarChute, -18, SpringLayout.SOUTH, getContentPane());
        getContentPane().add(enviarChute);
        enviarChute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	tentativa();
            }
        });
   
        painelResposta = new JTextField();
        springLayout.putConstraint(SpringLayout.EAST, enviarChute, -20, SpringLayout.WEST, painelResposta);
        springLayout.putConstraint(SpringLayout.WEST, painelResposta, 139, SpringLayout.WEST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, painelResposta, -18, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, painelResposta, -10, SpringLayout.EAST, getContentPane());
        painelResposta.setEditable(false);
        painelResposta.setHorizontalAlignment(SwingConstants.CENTER);
        painelResposta.setText("");
        getContentPane().add(painelResposta);
        painelResposta.setColumns(10);
        
        txtChute = new JTextField();
        springLayout.putConstraint(SpringLayout.SOUTH, txtChute, -12, SpringLayout.NORTH, enviarChute);
        springLayout.putConstraint(SpringLayout.NORTH, painelResposta, 0, SpringLayout.NORTH, txtChute);
        springLayout.putConstraint(SpringLayout.WEST, txtChute, 0, SpringLayout.WEST, lblNewLabel);
        springLayout.putConstraint(SpringLayout.EAST, txtChute, 109, SpringLayout.WEST, lblNewLabel);
        getContentPane().add(txtChute);
        txtChute.setColumns(10);
        
        JLabel lblNewLabel_1_1 = new JLabel("você pode adivinhá-lo? Entre com seu chute.");
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 113, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, txtChute, 35, SpringLayout.SOUTH, lblNewLabel_1_1);
        springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -10, SpringLayout.NORTH, lblNewLabel_1_1);
        springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 0, SpringLayout.WEST, lblNewLabel);
        springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1_1, 0, SpringLayout.EAST, lblNewLabel_1);
        lblNewLabel_1_1.setPreferredSize(new Dimension(536, 19));
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        getContentPane().add(lblNewLabel_1_1);

        JButton novoJogo = new JButton("Novo Jogo");
        novoJogo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		numeroAleatorio = random.nextInt(100) + 1;
        		txtChute.setText("");
        		txtChute.setEditable(true);
        		txtChute.requestFocus();
        	}
        });
        springLayout.putConstraint(SpringLayout.SOUTH, novoJogo, -193, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.SOUTH, novoJogo);
        springLayout.putConstraint(SpringLayout.NORTH, novoJogo, 25, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, novoJogo, 6, SpringLayout.EAST, lblNewLabel);
        getContentPane().add(novoJogo);
	}
    

    public void tentativa() {
        chute = txtChute.getText();
        
        if(chute.isEmpty()) {
            painelResposta.setText("Valor não pode ser vazio");
            txtChute.requestFocus();
            return; 
        }
        
        int chutenum = Integer.parseInt(chute);
        
        if(chutenum < 1 || chutenum > 100) {
            painelResposta.setText("Chute fora do intervalo válido (1-100)");
            txtChute.requestFocus();
            return;
        }

        if(chutenum == numeroAleatorio) { 
            painelResposta.setText("Acertou");
            txtChute.setEditable(false);
        } else {
            if(chutenum < numeroAleatorio) {
                painelResposta.setText("Errou, O numero é maior!");
            } else {
                painelResposta.setText("Errou, O numero é menor!");
            }
            txtChute.setText("");
            txtChute.requestFocus();
        }
    }


    
}
