import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try {

            //TODO: Conhecer e importar classe Scanner
            Scanner scanenr = new Scanner(System.in);

            //Exibir as mensagens para o novo usuario
            //Obter pela scanner os valores digitados no terminal

            System.out.println("Insira o numero da conta: ");
            Integer numeroConta = scanenr.nextInt();

            System.out.println("Insira a agencia bancaria: ");
            String agencia = scanenr.nextLine();
            agencia = scanenr.nextLine();

            System.out.println("Insira o nome do cliente: ");
            String nomeCliente = scanenr.nextLine();

            System.out.println("Insira o saldo da conta: ");
            Double saldo = scanenr.nextDouble();

            System.out.println("\n");
            //Exibir a mensagem de conta criada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "\n já está disponível para saque.");

        }catch (InputMismatchException e){
            System.err.println("Insira o valor do saldo com vigula e não com ponto");
        }
    }
}