package bloco2.aula08.exercicios.ex02;

public class Diretor extends Funcionario{
    protected double extras = 0 ;
    public Diretor(String nome, String matricula, double salarioBase,double auxilio,double extras){
        super(nome,matricula,salarioBase);
        this.extras =  extras;
    }

//    @Override
//    public double calcularSalario(){
//        return this.salarioBase +  this.extras;
//    }

    @Override
    public String toString(){
        return String.format("Nome do funcionário: %s || Matricula: %s || Salário Base: %.2f || Salário total(Base +auxilio): ",nome,matricula,calcularSalario());
    }

    // erro: Class 'Diretor' must either be declared abstract or implement abstract method 'calcularSalario()' in 'Funcionario'


}
