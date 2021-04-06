package terceira_aula.exercicio_quarta_aula;

public final class Presidente extends Empregado implements Autenticavel {

    public double valorCota;
    private String senha;

    public double getValorCota() {
        return valorCota;
    }

    public void setValorCota(double valorCota) {
        this.valorCota = valorCota;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    @Override
    public double getSalario(){
        return this.getSalarioBase() + this.getValorCota();
    }

    public boolean autenticar(String senha){
        return this.senha == senha;
        }
}
