import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa: Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        System.out.println("Programa: Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Programa: Por favor, digite o saldo da conta !");
        double saldo = scanner.nextDouble();

        scanner.close(); // Feche o scanner após a leitura dos dados

        // Exiba a mensagem com os dados inseridos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
