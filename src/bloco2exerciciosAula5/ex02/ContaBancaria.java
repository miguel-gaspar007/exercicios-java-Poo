package ex02;
import java.util.Scanner;
//ContaBancaria.java + Banco.java — atributos titular, numero e saldo; métodos depositar(double valor),
// sacar(double valor) (que só saca se houver saldo, imprimindo aviso caso contrário) e exibirExtrato().
// Teste os dois cenários de saque;

public class ContaBancaria {
    String titular;
    int numero;
    double saldo;
    double extrato[] = new double[20];
    double valorDeposito = 0;
    double valorSaque;
    Scanner scanner = new Scanner(System.in);

    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }

    public void depositar() {
        System.out.print("Digite o valor do depósito: ");
        valorDeposito = scanner.nextDouble();
        this.saldo += valorDeposito;
        for (int i = 0; i < extrato.length; i++) {
            if (extrato[i] == 0.0) {
                extrato[i] += valorDeposito ;
                break;
            }
        }
    }

    public void sacar() {

        System.out.print("Digite o valor do saque: ");
        valorSaque = scanner.nextDouble();
        if (this.saldo >= valorSaque) {
            this.saldo -= valorSaque ;
            for (int i = 0; i < extrato.length; i++) {
                if (extrato[i] == 0.0) {
                    extrato[i] += (valorSaque * (-1));
                    break;
                }
            }
            System.out.println("Saque Realizado com sucesso! ");
        } else {
            System.out.println("ERRO! Conta sem saldo disponível.");
        }
    }

    //ContaBancaria.java + Banco.java — atributos titular, numero e saldo; métodos depositar(double valor),
// sacar(double valor) (que só saca se houver saldo, imprimindo aviso caso contrário) e exibirExtrato().
// Teste os dois cenários de saque;
    public void exibirFicha() {
        System.out.printf("Titular: %s\nNúmero da Conta: %d \n", this.titular, this.numero);
        System.out.println("----------------EXTRATO DE MOVIMENTAÇÕES DA CONTA-----------------");
        if (extrato.length > 0.0) {
            for (int i = 0; i < extrato.length; i++) {
                if (extrato[i] > 0.0) {
                    System.out.println("+" + extrato[i]);
                }
                if (extrato[i] < 0.0) {
                    System.out.println( extrato[i]);
                }

            }
            System.out.println("SALDO DA CONTA: "+this.saldo);


        }
    }
    public void exibirSaldo(){
        System.out.printf("O Saldo da conta do proprietário: %s, número: %d,é:%.2f ",this.titular,this.numero, this.saldo);
    }
}
