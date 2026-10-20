package bloco2Real.aula07.exercicios.ex05;
//Desafio 🌶️ Funcionario.java + subclasses — Funcionario (abstrata na prática: nome, matrícula, salarioBase) com
// Gerente (bônus de 20% + auxílio fixo), Vendedor (salário base + comissão sobre as vendas do mês) e Estagiario
// (bolsa fixa, sem 13º). Cada subclasse sobrescreve calcularSalario(). No main, crie um Funcionario[] com os três e
// imprima a folha de pagamento total — repare que o mesmo laço trata os três tipos: é o gancho da Aula 08.
public class Gerente extends Funcionario{
    protected double auxilioFixo = 0;

    public Gerente(String nome, String matricula, double salarioBase, double auxilioFixo){
        super(nome,matricula,salarioBase);
        this.auxilioFixo = auxilioFixo;
    }

    @Override
    public double calcularSalario(){
        return (salarioBase + (salarioBase * 0.2) + auxilioFixo);
    }
    @Override
    public String toString(){
        double bonusGerente = (this.salarioBase * 0.2);
        return super.toString() + String.format(" || CARGO: GERENTE || Salário: %.2f(20%% Bônus(%.2f) + Auxílio(R$%.2f))",calcularSalario(),bonusGerente,auxilioFixo);
    }
}
