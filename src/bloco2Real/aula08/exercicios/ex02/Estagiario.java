package bloco2Real.aula08.exercicios.ex02;

public class Estagiario extends Funcionario{
    protected double auxilio = 0;
    public Estagiario(String nome, String matricula, double salarioBase,double auxilio){
        super(nome,matricula,salarioBase);
        this.auxilio = auxilio;
    }

    @Override
    public double calcularSalario(){
        return this.salarioBase +  this.auxilio;
    }
    @Override
    public String toString(){
        return String.format("Nome do funcionário: %s || Matricula: %s || Salário Base: %.2f || Salário total(Base +auxilio): ",nome,matricula,calcularSalario());
    }

}
