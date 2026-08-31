package swing;

import javax.swing.*;
import java.awt.*;

public class Observer {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observer");
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizar na tela!

        JButton botao = new JButton("Clicar!");
        janela.add(botao);
        botao.addActionListener(e -> System.out.println("Evento ocorreu!"));
        // ActionListener -> interface funcional, assim possibilitando fazer uma lambda expression...

    }

}
