package bloco2Real.aula07.studys;

public class Professor extends Pessoa{
    private double salario;
    public Professor(String nome, String cpf, int idade, double salario){
        super(nome,cpf,idade);
        this.salario = salario;
    }
    public double calcularSalarioAnual(){return salario * 13;}

    @Override
    public String toString(){return super.toString() + String.format("Salário mensal: %.2f  || Salário anual: %.2f",salario,calcularSalarioAnual());}



}
