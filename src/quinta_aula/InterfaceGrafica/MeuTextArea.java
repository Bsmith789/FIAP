package quinta_aula.InterfaceGrafica;

import javax.swing.*;

public class MeuTextArea extends JTextArea {

    private static final long serialVersionUID = 1L;

    private int colunas = 30;
    private int linhas = 5;

    public MeuTextArea() {
        super();
        init();
    }

    private void init() {
        this.setColumns(colunas);
        this.setRows(linhas);
        this.setBorder(BorderFactory.criar());
    }
}
