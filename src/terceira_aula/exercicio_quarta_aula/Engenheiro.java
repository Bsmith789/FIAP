package terceira_aula.exercicio_quarta_aula;

public class Engenheiro extends Empregado implements Autenticavel {

    private String departamento;
    private int crea;

    public Engenheiro (int codigo, String nome){
        this.setCodigo(codigo);
        this.setNome(nome);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCrea() {
        return crea;
    }

    public void setCrea(int crea) {
        this.crea = crea;
    }

    @Override
    public double getSalario(){
        return this.getSalarioBase() + this.getSalarioBase() * 0.5;
    }

    @Override
    public void setSenha(String senha) {

    }

    @Override
    public boolean autenticar(String senha) {
        return false;
    }
}
