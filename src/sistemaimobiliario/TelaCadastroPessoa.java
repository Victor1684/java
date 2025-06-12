package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroPessoa extends JFrame {

    public CadastroPessoa() {
        setTitle("Formulário de Cadastro");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel lblCabecalho = new JLabel("Formulário de Cadastro");
        lblCabecalho.setFont(new Font("Arial", Font.BOLD, 22));
        lblCabecalho.setBounds(130, 25, 300, 25);
        add(lblCabecalho);

        // Campos de entrada
        JLabel lblNome = new JLabel("Nome completo:");
        lblNome.setBounds(40, 80, 120, 20);
        add(lblNome);
        JTextField txtNome = new JTextField();
        txtNome.setBounds(170, 80, 270, 25);
        add(txtNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(40, 120, 120, 20);
        add(lblCpf);
        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(170, 120, 270, 25);
        add(txtCpf);

        JLabel lblNascimento = new JLabel("Nascimento:");
        lblNascimento.setBounds(40, 160, 120, 20);
        add(lblNascimento);
        JTextField txtNascimento = new JTextField();
        txtNascimento.setBounds(170, 160, 270, 25);
        add(txtNascimento);

        JLabel lblRenda = new JLabel("Renda mensal:");
        lblRenda.setBounds(40, 200, 120, 20);
        add(lblRenda);
        JTextField txtRenda = new JTextField();
        txtRenda.setBounds(170, 200, 270, 25);
        add(txtRenda);

        JLabel lblEstado = new JLabel("Estado civil:");
        lblEstado.setBounds(40, 240, 120, 20);
        add(lblEstado);
        JTextField txtEstado = new JTextField();
        txtEstado.setBounds(170, 240, 270, 25);
        add(txtEstado);

        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(40, 280, 120, 20);
        add(lblEndereco);
        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(170, 280, 270, 25);
        add(txtEndereco);

        JLabel lblProfissao = new JLabel("Trabalho:");
        lblProfissao.setBounds(40, 320, 120, 20);
        add(lblProfissao);
        String[] opcoesTrabalho = {"CLT", "PJ", "Autônomo"};
        JComboBox<String> comboTrabalho = new JComboBox<>(opcoesTrabalho);
        comboTrabalho.setBounds(170, 320, 270, 25);
        add(comboTrabalho);

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(180, 390, 130, 40);
        btnSalvar.setBackground(new Color(34, 139, 34));
        btnSalvar.setForeground(Color.WHITE);
        add(btnSalvar);

        JButton btnSair = new JButton("Sair");
        btnSair.setBounds(20, 500, 80, 30);
        add(btnSair);

        // Ação do botão salvar
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                txtNome.setText("");
                txtCpf.setText("");
                txtNascimento.setText("");
                txtRenda.setText("");
                txtEstado.setText("");
                txtEndereco.setText("");
                comboTrabalho.setSelectedIndex(0);
            }
        });

        // Ação do botão sair
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuPrincipal(); 
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
