package quinta_aula.exercicio;

public class BolaDeFogo implements Visivel {
    private int poder;

    @Override
    public void mover(int x, int y) {
        System.out.println("Movendo bola de fogo");
    }
}
