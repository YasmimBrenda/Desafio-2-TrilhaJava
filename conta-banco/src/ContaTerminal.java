import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem vindo ao nosso banco! Digite o seu nome para iniciarmos a criação da sua conta:");
            String nome = scanner.nextLine();
            
            System.out.println("Por favor, agora digite qual a sua agência:");
            String agencia = scanner.nextLine();
            
            System.out.println("Qual o número da sua conta?");
            int conta = scanner.nextInt();
            
            System.out.println("Por fim, nos informe o seu saldo:");
            double saldo = scanner.nextDouble();
            
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        }

    }
}