package quinta_sexta_aula.exercicio;

import segunda_aula.exercicio.Jogador;

public class Guerreiro extends Jogador implements Visivel {
    @Override
    public void mover(int x, int y) {
        System.out.println("Guerreiro se movendo");
    }
}
