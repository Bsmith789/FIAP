package setima_aula.filmes.paineis;

import setima_aula.filmes.componentes.StarRater;

import javax.swing.*;
import java.awt.*;

public class PainelComponentes extends JPanel {
    private static final long serialVersionUID = 1L;

    private PainelOndeAssistir ondeAssistir = new PainelOndeAssistir();
    private JCheckBox assistido = new JCheckBox("Assistido");
    private StarRater avaliacao = new StarRater();

    public PainelComponentes(){
        setLayout(new GridLayout(4,1));
        init();
    }

    private void init(){
        add(ondeAssistir);
        add(assistido);
        add(new JLabel("Avaliação"));
        add(avaliacao);
    }

    public PainelOndeAssistir getOndeAssistir() {
        return ondeAssistir;
    }

    public JCheckBox getAssistido(){
        return assistido;
    }

    public StarRater getAvaliacao(){
        return avaliacao;
    }
}
