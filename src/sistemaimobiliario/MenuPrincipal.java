package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Painel Inicial - Sistema de Imóveis");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 250)); // tom lavanda

        JLabel lblTitulo = new JLabel("Sistema Habitacional");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setBounds(110, 30, 320, 30);
        lblTitulo.setForeground(new Color(50, 50, 90));
        add(lblTitulo);

        JLabel lblSub = new JLabel("Gerencie seus clientes com facilidade");
        lblSub.setFont(new Font("Arial", Font.PLAIN, 15));
        lblSub.setBounds(100, 65, 350, 25);
        lblSub.setForeground(new Color(80, 80, 100));
        add(lblSub);

        JButton btnNovaPessoa = new JButton("Novo Cadastro");
        btnNovaPessoa.setBounds(150, 130, 180, 40);
        btnNovaPessoa.setBackground(new Color(100, 149, 237)); // azul claro
        btnNovaPessoa.setForeground(Color.WHITE);
        btnNovaPessoa.setFont(new Font("Arial", Font.BOLD, 13));
        add(btnNovaPessoa);

        JButton btnVisualizar = new JButton("Visualizar Registros");
        btnVisualizar.setBounds(150, 190, 180, 40);
        btnVisualizar.setBackground(new Color(60, 179, 113)); // verde médio
        btnVisualizar.setForeground(Color.WHITE);
        btnVisualizar.setFont(new Font("Arial", Font.BOLD, 13));
        add(btnVisualizar);

        btnNovaPessoa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaCadastroPessoa(); 
            }
        });

        btnVisualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaConsulta(); 
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
