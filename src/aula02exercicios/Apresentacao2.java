package aula02exercicios;
import java.util.Scanner;

public class Apresentacao2 {
        static void main() {
            // declare variáveis com seu nome (String), idade (int), altura (double) e se estuda à noite (boolean);
            // imprima uma apresentação em uma frase usando printf, com a altura em 2 casas decimais;
            Scanner scanner = new Scanner(System.in);

            String nome = "Miguel";
            int idade = 18;
            double altura = 1.89;
            boolean estudaNoite;//código irá fazer a minha apresentação e me perguntar se estudo ou não à noite.

            while(true) {
                System.out.print("Você estuda à noite? [S/N]");
                String estudaN = scanner.nextLine().toUpperCase();

                if (estudaN.length() > 1) {
                    System.out.print("Digite novamente (rode o programa dnv), OBS Digite S ou N apenas.");
                    continue;
                }

                char respostaEstuda = estudaN.charAt(0);
                if (respostaEstuda == 'S') {
                    System.out.printf("Meu nome é %s, e eu estudo a noite.", nome);
                    break;

                } else if (respostaEstuda == 'N') {
                    System.out.printf("Meu nome é %s, e eu de estudo de manhã.", nome);
                    break;
                } else {
                    System.out.print("Resposta inválida.");
                }


            }

        }
    }


