import java.util.Scanner;

public class ProgramaContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DadosBancarios dados = new DadosBancarios();

        System.out.println("Programa Conta Bancaria");

        System.out.println("Informe seu Nome Completo:");
        dados.setNomePessoa(scanner.nextLine());

        System.out.println("Informe o Número da Conta:");
        dados.setNumeroConta(scanner.nextInt());

        System.out.println("Informe o Saldo Inicial da conta:");
        dados.setSaldoInicial(scanner.nextDouble());

        System.out.println("Conta bancária criada com sucesso.");

        System.out.println("Escannerolha a operação que deseja realizar");
        System.out.println("1 - Depositar Valor");
        System.out.println("2 - Sacar Valor");
        System.out.println("3 - Obter Saldo Disponível");

        int operacaoBancaria = scanner.nextInt();
        scanner.nextLine();
                
        dados.operacao(operacaoBancaria, scanner);

        scanner.close();
    }
}
                
