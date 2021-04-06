package segunda_aula.exercicio;

public abstract class Jogador {
    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    public Jogador(){
        envenenado = false;
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void mover(int x, int y){
        System.out.println("Movendo");
    }

    public boolean isEnvenenado() {
        return envenenado;
    }

    public void setEnvenenado(boolean envenenado) {
        this.envenenado = envenenado;
    }

    public void receberDano(int pontos){
        if(pontos > 0){
            hp = hp - pontos;
        }else{
            System.out.println("Tente novamente");
    }
    }

    public void receberCura(int cura){
        if(cura > 0 ){
            hp = hp + cura;
        } else {
            System.out.println("Você não consegue curar o Jogador");
        }
    }

    public void ganharXp(int ganhaXp){
        if (ganhaXp > 0 ){
            xp = xp + ganhaXp;
        } else {
            System.out.println("Jogador não ganha xp");
        }
    }

    public void receberAntidoto(){
        if(envenenado == true){
            envenenado = false;
        } else if(envenenado == false) {
            envenenado = true;
        }
    }
}
