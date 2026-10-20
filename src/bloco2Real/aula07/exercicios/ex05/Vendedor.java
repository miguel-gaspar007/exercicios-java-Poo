package bloco2Real.aula07.exercicios.ex05;
//Desafio 🌶️ Funcionario.java + subclasses — Funcionario (abstrata na prática: nome, matrícula, salarioBase) com
// Gerente (bônus de 20% + auxílio fixo), Vendedor (salário base + comissão sobre as vendas do mês) e Estagiario
// (bolsa fixa, sem 13º). Cada subclasse sobrescreve calcularSalario(). No main, crie um Funcionario[] com os três e
// imprima a folha de pagamento total — repare que o mesmo laço trata os três tipos: é o gancho da Aula 08.
public class Vendedor extends Funcionario{
    public double valorComissao = 0 ;

    public Vendedor(String nome, String matricula, double salarioBase, double valorComissao){
        super(nome,matricula,salarioBase);
        this.valorComissao = valorComissao;
    }

    @Override
    public double calcularSalario(){
            return salarioBase + valorComissao;
    }
    @Override
    public String toString(){return super.toString() + String.format("||CARGO: Vendedor || Salário: %.2f ( Base + comissão(%.2f))",calcularSalario(),this.valorComissao);}
}
