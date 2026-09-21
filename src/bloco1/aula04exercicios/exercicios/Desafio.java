package bloco1.aula04exercicios.exercicios;
import java.util.Scanner;
//Desafio 🌶️ Boletim.java — leia o nome e 3 notas de 3 alunos usando arrays paralelos (String[] nomes, double[][] notas)
// , calcule a média de cada um e imprima um boletim alinhado com printf. Ao terminar, escreva num comentário o que foi
// mais chato nessa abordagem — na próxima aula você resolve isso com uma classe.
public class Desafio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[3];
        double notas[][] = new double[3][3];

        for(int i=0;i<alunos.length;i++){
            System.out.println("Digite o nome do aluno "+(i+1)+":");
            alunos[i] = scanner.nextLine();

            for(int j=0;j<notas[i].length;j++){
                System.out.println("Digite as 3 notas do aluno "+(j+1)+":");
                notas[i][j]=scanner.nextDouble();
            }
        }
    }

}
