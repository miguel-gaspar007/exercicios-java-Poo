package bloco2.aula05.aulasAnotacoes;

public class Aluno {
    String nome;
    String matricula;
    double[] notas = new double[3];

    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula =  matricula;
    }
    double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma +=nota;
        }
        return(soma/notas.length);
    }

    boolean estaAprova(){
        return calcularMedia() >= 7;
    }

    void imprimirBoletim(){
        System.out.printf("%s (%s) - Média: %.1f - %s%n",nome,matricula,calcularMedia(),estaAprova() ? "Aprovado" : "Repetiu!");
    }



}