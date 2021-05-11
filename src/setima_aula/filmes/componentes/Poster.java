package setima_aula.filmes.componentes;

import javax.swing.*;

public class Poster extends JLabel {
    private static final long serialVersionUID = 1L;

    private ImageIcon imagem = new ImageIcon("C:\\Users\\gabil\\OneDrive\\Documentos\\Workspace\\Java Fiap\\src\\imagens\\poster.jpg");

    public Poster(){
        setIcon(imagem);
    }
}
