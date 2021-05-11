package setima_aula.filmes.paineis;

import javax.swing.*;

public class PainelLista extends JPanel {
    private static final long serialVersionUID = 1L;

    private JLabel lista = new JLabel("Lista de Filmes");

    public PainelLista(){
        init();
    }

    private void init(){
        add(lista);
    }
}
