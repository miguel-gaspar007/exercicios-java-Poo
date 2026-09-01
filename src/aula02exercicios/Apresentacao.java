package aula02exercicios;
import java.util.Scanner;
public class Apresentacao {
    static void main() {
        // declare variáveis com seu nome (String), idade (int), altura (double) e se estuda à noite (boolean);
        // imprima uma apresentação em uma frase usando printf, com a altura em 2 casas decimais;
        String nome = "Miguel";
        int idade = 18;
        double altura = 1.89;
        boolean estudaNoite = true;
        if(estudaNoite)  {
            System.out.printf("Meu nome é: %s, tenho %d anos de idade, %.2f de altura e eu estudo à noite. ", nome, idade, altura);
        }else {
            System.out.printf("Meu nome é: %s, tenho %d anos de idade, %.2f de altura e eu estudo durante o dia. ", nome, idade, altura);
        }
    }
}
