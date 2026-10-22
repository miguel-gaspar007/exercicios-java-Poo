package bloco2.aula07.exercicios.ex05;
//Desafio 🌶️ Funcionario.java + subclasses — Funcionario (abstrata na prática: nome, matrícula, salarioBase) com
// Gerente (bônus de 20% + auxílio fixo), Vendedor (salário base + comissão sobre as vendas do mês) e Estagiario
// (bolsa fixa, sem 13º). Cada subclasse sobrescreve calcularSalario(). No main, crie um Funcionario[] com os três e
// imprima a folha de pagamento total — repare que o mesmo laço trata os três tipos: é o gancho da Aula 08.

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public  Funcionario(String nome, String matricula, double salarioBase){
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }
    @Override
    public String toString(){
        return String.format("Nome do funcionário: %s || Matricula: %s || Salário Base: %.2f ",nome,matricula,calcularSalario());
    }

    public abstract double calcularSalario();
}
