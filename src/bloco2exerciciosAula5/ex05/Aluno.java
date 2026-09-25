package ex05;
// Desafio 🌶️ Aluno.java + Turma.java — refaça o Desafio da Aula 04 (boletim de 3 alunos) usando a classe Aluno com
// construtor, um Aluno[] e um laço. No fim do arquivo, escreva num comentário quantas linhas cada versão tem e o que
// ficou mais fácil de mudar.
public class Aluno {
    String nome;
    int nota1;
    int nota2;
    int nota3;

    public Aluno(String nome, int nota1, int nota2, int nota3){
        this.nome = nome;
        this.nota1= nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        double mediaAluno = ((this.nota1 + this.nota2 + this.nota3) / 3 );
        return(mediaAluno);
    }
    public void exibirBoletim(){
        System.out.printf("BOLETIM DO ALUNO: %s \n",this.nome);
        System.out.printf("%-10s%8s%8s%8s%8s%n", "Nome", "Nota 1", "Nota 2", "Nota 3", "Média");
        System.out.printf("%-10s%8d%8d%8d%8.2f%n%n%n",this.nome,this.nota1,this.nota2,this.nota3, calcularMedia() );
    }

}
