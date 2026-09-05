package bloco1.aula03exercicios.EXERCICIOS;
import java.util.Scanner;
//  — leia dois números e um operador (+, -, *, /) e  muse switchoderno para calcular.
// Trate a divisão
// por zero com uma mensagem em vez de deixar quebrar;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número(0-9): ");
        int digito1 = scanner.nextInt();
        System.out.println("Digite o segundo número:(0-9): ");
        int digito2 = scanner.nextInt();
        System.out.println("Digite qual a operação (* , / , +, -): ");
        String operacao = scanner.next();
        switch (operacao) {
            case "*":
                int resposta1 = (digito1 * digito2);
                System.out.printf("(%d x %d) = %d", digito1, digito2, resposta1);
                break;
            case "-":
                int resposta2 = (digito1 - digito2);
                System.out.printf("(%d - %d) = %d", digito1, digito2, resposta2);
                break;
            case "+":
                int resposta3 = (digito1 + digito2);
                System.out.printf("(%d + %d) = %d", digito1, digito2, resposta3);
                break;
            case "/":
                while (true) {
                    if (digito2 == 0) {
                        System.out.print("Divisão por zero sempre será 0. Tente novamente. ");
                        break;
                    } else {
                        double resposta4 = ((double) digito1 / digito2);
                        System.out.printf("(%d / %d) = %.2f", digito1, digito2, resposta4);
                        break;
                    }
                }


                };
        }
    }
