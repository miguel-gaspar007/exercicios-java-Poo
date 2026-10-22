package bloco3.aula09.study;
import java.util.ArrayList;
import java.util.List;


public class study1 {
//    1. Onde o array não dá conta

//    Aluno[] turma = new Aluno[30];
//    Três problemas aparecem no primeiro cadastro real:
//    Tamanho fixo. Chegou o aluno 31? Você precisa criar um array maior e copiar tudo na mão;
//    Buracos. Removeu o aluno da posição 5? Fica um null no meio, e todo laço precisa desviar dele;
//    Contagem manual.
//    turma.length é 30 desde o início, mesmo com 3 alunos cadastrados.
//    Você acaba mantendo um int quantidade do lado — e sincronizando na mão.
//    O Java resolve isso com o Java Collections Framework: estruturas que crescem, encolhem e se organizam sozinhas.

//    2. List e ArrayList

//import java.util.ArrayList;
//import java.util.List;
//    List<Aluno> turma = new ArrayList<>();
//    cresce conforme a necessidade
//    Essa linha tem duas ideias importantes:
//
//    <Aluno> é o generic: a lista só aceita alunos. Tentar turma.add("texto") não compila — de novo, o compilador trabalhando por você;
//    List à esquerda, ArrayList à direita: você declara pelo contrato (List é uma interface!) e escolhe a implementação na hora de criar.
//    Amanhã, trocar para LinkedList é mudar uma palavra. É a lição da Aula 08 aplicada na biblioteca padrão.
//    Generics não aceitam primitivos: é List<Integer> e List<Double>, não List<int>. As classes wrapper (Integer, Double, Boolean, Character)
//    embrulham os primitivos, e a conversão é automática: numeros.add(42) funciona.
public static void main(String[] args) {


//    3. As operações do dia a dia
    List<String> nomes = new ArrayList<>();
    nomes.add("Ana");
    nomes.add("Bruno");
    nomes.add("Carla");
    nomes.add(1,"beto");
    System.out.println(nomes.contains("Ana"));

    System.out.println(nomes.size());
    System.out.println(nomes.get(0));
    nomes.set(0, "Ana Paula");
    nomes.removeIf(n ->n.equalsIgnoreCase("Beto"));
    nomes.remove(0);
    System.out.println(nomes.get(0));
    System.out.println((nomes.get(0)));
    System.out.println(nomes.indexOf("Ana Paula"));
    System.out.println(nomes.isEmpty());
    System.out.println(nomes);
    //LOOPs FOR / FOR EACH
    for(String nome:nomes){
        System.out.println(nome);
    }
    for(int i=0; i< nomes.size();i++){
        System.out.println((i+1) + " - " + nomes.get(i));
    }

}
}
