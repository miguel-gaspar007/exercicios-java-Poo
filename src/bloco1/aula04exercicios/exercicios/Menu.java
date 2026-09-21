package bloco1.aula04exercicios.exercicios;
import java.util.Scanner;
//menu em do-while com as opções 1 - Somar, 2 - Ver histórico de resultados, 0 - Sair; guarde os resultados num
//array de 10 posições e não deixe o programa quebrar ao passar do limite;


public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcao = 0;
        int resultados[] = new int[10];
        int quantidade = 0 ;
        do {
            System.out.println("ESCOLHA UMA OPÇÃO: 1 - Somar | 2 - Ver histórico dos resultados | 0 - Sair");
            opcao = scanner.nextInt();
            if(opcao == 1 ){
                System.out.println("Você escolheu somar.");
                System.out.println("Digite o primeiro número: ");
                int num1 = scanner.nextInt();
                System.out.println("Digite o segundo número: ");
                int num2 = scanner.nextInt();
                System.out.print("A soma resulta em: ");
                int soma =  (num1+num2);
                System.out.println(soma);
                if(quantidade< resultados.length){
                     // soma
                    resultados[quantidade] = soma;// // soma   adiciona a nova posição final i-1 ( i percorrido via loop for )
                    quantidade++;
                }else{
                    for(int i=1;i<resultados.length;i++){ // i -1 no array
                        resultados[i -1] = resultados[i] ; // grava em resultados [i-1]
                    }resultados[resultados.length] = soma;
                }



                }

            else if(opcao ==2){
                System.out.println("Você  escolheu ver o histórico. ");
                for (int i=0;i<quantidade;i++){
                    System.out.println(resultados[i]);
                }


            }
            else if (opcao == 0) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida");
            }

        }while(opcao != 0);

    }}

