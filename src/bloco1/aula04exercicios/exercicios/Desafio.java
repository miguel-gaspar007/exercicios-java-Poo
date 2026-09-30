package bloco1.aula04exercicios.exercicios;
import java.util.Scanner;
//Desafio 🌶️ Boletim.java — leia o nome e 3 notas de 3 alunos usando arrays paralelos (String[] nomes, double[][] notas)
// , calcule a média de cada um e imprima um boletim alinhado com printf. Ao terminar, escreva num comentário o que foi
// mais chato nessa abordagem — na próxima aula você resolve isso com uma classe.
public class Desafio {

    public static double mediaAluno(double[] valores){
        double soma= 0;
        for (double v: valores){
            soma += v;

        }

        return(soma / valores.length);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[3];
        double notas[][] = new double[3][3];

        for(int i=0;i<alunos.length;i++){
            System.out.println("Digite o nome do aluno "+(i+1)+":"); // salva o nome do aluno em alunos[i]
            alunos[i]= scanner.nextLine();

            for(int j=0;j<notas[i].length;j++){
                System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1) + ":");
                notas[i][j]=scanner.nextDouble();
            }
            scanner.nextLine();

        }
        System.out.printf("%-10s%8s%8s%8s%8s%n", "Nome", "Nota 1", "Nota 2", "Nota 3", "Média");
        for(int i=0;i<alunos.length;i++){
            System.out.printf("%-10s%8.1f%8.1f%8.1f%8.2f%n" ,alunos[i],notas[i][0],notas[i][1],notas[i][2],mediaAluno(notas[i]));
        }

    }

}
