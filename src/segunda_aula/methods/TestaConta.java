package segunda_aula.methods;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta(123,500.00,20.00);
        System.out.println(conta.getNumero());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getJuros());

        System.out.println(conta.getSaldo() + conta.getJuros() );
        System.out.println(conta.getSaldo() - conta.getJuros());
        System.out.println(conta.getSaldo() / conta.getJuros());
        System.out.println(conta.getSaldo() * conta.getJuros());

        conta.setNumero(456);
        System.out.println(conta.getNumero());
    }
}