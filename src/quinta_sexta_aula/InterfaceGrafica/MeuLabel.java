package quinta_sexta_aula.InterfaceGrafica;

import javax.swing.*;
import java.awt.*;

//Classe para padronizar os seus textos
public class MeuLabel extends JLabel {

    //Versão do Label, apenas para tirar aviso de Warning
    private static final long serialVersionUID = 1L;

    private int size = 18;
    private Color cor = new Color(199,4,92);

    public MeuLabel(String texto) {
        super(texto);
        init();
    }

    private void init() {
        //Colocar o texto no centro
        this.setHorizontalAlignment(SwingConstants.CENTER);
        //Definir a cor no estilo rgb = Usar a pesquisa do google color picker para escolher a sua
        this.setForeground(cor);
        //Definir a fonte e o tamanho do seu texto
        this.setFont(new Font(null, Font.BOLD,size));
    }


}
