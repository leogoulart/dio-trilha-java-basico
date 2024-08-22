import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta novaConta = criarConta();

        System.out.println("Olá " + novaConta.lerNomeCliente() + ", obrigado "
                + "por criar uma conta em nosso banco, sua agência é " +
                novaConta.lerNumeroAgencia() + ", conta " + novaConta.lerNumeroConta()
                + " e seu saldo " + novaConta.lerSaldo()
                + " já está disponível para saque");

    }

    public static Conta criarConta() {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja Bem Vindo ao Banco DIO.");
        System.out.println();
        System.out.println("Vamos começar criando sua nova conta.");

        System.out.println("Por favor digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o numero da agencia:");
        int agencia = scanner.nextInt();

        System.out.println("Digite o numero da conta:");
        String numeroConta = scanner.next();

        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        return new Conta(nome, agencia, numeroConta, saldo);
    }
}
