package setima_aula.filmes.listener;

import setima_aula.filmes.model.Filme;
import setima_aula.filmes.paineis.PainelCadastro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BotaoListener implements ActionListener {
    private PainelCadastro painelCadastro;

    public BotaoListener(PainelCadastro painelCadastro){
        this.painelCadastro = painelCadastro;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Filme filme = new Filme();
        filme.setTitulo(painelCadastro.getCampos().getTitulo().getText());
        filme.setSinopse(painelCadastro.getCampos().getSinopse().getText());
        filme.setGenero(String.valueOf(painelCadastro.getCampos().getGenero().getSelectedItem()));
        filme.setOndeAssistir(painelCadastro.getComponentes().getOndeAssistir().getGrupo().getSelection().getActionCommand());
        filme.setAssistido(painelCadastro.getComponentes().getAssistido().isSelected());
        filme.setAvaliacao(painelCadastro.getComponentes().getAvaliacao().getSelection());

        System.out.println(filme);
    }
}
