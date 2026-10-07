package bloco2Real.aula07.exercicios.ex01;
import java.util.Objects;
import java.util.Arrays;
//Pessoa.java, Aluno.java, Professor.java, Escola.java — implemente a hierarquia da aula completa,
// com toString() sobrescrito nas três classes (usando super.toString() nas filhas) e um main que cria
// 2 alunos e 1 professor e imprime todos;
public class Aluno  extends Pessoa{
    private String matricula;
    private double[] notas =  new double[3];


    public Aluno(String nome, String cpf, int idade, String matricula){
        super(nome,cpf,idade);
        this.matricula = matricula;
    }

    public double calcularMedia(){
        double soma = 0;
        for (double n: notas) soma+=n;
        return soma/notas.length;
    }
    public boolean situacao(){
        double media = this.calcularMedia();
        if(media >=6.5){return true;}
        else if( media<6.5) {return false;}
        return false;
    }
    public void setNotas(double... notas){
        for (int i = 0; i<this.notas.length && i<notas.length; i++){
            this.notas[i] = notas[i];
        }
    }
    public double[] getNotas(){
        return this.notas;
    }
    public String getNotaString(){
        String notaString = "";
        for (int i = 0; i<this.notas.length; i++){
            notaString += "Nota "+(i+1)+" do aluno : "+getNome()+": "+this.notas[i] +"\n";
        }return notaString;

    }

    @Override
    public String toString() {
        return super.toString() + " || Matrícula: " +matricula + " || Situação: " + String.format("%s",situacao() ? "APROVADO" : "REPROVADO") + " || Média: " + String.format("%.2f",calcularMedia());
    }
   // EX 3
   @Override
    public int hashCode(){
        return Objects.hash(matricula);
    }
   // EX 3
//   @Override
//    public boolean equals(Object obj){
//        if (this ==obj) return true;
//
//        if (!(obj instanceof Aluno)) return false;
//
//        Aluno outro = (Aluno) obj;
//
//        return this.matricula.equals(outro.matricula);
////-------------------------------------------EX 3----------------------------------------------------------------
//   }
}
