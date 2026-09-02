package aula02exercicios;
import java.util.Scanner;
public class Calculadora {
    //leia dois números double do teclado com Scanner e imprima soma,
    // subtração, multiplicação, divisão e resto (use %.2f);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro dígito: ");
        int primeiroDigito = scanner.nextInt();
        System.out.print("\nDigite o segundo dígito: ");
        int segundoDigito = scanner.nextInt();

        int soma = (segundoDigito + primeiroDigito);
        int subtracao = (primeiroDigito - segundoDigito);
        int multiplicacao = (segundoDigito * primeiroDigito);
        double divisao = ((double)primeiroDigito/segundoDigito);
        int restoDivisao = (primeiroDigito %segundoDigito);

        System.out.println("\n\n-----------RESULTADOS (soma,multiplicação,divisão e resto entre 2 dígitos)-------------");
        System.out.printf("Soma:%d\n",soma);
        System.out.printf("Subtração:%d\n",subtracao);
        System.out.printf("Divisão:%.2f\n",divisao);
        System.out.printf("Resto da divisão:%d\n",restoDivisao);


    }
}
