package terceira_aula.banco;

public class TestaConta {
    public static void main(String[] args) {
        Conta contaSalario = new Conta();
        contaSalario.setNumero(123);
        contaSalario.setSaldo(1000);

        System.out.println(contaSalario.toString());
    }
}
