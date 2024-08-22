public class Conta {

    private String nomeCliente;
    private int numeroAgencia;
    private String numeroConta;
    private double saldo;

    public Conta(String nome, int agencia, String numConta, double saldoInicial) {
        this.nomeCliente = nome;
        this.numeroAgencia = agencia;
        this.numeroConta = numConta;
        this.saldo = saldoInicial;
    }

    public String lerNomeCliente() {
        return nomeCliente;
    }

    public int lerNumeroAgencia() {
        return numeroAgencia;
    }

    public String lerNumeroConta() {
        return numeroConta;
    }

    public double lerSaldo() {
        return saldo;
    }
}
