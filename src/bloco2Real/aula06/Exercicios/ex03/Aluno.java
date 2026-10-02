package bloco2Real.aula06.Exercicios.ex03;
//Aluno.java + Turma.java — na classe Aluno, o setter de nota deve rejeitar valores fora de 0–10; adicione
// um contador static de alunos matriculados e um toString() com nome, média e situação.
// Prove no main que o contador funciona;
public class Aluno {
    private static int totalMatriculados = 0;
    private  String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public Aluno(String nome, int nota1, int nota2, int nota3){
        this.nome = nome;
        this.nota1= nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        totalMatriculados++;
    }
    public void setNota1 (int nota1)    {
        if(nota1>=0 && nota1<=10){
            this.nota1=nota1;
        }else{System.out.println("Nota deve ser de 0-10");
        return;}
    }
    public void setNota2 (int nota2){
        if(nota2>=0 && nota2<=10){
            this.nota2=nota2;
        }else{System.out.println("Nota deve ser de 0-10");
            return;}
    }
    public void setNota3 (int nota3){
        if(nota3>=0 && nota3<=10){
            this.nota3=nota3;
        }else{System.out.println("Nota deve ser de 0-10");
            return;}
    }
    public int getNota1(){return this.nota1;}
    public int getNota2(){return this.nota2;}
    public int getNota3(){return this.nota3;};
    public String getNome(){
        return this.nome;
    }

    public double calcularMedia(){
        double mediaAluno = ((this.nota1 + this.nota2 + this.nota3) / 3.0 );
        return(mediaAluno);
    }
    public void exibirBoletim(){
        System.out.printf("BOLETIM DO ALUNO: %s \n",this.nome);
        System.out.printf("%-10s%8s%8s%8s%8s%n", "Nome", "Nota 1", "Nota 2", "Nota 3", "Média");
        System.out.printf("%-10s%8d%8d%8d%8.2f%n%n%n",this.nome,this.nota1,this.nota2,this.nota3, calcularMedia() );
    }
    public static int getTotalMatriculados(){
        return totalMatriculados;
    }
    public String situacao(){
        if(calcularMedia() >= 7){
            return "APROVADO";
        }else {
            return "REPROVADO";
        }
    }

    @Override
    public String toString(){
        return String.format("Nome do aluno: %s || Média: %.2f || %s ",nome,calcularMedia(),situacao());
    }


}
