import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String cliente;
        double saldo;

        System.out.println("Por favor, digite o número da conta !");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome !");
        cliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = scanner.nextDouble();

        System.out.println(String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.",
            cliente, agencia, conta, saldo
        ));

    }
}
