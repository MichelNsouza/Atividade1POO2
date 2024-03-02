package com.poo2atv1.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Poupanca extends JFrame {

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textFieldResultado;

    public Poupanca() {
        initialize();
    }

    private void initialize() {
        setTitle("Poupanca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null); // Usando layout nulo para posicionar os componentes manualmente

        JLabel lblJurosAoMs = new JLabel("Juros ao mês %:");
        lblJurosAoMs.setBounds(10, 20, 150, 20);
        panel.add(lblJurosAoMs);

        JLabel lblNumDeAnos = new JLabel("Num. de anos:");
        lblNumDeAnos.setBounds(10, 60, 150, 20);
        panel.add(lblNumDeAnos);

        JLabel lblDepositoMensalR = new JLabel("Depósito mensal R$:");
        lblDepositoMensalR.setBounds(10, 100, 150, 20);
        panel.add(lblDepositoMensalR);

        JLabel lblTotalPoupadoR = new JLabel("Total poupado R$:");
        lblTotalPoupadoR.setBounds(10, 140, 150, 20);
        panel.add(lblTotalPoupadoR);

        textField = new JTextField();
        textField.setBounds(170, 20, 200, 25);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(170, 60, 200, 25);
        panel.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(170, 100, 200, 25);
        panel.add(textField_2);
        textField_2.setColumns(10);

        textFieldResultado = new JTextField("");
        textFieldResultado.setBounds(170, 140, 200, 25);
        textFieldResultado.setBackground(new Color(240, 240, 240));
        textFieldResultado.setEditable(false);
        panel.add(textFieldResultado);

        JButton btnOk = new JButton("OK");
        btnOk.setBounds(170, 180, 100, 30);
        panel.add(btnOk);

        btnOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });
    }

    private void calcularResultado() {
        String jurosStr = textField.getText();
        String anosStr = textField_1.getText();
        String depositoMStr = textField_2.getText();

        try {
            double juros;
            if (jurosStr.endsWith("%")) {
                juros = Double.parseDouble(jurosStr.substring(0, jurosStr.length() - 1)) / 100;
            } else {
                juros = Double.parseDouble(jurosStr);
            }

            double anos = Double.parseDouble(anosStr);
            double depositoM = Double.parseDouble(depositoMStr);

            double anosPmeses = anos * 12;

            double resultado = depositoM * (Math.pow(1 + juros, anosPmeses) - 1) / juros;

            textFieldResultado.setText(String.format("%.2f", resultado));

        } catch (NumberFormatException ex) {
            textFieldResultado.setText("Digite valores válidos");
        }
    }
}
