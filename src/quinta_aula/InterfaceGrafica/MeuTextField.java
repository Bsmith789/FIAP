package quinta_aula.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

public class MeuTextField extends JTextField {

    private static final long serialVersionUID = 1L;

    public MeuTextField() {
        super();
        init();
    }

    private void init(){
        this.setPreferredSize(new Dimension(200,30));
        this.setBorder(BorderFactory.criar());
    }
}
