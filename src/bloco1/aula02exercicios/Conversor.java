package bloco1.aula02exercicios;
import java.util.Scanner;
//dada final double COTACAO = 5.42; e um valor em dólares, imprima o valor em reais formatado. Depois

public class Conversor {
    public static void main(String[] args) {
        final double COTACAOD = 5.42;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Bem vindo ao conversor de cotação Dolar - Real -----------------\n\n");
        while (true){
            System.out.println("Dígite 1 para Conversão Dólar -> Real\nDígite 2 para Conversão Real -> Dólar ");
            int dolarReal = scanner.nextInt();
            if(dolarReal == 1) { // Programa permite o usuário escolher qual cotação deseja fazer.
                System.out.print("Digite o valor em Dólares: ");
                double valorDolar = scanner.nextDouble();
                double conversorDolarReal = (valorDolar * COTACAOD);
                System.out.printf("Dólares: %.2f$ || Reais: %.2fR$",valorDolar,conversorDolarReal);
                break;
            }else if(dolarReal == 2){
                System.out.print("Digite o valor em Reais: ");
                double valorReal = scanner.nextDouble();
                double conversorRealDolar = (valorReal / COTACAOD);
                System.out.printf("Reais: %.2fR$ || Doláres: %.2f$",valorReal,conversorRealDolar);
                break;
            }
            else{
                System.out.println("ERRO! Escolha entre a opção 1 ou 2");
                continue;
            }
        } //--> fechamento loop while
        // converta uma temperatura de Celsius para Fahrenheit (F = C * 9/5 + 32) — cuidado: por que 9/5 dá 1? Conserte;
        System.out.println("\n\n\n-----------CONVERSOR DE TEMPERATURA Fahrenheit(F) para Celsius(F) e vice-versa-----------------\n\n");
        while(true) {
            System.out.println("Digite 1 para converter Graus Celsius(C) em Fahrenheit(F)\nDigite 2 para converter Fahrenheit(F) em Celsius(C)");
            int celsiusFahrenheit = scanner.nextInt();
            if (celsiusFahrenheit == 1) {
                System.out.print("Digite a temperatura em Graus Celsius: ");
                double tempC =  scanner.nextDouble();
                double convCF = (tempC * (double)9/5 + 32); // (F = C * 9/5 + 32) — cuidado: por que 9/5 dá 1? Isso
                // acontece quando o Java lê a divisão de dois inteiros, retorna o resultado sem casas decimais nem resto
                //Para solucionar isso é necessário castar pelo menos um dos inteiros para float, ou double.
                System.out.printf("\nTemperatura em Graus Celsius: %.2fC || Temperatura em Fahrenheit: %.2f ",tempC,convCF);
                break;
            }else if(celsiusFahrenheit == 2) {
                System.out.print("Digite a temperatura em Fahrenheit: "); // Fahrenheit para Celsius é: C = (F - 32) * 5 / 9
                double tempF =  scanner.nextDouble();
                double convFC = ((tempF- 32) * (double)5/9);
                System.out.printf("\nTemperatura em Graus Fahrenheit: %.2fF || Temperatura em Celsius: %.2fC ",tempF,convFC);
                break;
            }else{
                System.out.println("Erro! Escolha uma das opções.");
                continue;
            }

        }

    }
}
