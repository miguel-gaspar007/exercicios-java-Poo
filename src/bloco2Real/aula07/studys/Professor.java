package bloco2Real.aula07.studys;

public class Professor extends Pessoa{
    private double salario;
    public Professor(String nome, String cpf, int idade, double salario){
        super(nome,cpf,idade);
        this.salario = salario;
    }
    public double calcularSalarioAnual(){return salario * 13;}

    public static void main(String[] args) {
        Professor prof = new Professor("Cleber","42017263800", 19, 20000.00);
        System.out.println(prof.calcularSalarioAnual());

    }



}
