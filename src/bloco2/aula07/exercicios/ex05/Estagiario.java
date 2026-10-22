package bloco2.aula07.exercicios.ex05;
//Desafio 🌶️ Funcionario.java + subclasses — Funcionario (abstrata na prática: nome, matrícula, salarioBase) com
// Gerente (bônus de 20% + auxílio fixo), Vendedor (salário base + comissão sobre as vendas do mês) e Estagiario
// (bolsa fixa, sem 13º). Cada subclasse sobrescreve calcularSalario(). No main, crie um Funcionario[] com os três e
// imprima a folha de pagamento total — repare que o mesmo laço trata os três tipos: é o gancho da Aula 08.
public class Estagiario extends Funcionario{
    protected double bolsaFixa = 0;

    public Estagiario(String nome, String matricula,double salarioBase, double bolsaFixa){
        super(nome,matricula, salarioBase);
        this.bolsaFixa = bolsaFixa;
    }

    @Override
    public double calcularSalario(){
        return bolsaFixa;
    }
    @Override
    public String toString(){
    return super.toString() + String.format("CARGO || ESTAGIÁRIO || SÁLARIO(bolsa):%.2f ",calcularSalario());
    }

    //Cada subclasse sobrescreve calcularSalario(). No main, crie um Funcionario[] com os três e
    // imprima a folha de pagamento total — repare que o mesmo laço trata os três tipos: é o gancho da Aula 08.
    public static void main(String[] args) {
        Funcionario[] equipe = new Funcionario[3];
        double folhaPagamentoTotal = 0;
        equipe[0] = new Gerente("Ana", "99998-00",10000.00,250.00);
        equipe[1] = new Estagiario("Miguel","1111-00",1200.00,9999.00);
        equipe[2] = new  Vendedor("Claudinho","1111-00",1200.00, 800.00);
        Funcionario f = new Gerente("Claudio","13213123-00", 1111, 11111);
        for(int i = 0;i<equipe.length;i++){
            System.out.println(equipe[i].toString());
            folhaPagamentoTotal += equipe[i].calcularSalario();
        }
        System.out.println("O valor total da folha de pagamento é: " + folhaPagamentoTotal);
        System.out.println(f);
        double calcularSalario = f.calcularSalario();
        System.out.println(calcularSalario);
    }


}
