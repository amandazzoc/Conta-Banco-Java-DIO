import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o número da agencia: ");
            String numeroAgencia = scanner.next();

            System.out.println("Digite seu primeiro nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite o saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println(
                    "Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                            + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque");
        }
    }
}
