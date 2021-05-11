package setima_aula.filmes.paineis;

import setima_aula.filmes.componentes.Poster;

import javax.swing.*;
import java.awt.*;

public class PainelCadastro extends JPanel {
    private static final long serialVersionUID = 1L;

    private Poster poster = new Poster();
    private PainelCampos campos = new PainelCampos();
    private PainelComponentes componentes = new PainelComponentes();
    private PainelBotoes botoes = new PainelBotoes(this);

    public PainelCadastro(){
        setLayout(new BorderLayout());
        init();
    }

    private void init(){
        add(poster, BorderLayout.WEST);
        add(getCampos(), BorderLayout.CENTER);
        add(getComponentes(), BorderLayout.EAST);
        add(botoes, BorderLayout.SOUTH);
    }

    public PainelCampos getCampos(){
        return campos;
    }

    public PainelComponentes getComponentes() {
        return componentes;
    }
}
