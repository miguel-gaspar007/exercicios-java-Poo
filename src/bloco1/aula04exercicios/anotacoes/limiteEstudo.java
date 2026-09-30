package bloco1.aula04exercicios.anotacoes;

public class limiteEstudo {
    //6. O limite do que fizemos até aqui
    //Imagine cadastrar 3 alunos com nome, matrícula e três notas. Com o que você sabe:

    String[] nomes = new String[3];
    String[] matriculas = new String[3];
    double[][] notas = new double[3][3];      // 😖
    //Três arrays paralelos que precisam ficar sincronizados na mão: se você ordenar os nomes, as notas ficam
    // trocadas; se remover um aluno, tem que lembrar de remover em três lugares. E a média de um aluno é um
    // metodo solto, longe dos dados dele.

    // Falta uma forma de dizer: "um aluno é um nome, uma matrícula e três notas, e sabe calcular a própria média".
    // É exatamente isso que a próxima aula traz. 👉
}
