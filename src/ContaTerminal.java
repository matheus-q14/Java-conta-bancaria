import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int conta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o sua agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %,.2f já está disponível para saque", nomeCliente, agencia, conta, saldo));

        scanner.close();
    }
}
