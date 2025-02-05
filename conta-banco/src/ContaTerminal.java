import java.util.scanner;


public class ContaTerminal {
    public static void main(String[] args) {
       
        scanner scanner = new scanner(system.in);

        system.out.println("Por favor, digite o número da Agência!")

        int numero = scanner.nextInt();

        system.out.println("Por favor, digite a Agência!")
        
        String  agencia = scanner.nextLine();

        system.out.println("Por favor, digite seu nome!")

        String nomeClient = scanner.nextLine();

        system.out.println("Por favor, digite o valor!")

        double saldo = scanner.nextDouble();



        System.out.println("Olá " + nomeClient + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
