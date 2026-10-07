package bloco2Real.aula07.exercicios.ex01;

public class Professor extends Pessoa{
    private double salario;
    private String materia;

    public Professor (String nome,String cpf,int idade,double salario,String materia){
        super(nome,cpf,idade);
        this.salario = salario;
        this.materia = materia;
    }
    public double calcularSalarioAnual(){
        return salario * 13;
    }

    @Override
    public String toString(){return super.toString() + String.format(" || Sálario: %.2f || Matéria: %s",salario,materia);}

}
