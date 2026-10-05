package bloco2Real.aula07.studys;

//1. O problema: copiar e colar entre classes

//Uma escola tem alunos e professores. Você escreve as duas classes:

//public class Aluno {
//    private String nome;      // ┐
//    private String cpf;       // │ igual
//    private int idade;        // ┘
//    private String matricula;
//    // getters, setters, toString... tudo duplicado

//public class Professor {
//    private String nome;      // ┐
//    private String cpf;       // │ igual de novo
//    private int i dade;        // ┘
//    private double salario;
//    // ...os mesmos getters, setters, toString...
//}

// Agora o CPF passa a exigir validação. Você tem que alterar os dois arquivos — e no dia em que esquecer um, nasce um
// bug. Amanhã entra Funcionario, e são três.
//
//A causa é que existe um conceito escondido: pessoa. Aluno é uma pessoa; professor é uma pessoa. Herança é a ferramenta
// para dizer isso em código.

public class Pessoa {
    protected String nome;      // protected: visível para as SUBCLASSES
    protected String cpf;
    protected int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {return  idade;}

    public boolean ehMaiorDeIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
