package quinta_aula.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        //JFrame cria a janela
        JFrame janela = new JFrame("Meu app");

        JPanel panel = new JPanel(new GridLayout(2,2));
        //Adicionando o texto Bem vindo ao painel
        panel.add(new MeuLabel("Bem vindo"));
        //Adicionando o campo de texto ao painel
        panel.add(new MeuTextField());
        //Adicionando uma área ao painel
        panel.add(new MeuTextArea());

        //Adicionando o painel a janela
        janela.add(panel, BorderLayout.CENTER);
        //Adicionando uma caixa de checagem a janela
        janela.add(new MeuCheckBox("Aceito os termos do contrato"), BorderLayout.SOUTH);

        //Fechar a aplicação ao fechar a janela aberta
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Colocar o tamanho da janela
        janela.setSize(1000,600);
        //Mostrar a tela na máquina
        janela.setVisible(true);
    }
}
