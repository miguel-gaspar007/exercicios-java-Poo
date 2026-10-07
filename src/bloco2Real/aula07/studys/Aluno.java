package bloco2Real.aula07.studys;
import java.util.Objects;

public class Aluno extends Pessoa{
    private String matricula;
    private double[] notas = new double[3];

    public Aluno(String nome, String cpf, int idade, String matricula){
        super(nome,cpf,idade); // CHAMA O CONSTRUTOR DA SUPERCLASSE - primeira linha!
        this.matricula = matricula;
    }
    public double calcularMedia(){
        double soma = 0;
        for (double n: notas) soma+=n;
        return soma / notas.length;
    }

    public double setNotas(double[] notas){
        for (double n: notas){


        }
    }

    public boolean situacao(){
        double media = this.calcularMedia();
        if( media >=6.5){
            return true;
        }else if(media <= 6.5){
            return  false;} return false;
    }
    @Override
    public String toString() {
        // super.toString() chama a versão da superclasse — reaproveita em vez de repetir
        return super.toString() + " - matrícula " + matricula
                + " - média " + String.format("%.2f", calcularMedia());
    }

    //Você decide o critério de igualdade da sua classe. Para Aluno, dois objetos são o mesmo aluno se têm a
    // mesma matrícula:
    @Override
    public boolean equals(Object obj){
        if(this ==obj) return true;
        if(!(obj instanceof Aluno)) return false;
        Aluno outro = (Aluno) obj;
        return this.matricula.equals(outro.matricula);
    }
    @Override
    public int hashCode(){
        return Objects.hash(matricula);
    }


    public static void main(String[] args) {
        //Vocabulário: Pessoa é a superclasse (ou classe-mãe, ou classe-base); Aluno e Professor são
        // subclasses (ou classes-filhas, ou derivadas).
        Aluno ana = new Aluno("miguel","112323124",44,"44444444");
        ana.getNome();
        System.out.println(ana.getIdade());
        System.out.println(ana.ehMaiorDeIdade() ? "É maior de idade." : "Não é maior de idade.");
        System.out.println(ana.situacao() ? "O ALUNO ESTÀ APROVADO." : "O ALUNO ESTÀ REPROVADO.");
        System.out.println(ana);
        //5. equals() e hashCode()
        //Dois objetos com os mesmos dados são iguais? Por padrão, não:
        Aluno a1 = new Aluno("Ana", "111", 19, "1001");
        Aluno a2 = new Aluno("Ana", "111", 19, "1001");
        System.out.println(a1 == a2);        // false — objetos distintos na memória
        System.out.println(a1.equals(a2));  // false — equals herdado só compara referências



//        protected é o meio-termo que a herança pede: a subclasse acessa o atributo direto, o resto do mundo não.
//
//        A ordem dos construtores
//        public class Pessoa {
//            public Pessoa(String nome) {
//                System.out.println("1 - Construtor de Pessoa");
//            }
//        }
//
//        public class Aluno extends Pessoa {
//            public Aluno(String nome) {
//                super(nome);
//                System.out.println("2 - Construtor de Aluno");
//            }
//        }
//
//        new Aluno("Ana");
        // 1 - Construtor de Pessoa
        // 2 - Construtor de Aluno
        //Primeiro a mãe, depois a filha — sempre. Faz sentido: a parte Pessoa do objeto precisa existir antes
        //de a parte Aluno ser construída em cima dela.
    }


}
