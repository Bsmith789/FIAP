package quinta_aula.exercicio;

import segunda_aula.exercicio.Jogador;

public class Mago extends Jogador implements Visivel {

    private int mp = 0;

    @Override
    public void mover(int x, int y) {
        System.out.println("Mago se movendo");
    }
}
