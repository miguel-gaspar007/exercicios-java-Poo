package bloco1.aula04exercicios.anotacoes;
import java.util.Scanner;
public class anotacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador =5 ;
        int opcao ;
        do { // --> do while, faça enquanto tal coisa não acontece
            System.out.println("1-Cadastrar | 2-Listar | 0-Sair");
            opcao=scanner.nextInt();
        }while(opcao!=0);

        //LOOP FOR
        for (int i =1; i<=10; i++){
            System.out.printf("7 x %d = %d %n", i, 7*i  );
        }

        while (contador<=5) {
            System.out.println("Contador :" + contador);
            contador++;
        }

        for (int i=0; i<=10; i++){
            if (i%2 !=0) continue;
            if(i<8 )break;
            System.out.println(i);
        }


    }
}
