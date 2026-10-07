package bloco2Real.aula07.exercicios.ex01;
import java.util.Arrays;
//Pessoa.java, Aluno.java, Professor.java, Escola.java — implemente a hierarquia da aula completa,
// com toString() sobrescrito nas três classes (usando super.toString() nas filhas) e um main que cria
// 2 alunos e 1 professor e imprime todos;z
public class Escola {
    public static void main(String[] args) {
        Professor marcos = new Professor("Marcos", "1111",12, 11 , "Matemática");
        Aluno cleber = new Aluno("Miguel", "121112290-00", 13, "9929389-229");
        Aluno jose = new Aluno("José", "420392288-00", 123, "2423412412-000");
        System.out.println(marcos + "\n" + cleber + "\n" + jose  );
        jose.setNotas(10.00,6.00,9.00);

        System.out.println("Notas do aluno: " + Arrays.toString(jose.getNotas()));
        System.out.println(jose);
        System.out.println(jose.getNotaString());

        // EXERCICIO 3 ----------------------------------------------------------------------------------------------
        // EX03Aluno.java (equals) — sobrescreva equals e hashCode por matrícula; no main, crie dois alunos
        // com a mesma matrícula e mostre o resultado de ==, .equals() e de um Aluno[] percorrido com .equals() para
        // encontrar o aluno. Depois comente o @Override do equals e observe o que muda;

        Aluno Maria = new Aluno("Maria", "12111220-00", 13, "9929389-230");
        Aluno Claudia = new Aluno("José", "420392288-00", 123, "9929389-230");

        System.out.println(Claudia.equals(Maria)); // retorna true . Entretanto sem o Override do equals ele retorna false, por deduzir que as informações sao diferentes por estarem em locais diferentes da memória mesmo sendo iguais
        if(Claudia == Maria){
            System.out.println("True");
        } // com == ele não retorna true. Pois vai caçar o local na memória, que é diferente, mesmo sendo os mesmos valores.

        Aluno Claudinha = new Aluno("Claudinha", "1111111111-00", 123, "23244242-000");
        Aluno[] listaAlunos = new Aluno[3];
        listaAlunos[0] = cleber;
        listaAlunos[1] = jose;
        listaAlunos[2] = Claudinha;

        for(int i=0; i<listaAlunos.length;i++){
            if(listaAlunos[i] != null && listaAlunos[i].equals(Claudinha)){
                System.out.println("O aluno " +listaAlunos[i].getNome()+" foi encontrado na posição: "+(i+1) + " do Array.");
            }
        }




    }
}
