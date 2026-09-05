package bloco1.aula03exercicios.EXERCICIOS;
import java.util.Scanner;

//leia um ano e diga se é bissexto: divisível por 4, exceto se divisível por 100, a não ser que seja divisível por
// 400.

public class Bissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.print("O ano é bissexto!");
        }else {
            System.out.print("O ano não é bissexto.");
        }
        scanner.close();






    }
}
