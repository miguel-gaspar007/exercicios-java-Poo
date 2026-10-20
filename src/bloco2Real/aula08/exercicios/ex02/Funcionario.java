package bloco2Real.aula08.exercicios.ex02;
    //Funcionario.java (abstrata) + subclasses — refaça o desafio da Aula 07 tornando Funcionario abstrata com
    // calcularSalario() abstrato. Depois crie um Diretor sem implementar o metodo e copie o erro do compilador num
    // comentário;
public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase = 0;

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
