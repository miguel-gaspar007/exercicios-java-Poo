package bloco2Real.aula06.Exercicios.ex03;
//Aluno.java + Turma.java — na classe Aluno, o setter de nota deve rejeitar valores fora de 0–10; adicione um
// contador static de alunos matriculados e um toString() com nome, média e situação. Prove no main que o contador
// funciona;

public class Turma {
    public static void main(String[] args){
        Aluno miguel = new Aluno("Miguel", 1, 2, 3);
        Aluno ana = new Aluno("Miguel",8,2,10);
        miguel.setNota1(2);
        System.out.printf("A nota 1 do %s: %d",miguel.getNome(),miguel.getNota1());
        int totalMatriculas = Aluno.getTotalMatriculados();
        System.out.println(miguel);
        System.out.printf("%ntotal de alunos matriculados: %d%n",Aluno.getTotalMatriculados());
    }
}
