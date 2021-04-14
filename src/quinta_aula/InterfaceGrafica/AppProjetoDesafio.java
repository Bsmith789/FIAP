package quinta_aula.InterfaceGrafica;

import app.StarRater;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AppProjetoDesafio {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar a aparencia");
        }

        JFrame frame = new JFrame("Fiap Movies");
        frame.setLayout(new GridLayout(0,3));

        JPanel imagem = new JPanel();
        imagem.setLayout(new FlowLayout());
        imagem.add(new JLabel(new ImageIcon("C:\\Users\\gabil\\OneDrive\\Documentos\\Workspace\\Imagem para Fiap\\Filme1.png")));

        JPanel cadastro = new JPanel();
        cadastro.setLayout(new FlowLayout());
        cadastro.add(new MeuLabel("Titulo"));
        cadastro.add(new MeuTextField());
        cadastro.add(new MeuLabel("Sinopse"));
        cadastro.add(new MeuTextField());
        cadastro.add(new MeuLabel("Genero"));
        String[] genero = {"Aventura" , "Ação" , "Romance"};
        cadastro.add(new JComboBox<String>(genero));

        JPanel cinema = new JPanel();
        cinema.setLayout(new FlowLayout());
        cinema.add(new MeuLabel("Onde assistir"));
        List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Pirate Bay");
        MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
        cinema.add(group);
        cinema.add(new MeuCheckBox("Assistido"));
        cinema.add(new MeuLabel("Avaliação"));
        cinema.add(new StarRater(5));

        JPanel botao = new JPanel();
        botao.setLayout(new FlowLayout());
        botao.add(new JButton("Salvar"));
        botao.add(new JButton("Cancelar"));

        frame.add(imagem, BorderLayout.LINE_START);
        frame.add(cadastro, BorderLayout.CENTER);
        frame.add(cinema, BorderLayout.LINE_END);
        frame.add(botao, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
