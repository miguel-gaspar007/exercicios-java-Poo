//Lendo dados do teclado com Scanner
//Para ler o que o usuário digita, importamos a classe Scanner:

import java.util.Scanner; // --> importa scanner  , antes da classe

public class cadastro {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // --> criando scanner. PS: "Scanner" é a classe do Java e "scanner" é a variavel que criamos

            System.out.print("Seu nome é: ");
            String nome = scanner.nextLine(); // --> Lê a linha inteira (com espaços)

            System.out.print("Sua idade: ");
            int idade = scanner.nextInt();  // --> Lê um inteiro

            System.out.print("Sua altura: ");
            String altura = scanner.next(); //pequeno conversor para o usuário ser permitido digitar tanto "," quanto "."
            altura = altura.replace(",","."); //substitui vírgula por ponto
            double alturaFinal = Double.parseDouble(altura); // Double.parseDouble(string) irá converter string para Double

            System.out.printf("%s, %d, %.2f",nome,idade,alturaFinal);
            scanner.close(); // --> LIBERA O RECURSO depois do uso!

    }
}
