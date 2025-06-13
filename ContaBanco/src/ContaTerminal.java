import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência !");
        int numero = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Por favor, digite a conta !");
        String conta = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente !");
        String nome = scanner3.nextLine();
        
        double saldo = 10500.00;

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numero + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
