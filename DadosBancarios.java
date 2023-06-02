import java.util.Scanner;

public class DadosBancarios {
    private String nomePessoa;
    private int numeroConta;
    private double saldoInicial;
    
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
   
    public void operacao(int operacaoBancaria, Scanner scanner) {
        
        switch (operacaoBancaria) {
            case 1:
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                double saldoFinal = valorDeposito + saldoInicial; 
                System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n" , valorDeposito );
                System.out.printf("Saldo Final de R$ %.2f reais.\n" , saldoFinal );
                break;
            case 2: 
                System.out.println("Digite o valor a ser sacado: ");
                double valorSaque = scanner.nextDouble();
                double saldoTotal = saldoInicial - valorSaque;
                    if (valorSaque > 5000) {
                        System.out.println("Valor do saque acima do permitido.");
                    } else if (valorSaque > saldoInicial) {
                        System.out.println("Saldo insuficiente para realizar a operação.");
                    } else {
                        System.out.printf("Saque de R$: %.2f realizado com sucesso.\n" , valorSaque);
                        System.out.printf("Saldo Final de R$ %.2f reais.\n" , saldoTotal);
                    }
                break;
            case 3: 
                System.out.printf("Seu saldo é R$: %.2f reais." , verificarSaldo());
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    public double verificarSaldo() {
        return saldoInicial;
    }
}
