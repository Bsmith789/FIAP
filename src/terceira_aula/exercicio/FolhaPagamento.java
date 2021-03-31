package terceira_aula.exercicio;

public class FolhaPagamento {

    private double totalPagamento;

    public double getTotalPagamento() {
        return totalPagamento;
    }

    public void registrar(Empregado empregado){
        totalPagamento = totalPagamento + empregado.getSalario();
    }

    public void logar(Autenticavel usuario){
        if(usuario.autenticar("123")){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Acesso negado");
        }
    }
}
