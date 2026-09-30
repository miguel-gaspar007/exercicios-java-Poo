package bloco1.aula04exercicios.exercicios;
import java.util.Scanner;
// Tabuada.java — leia um número e imprima sua tabuada de 1 a 10 formatada com printf;
//depois imprima as tabuadas de 1 a 10 usando for dentro de for;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------TABUADA MAGICA--------------------------------- ");
        while(true) {
            System.out.print("Digite o número desejado(0-9): ");
            int num = scanner.nextInt();
            if (num < 1 && num > 9 ) {
                continue;
            } else {
                System.out.println("\nA tabuada do número escolhido é: ");
                for(int i=0;i<=10; i++)
                {System.out.printf("%dx%d=%d%n",num,i,num*i);
                }
                break;

        }
        }
        for (int i=1;i<10;i++){
            System.out.printf("A tabuada do %d É: ",i);

            for (int y=1;y<=10;y++){
                System.out.printf("%dx%d=%d%n",i,y,(i*y));
            }

            }

        }




        }




