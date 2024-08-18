import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    /*int numero = 1021;
    String agencia = "067-8";
    String nomeCliente = "Mario Andrade";
    double saldo = 237.48;*/
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println("Por favor, digite seu nome : ");
        String nomeDoCliente = scanner.next(); //String

        System.out.println("Digite o numero da agencia : ");
        String agencia = scanner.next(); //String

        System.out.println("Digite o numero da sua conta : ");
        int numeroDaConta = scanner.nextInt(); //Inteiro

        System.out.println("Digite o seu saldo : ");
        double saldo = scanner.nextDouble(); //Double
        
        scanner.close();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");    
    }
}