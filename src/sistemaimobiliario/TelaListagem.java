package sistemaimobiliario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class TelaConsulta extends JFrame {

    public TelaConsulta() {
        setTitle("Consulta de Clientes");
        setSize(720, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(240, 248, 255)); // azul muito claro

        JLabel cabecalho = new JLabel("Clientes Registrados", SwingConstants.CENTER);
        cabecalho.setFont(new Font("Verdana", Font.BOLD, 20));
        cabecalho.setForeground(new Color(25, 25, 112)); // azul escuro
        cabecalho.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        add(cabecalho, BorderLayout.NORTH);

        String[] colunas = {"Cliente", "Prazo de Retorno", "Situação"};
        Object[][] registros = {
            {"João Oliveira", "3 dias", "Aprovado"},
            {"Maria Silva", "7 dias", "Em análise"},
            {"Carlos Lima", "10 dias", "Recusado"},
            {"Roberto Cardoso", "4 dias", "Recusado"},
            {"Gustavo Leite", "8 dias", "Aprovado"},
            {"Mariana Socorro", "5 dias", "Em análise"},
            {"Gabriela Ferreira", "6 dias", "Recusado"},
            {"Carla Mendes", "1 dia", "Aprovado"}
        };

        JTable tabelaClientes = new JTable(new DefaultTableModel(registros, colunas));
        JScrollPane painelTabela = new JScrollPane(tabelaClientes);
        add(painelTabela, BorderLayout.CENTER);

        JPanel painelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        painelInferior.setBackground(new Color(240, 248, 255));

        JButton btnRefresh = new JButton("Recarregar");
        btnRefresh.setBackground(new Color(60, 179, 113)); // verde médio
        btnRefresh.setForeground(Color.WHITE);
        painelInferior.add(btnRefresh);

        JButton btnRetornar = new JButton("Tela Inicial");
        btnRetornar.setBackground(new Color(220, 20, 60)); // vermelho escuro
        btnRetornar.setForeground(Color.WHITE);
        painelInferior.add(btnRetornar);

        add(painelInferior, BorderLayout.SOUTH);

        btnRetornar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuPrincipal(); // nome alterado na tela inicial
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaConsulta();
    }
}
