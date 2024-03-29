package parcial1poo2;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Main {
	
    private Connection conexaoBd = Conexao.obterConexao();
    
    private JFrame frmGerenciadorProdutos;
    private JPanel contentPane;
    private JTextField inDescricaoCadastro, inPrecoCadastro;
    private JTable table;
    private JTextField inIdAtualizar;
    private JTextField inDescricaoAtualizar;
    private JTextField inPrecoAtualizar;
    private JTextField inExcluir;
    private JTextField inIdPesquisar;
    private JTable tableProduto;
    private JTextField inDescricaoPesquisar;


    public Main() {
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main window = new Main();
                window.initialize();
            }
        });
    }

    private void initialize() {
        frmGerenciadorProdutos = new JFrame();
        frmGerenciadorProdutos.setTitle("Gerenciador de Produtos");
        frmGerenciadorProdutos.setBounds(100, 100, 536, 360);
        frmGerenciadorProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPane = new JPanel();
        frmGerenciadorProdutos.setContentPane(contentPane);
        contentPane.setLayout(new CardLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        contentPane.add(mainPanel, "mainPanel");
        mainPanel.setLayout(null);

        JButton listarbutton = new JButton("Listar");
        listarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Produto listaProdutos = new Produto();
                try {
                	
                	listaProdutos.listarTodosProdutos(conexaoBd, table);
                	
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        
        listarbutton.setBounds(212, 280, 100, 30);
        mainPanel.add(listarbutton);

        JButton novoButton = new JButton("Novo");
        novoButton.setBounds(10, 42, 100, 30);
        mainPanel.add(novoButton);
        
        table = new JTable();
        table.setForeground(new Color(255, 255, 255));
        table.setBackground(new Color(0, 0, 0));
        table.setBounds(10, 95, 500, 174);
        mainPanel.add(table);
        
        JButton atualizarbutton = new JButton("Atualizar");
        atualizarbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "atualizarPanel");
            }
        });

        atualizarbutton.setBounds(142, 42, 100, 30);
        mainPanel.add(atualizarbutton);
        
        JButton btnExcluir = new JButton("Excluir");
        btnExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "excluirPanel");
            }
        });
        btnExcluir.setBounds(410, 42, 100, 30);
        mainPanel.add(btnExcluir);
        
        JLabel lblNewLabel = new JLabel("Gerenciador de Produtos");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 0, 500, 31);
        mainPanel.add(lblNewLabel);

        novoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "cadastroPanel");
            }
        });

        
        
        // ********************************************************************************************************TELA DE CADASTRO NOVO
        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setBackground(Color.WHITE);
        contentPane.add(cadastroPanel, "cadastroPanel");
        cadastroPanel.setLayout(null);

        JButton voltarButtonCadastro = new JButton("Voltar");
        voltarButtonCadastro.setBounds(10, 265, 100, 30);
        cadastroPanel.add(voltarButtonCadastro);
        
        JButton gravarButtonCadastro = new JButton("Gravar");
        gravarButtonCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String descricao = inDescricaoCadastro.getText();
                double preco = Double.parseDouble(inPrecoCadastro.getText());


                Produto novoProduto = new Produto();
                
                try {
                    novoProduto.gravarProduto(conexaoBd, descricao, preco);
                    JOptionPane.showMessageDialog(null, "Produto criado com sucesso!");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }


                inDescricaoCadastro.setText("");
                inPrecoCadastro.setText("");
            }
        });
        gravarButtonCadastro.setBounds(410, 265, 100, 30);
        cadastroPanel.add(gravarButtonCadastro);
        
        JLabel lblDescricao = new JLabel("Descrição do Produto:");
        lblDescricao.setBounds(10, 72, 237, 14);
        cadastroPanel.add(lblDescricao);
        
        JLabel lblPreco = new JLabel("Preço do produto: R$ ");
        lblPreco.setBounds(237, 236, 142, 14);
        cadastroPanel.add(lblPreco);
        
        JLabel lblTitulo = new JLabel("Cadastro de Produtos");
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(10, 11, 500, 30);
        cadastroPanel.add(lblTitulo);
        
        inDescricaoCadastro = new JTextField();
        inDescricaoCadastro.setBounds(10, 97, 500, 114);
        cadastroPanel.add(inDescricaoCadastro);
        inDescricaoCadastro.setColumns(10);
        
        inPrecoCadastro = new JTextField();
        inPrecoCadastro.setBounds(355, 232, 155, 22);
        cadastroPanel.add(inPrecoCadastro);
        inPrecoCadastro.setColumns(10);

        voltarButtonCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "mainPanel");
            }
        });
     
        
        // *********************************************************************************************************TELA DE ATUALIZAR
        JPanel atualizarPanel = new JPanel();
        atualizarPanel.setBackground(Color.WHITE);
        contentPane.add(atualizarPanel, "atualizarPanel");
        atualizarPanel.setLayout(null);

        JButton voltarButtonAtualizar = new JButton("Voltar"); 
        voltarButtonAtualizar.setBounds(10, 271, 100, 30);
        atualizarPanel.add(voltarButtonAtualizar);
        
        JButton gravarButtonAtualizar = new JButton("Atualizar");
        gravarButtonAtualizar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int id = Integer.parseInt(inIdAtualizar.getText());
                String descricao = inDescricaoAtualizar.getText();
                double preco = Double.parseDouble(inPrecoAtualizar.getText());


                Produto atualizarProduto = new Produto();
                
                try {
                	atualizarProduto.atualizarProduto(conexaoBd, id, descricao, preco);
                    JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso! :)");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                inIdAtualizar.setText("");
                inDescricaoCadastro.setText("");
                inPrecoCadastro.setText("");
            }
        	
        });
        gravarButtonAtualizar.setBounds(410, 271, 100, 30);
        atualizarPanel.add(gravarButtonAtualizar);
        
        JLabel lblNewLabel_1 = new JLabel("# Id");
        lblNewLabel_1.setBounds(10, 78, 46, 14);
        atualizarPanel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Descrição :");
        lblNewLabel_2.setBounds(10, 146, 75, 14);
        atualizarPanel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Preço: R$ ");
        lblNewLabel_3.setBounds(149, 78, 86, 14);
        atualizarPanel.add(lblNewLabel_3);
        
        inIdAtualizar = new JTextField();
        inIdAtualizar.setBounds(10, 93, 100, 20);
        atualizarPanel.add(inIdAtualizar);
        inIdAtualizar.setColumns(10);
        
        inDescricaoAtualizar = new JTextField();
        inDescricaoAtualizar.setBounds(10, 161, 500, 99);
        atualizarPanel.add(inDescricaoAtualizar);
        inDescricaoAtualizar.setColumns(10);
        
        inPrecoAtualizar = new JTextField();
        inPrecoAtualizar.setBounds(149, 93, 126, 20);
        atualizarPanel.add(inPrecoAtualizar);
        inPrecoAtualizar.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Atualizar Produto");
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4.setBounds(0, 26, 520, 20);
        atualizarPanel.add(lblNewLabel_4);

        JButton PesquisarButton = new JButton("Pesquisar");
        PesquisarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "pesquisarPanel");
            }
        });
        PesquisarButton.setBounds(275, 42, 100, 30);
        mainPanel.add(PesquisarButton);


        voltarButtonAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "mainPanel"); 
            }
        });
        
        
        
        
        // *******************************************************************************************************TELA DE EXCLUIR
        JPanel excluirPanel = new JPanel();
        excluirPanel.setBackground(Color.WHITE);
        contentPane.add(excluirPanel, "excluirPanel");
        excluirPanel.setLayout(null);

        JButton voltarButtonExcluir = new JButton("Voltar"); 
        voltarButtonExcluir.setBounds(10, 245, 100, 30);
        excluirPanel.add(voltarButtonExcluir);
        
        JButton btnPesquisar = new JButton("Excluir");
        btnPesquisar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		int id = Integer.parseInt(inExcluir.getText());
;
                Produto excluirProduto = new Produto();
                
                try {
                	excluirProduto.apagarProduto(conexaoBd, id);
                    JOptionPane.showMessageDialog(null, "Produto Excluido com sucesso!");
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

                inExcluir.setText("");
        		
        	}
        });
        btnPesquisar.setBounds(410, 249, 100, 30);
        excluirPanel.add(btnPesquisar);
        
        JLabel lblexcluirProduto = new JLabel("Excluir Produto");
        lblexcluirProduto.setHorizontalAlignment(SwingConstants.CENTER);
        lblexcluirProduto.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblexcluirProduto.setBounds(0, 25, 510, 37);
        excluirPanel.add(lblexcluirProduto);
        
        JLabel lblInformeId = new JLabel("Informe o ID do produto que deseja Excluir:");
        lblInformeId.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblInformeId.setBounds(32, 130, 311, 19);
        excluirPanel.add(lblInformeId);
        
        inExcluir = new JTextField();
        inExcluir.setBounds(336, 129, 174, 20);
        excluirPanel.add(inExcluir);
        inExcluir.setColumns(10);

        JButton excluirButton = new JButton("Excluir");
        excluirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "excluirPanel");
            }
        });
        excluirButton.setBounds(410, 42, 100, 30);
        mainPanel.add(excluirButton);
        
        
        
       // ********************************************************************************************************TELA DE PESQUISAR
        
        JPanel pesquisarPanel = new JPanel();
        pesquisarPanel.setLayout(null);
        pesquisarPanel.setBackground(Color.WHITE);
        contentPane.add(pesquisarPanel, "pesquisarPanel");
        
        JButton voltarButtonPesquisar = new JButton("Voltar");
        voltarButtonPesquisar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "mainPanel");
        	}
        });
        voltarButtonPesquisar.setBounds(10, 268, 100, 30);
        pesquisarPanel.add(voltarButtonPesquisar);
        
        JButton ButtonPesquisar = new JButton("Pesquisar");
        ButtonPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String idText = inIdPesquisar.getText().trim(); 
                String descricao = inDescricaoPesquisar.getText().trim(); 

                if (!idText.isEmpty()) {
                    try {
                        int id = Integer.parseInt(idText);

                        Produto pesquisarProduto = new Produto();
                        pesquisarProduto.listarProdutoId(conexaoBd, id, tableProduto);
                    } catch (NumberFormatException ex) {
                        System.out.println("O campo de ID deve ser um número válido.");
                        ex.printStackTrace();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }

                if (!descricao.isEmpty()) {
                    try {

                        Produto pesquisarProduto = new Produto();
                        pesquisarProduto.listarProdutoDescricao(conexaoBd, descricao, tableProduto);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }

                inIdPesquisar.setText("");
                inDescricaoPesquisar.setText("");
            }
        });


        ButtonPesquisar.setBounds(410, 268, 100, 30);
        pesquisarPanel.add(ButtonPesquisar);
        
        JLabel lblNewLabel_5 = new JLabel("Pesquisar Produto");
        lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_5.setBounds(10, 11, 500, 35);
        pesquisarPanel.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("Informe um ID:");
        lblNewLabel_6.setBounds(10, 57, 85, 20);
        pesquisarPanel.add(lblNewLabel_6);
        
        inIdPesquisar = new JTextField();
        inIdPesquisar.setBounds(10, 77, 74, 20);
        pesquisarPanel.add(inIdPesquisar);
        inIdPesquisar.setColumns(10);
        
        tableProduto = new JTable();
        tableProduto.setForeground(new Color(255, 255, 255));
        tableProduto.setBackground(new Color(0, 0, 0));
        tableProduto.setBounds(10, 142, 500, 115);
        pesquisarPanel.add(tableProduto);
        
        inDescricaoPesquisar = new JTextField();
        inDescricaoPesquisar.setColumns(10);
        inDescricaoPesquisar.setBounds(140, 71, 370, 60);
        pesquisarPanel.add(inDescricaoPesquisar);
        
        JLabel lblNewLabel_6_1 = new JLabel("Informe uma Descrição de produto");
        lblNewLabel_6_1.setBounds(140, 57, 370, 20);
        pesquisarPanel.add(lblNewLabel_6_1);
        
        JLabel lblNewLabel_7 = new JLabel("OU");
        lblNewLabel_7.setBounds(98, 80, 46, 14);
        pesquisarPanel.add(lblNewLabel_7);

        voltarButtonExcluir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "mainPanel");
            }
        });
        
        frmGerenciadorProdutos.setVisible(true);
    }
}