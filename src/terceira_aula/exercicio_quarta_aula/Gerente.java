package terceira_aula.exercicio_quarta_aula;

public class Gerente extends Empregado implements Autenticavel {

    private String area;
    private double bonus;
    private String senha;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalario(){
        return this.getSalarioBase() + this.bonus;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha == senha;
    }
}
