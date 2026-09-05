package bloco1.aula03exercicios.EXERCICIOS;
import java.util.Scanner;
// leia uma palavra do teclado e compare com "java" de três formas: ==, .equals() e .equalsIgnoreCase()
//  Imprima os três resultados e explique num comentário por que o primeiro deu o que deu;

public class Igualdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a palavra a ser comparada: ");
        String palavraComp = scanner.nextLine();

        boolean resultado1 = (palavraComp == "java"); // ------> retorna false pois == compara apenas stirngs
        boolean resultado2 = (palavraComp.equals("java"));
        boolean resultado3 = (palavraComp.equalsIgnoreCase("java"));
        System.out.println("Resultado com \"==\" :"+resultado1);
        System.out.println("Resultado com \".equals()\": "+resultado2);
        System.out.println("Resultado com \".equalsIgnoreCase()\": "+resultado3);
    }
}
