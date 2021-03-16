package segunda_aula.animals;


public class TestaGato {
    public static void main(String[] args) {
        Gato felix = new Gato(2,'M',"preto");

        felix.crescer();
        System.out.println(felix.tamanho);
        System.out.println(felix.cor);
        System.out.println(felix.genero);
        felix.miar();
    }
}
