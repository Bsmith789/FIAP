package quinta_sexta_aula.InterfaceGrafica;

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
        frame.setLayout(new BorderLayout());

        JPanel imagem = new JPanel();
        imagem.setLayout(new FlowLayout());
        imagem.add(new JLabel(new ImageIcon("C:\\Users\\gabil\\OneDrive\\Documentos\\Workspace\\Imagem para Fiap\\Filme1.png")));

        JPanel cadastro = new JPanel();
        MeuTextField tituloFilme = new MeuTextField();
        MeuTextArea sinopseFilme = new MeuTextArea();

        cadastro.setLayout(new GridLayout(6,0));
        cadastro.add(new MeuLabel("Titulo"));
        cadastro.add(tituloFilme);
        cadastro.add(new MeuLabel("Sinopse"));
        cadastro.add(sinopseFilme);
        cadastro.add(new MeuLabel("Genero"));
        String[] genero = {"Aventura" , "Ação" , "Romance"};
        cadastro.add(new JComboBox<String>(genero));

        JPanel cinema = new JPanel();
        MeuCheckBox assistido = new MeuCheckBox("Assistido");
        StarRater avaliacaoEstrelas = new StarRater(5);

        cinema.setLayout(new GridLayout(5,0));
        cinema.add(new MeuLabel("Onde assistir"));
        List<String> listaDeOpcoes = List.of("Netflix", "Prime Video", "Pirate Bay");
        MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes);
        cinema.add(group);
        cinema.add(assistido);
        cinema.add(new MeuLabel("Avaliação"));
        cinema.add(avaliacaoEstrelas);

        JPanel botaoPanel = new JPanel();

        JButton botao1 = new JButton("Salvar");
        JButton botao2 = new JButton("Cancelar");
        BotaoListener listener = new BotaoListener(tituloFilme, sinopseFilme, group, assistido, avaliacaoEstrelas);

        botaoPanel.setLayout(new FlowLayout());
        botao1.addActionListener(listener);
        botaoPanel.add(botao1);
        botaoPanel.add(botao2);

        frame.add(imagem, BorderLayout.LINE_START);
        frame.add(cadastro, BorderLayout.CENTER);
        frame.add(cinema, BorderLayout.LINE_END);
        frame.add(botaoPanel, BorderLayout.SOUTH);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.pack();
    }
}
