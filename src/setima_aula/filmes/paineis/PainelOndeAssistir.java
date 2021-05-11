package setima_aula.filmes.paineis;

import javax.swing.*;
import java.awt.*;

public class PainelOndeAssistir extends JPanel {
    private static final long serialVersionUID = 1L;

    private JRadioButton netflix = new JRadioButton("Netflix");
    private JRadioButton prime = new JRadioButton("Amazon Prime");
    private JRadioButton pirateBay = new JRadioButton("Pirate Bay");
    private ButtonGroup grupo = new ButtonGroup();

    public PainelOndeAssistir(){
        setLayout(new GridLayout(4,1));
        init();
    }

    private void init(){
        add(new JLabel("Onde assistir?"));

        getGrupo().add(netflix);
        getGrupo().add(prime);
        getGrupo().add(pirateBay);

        add(netflix);
        add(prime);
        add(pirateBay);

        netflix.setActionCommand("Netflix");
        prime.setActionCommand("Amazon Prime");
        pirateBay.setActionCommand("Pirate Bay");
    }

    public ButtonGroup getGrupo() {
        return grupo;
    }
}
