package bloco2Real.aula07.exercicios.ex01;
//Pessoa.java, Aluno.java, Professor.java, Escola.java — implemente a hierarquia da aula completa,
// com toString() sobrescrito nas três classes (usando super.toString() nas filhas) e um main que cria
// 2 alunos e 1 professor e imprime todos;
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected int idade;

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public boolean maiorDeIdade(){return  idade >=18;}

    @Override
    public String toString(){return "NOME DO ALUNO: "+nome+" || IDADE: "+idade+" || CPF: "+cpf;}

}
