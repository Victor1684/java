package sistemaimobiliario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaAcesso extends JFrame {

    public TelaAcesso() {
        setTitle("Acesso ao Sistema");
        setSize(420, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(230, 230, 250)); // lavanda

        JLabel lblTitulo = new JLabel("Portal da Imobiliária Confiança");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblTitulo.setBounds(50, 20, 320, 25);
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitulo);

        JLabel lblUsuario = new JLabel("Login:");
        lblUsuario.setBounds(50, 70, 80, 25);
        add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(130, 70, 220, 25);
        add(txtUsuario);

        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(50, 110, 80, 25);
        add(lblSenha);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(130, 110, 220, 25);
        add(txtSenha);

        JButton btnEntrar = new JButton("Acessar");
        btnEntrar.setBounds(150, 165, 120, 30);
        btnEntrar.setBackground(new Color(46, 139, 87)); // verde escuro
        btnEntrar.setForeground(Color.WHITE);
        add(btnEntrar);

        btnEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText().trim();
                String senha = new String(txtSenha.getPassword());

                if (usuario.equals("admin") && senha.equals("123")) {
                    dispose();
                    new MenuPrincipal(); // nome diferente para TelaHome
                } else {
                    JOptionPane.showMessageDialog(null, "Dados inválidos. Tente novamente.");
                }
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaAcesso();
    }
}
