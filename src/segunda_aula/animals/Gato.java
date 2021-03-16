package segunda_aula.animals;

public class Gato {

    int tamanho;
    char genero;
    String cor;

    void miar(){
        System.out.println("miau");
    }

    void crescer(){
        tamanho = tamanho + 1;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gato(int tamanho, char genero, String cor) {
        this.tamanho = tamanho;
        this.genero = genero;
        this.cor = cor;
    }
}
