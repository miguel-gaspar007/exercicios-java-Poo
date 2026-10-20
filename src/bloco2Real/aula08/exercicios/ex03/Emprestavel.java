package bloco2Real.aula08.exercicios.ex03;
//Emprestavel.java, Livro.java, Projetor.java, Almoxarifado.java — implemente a interface da aula em duas classes sem
//parentesco e escreva um metodo static void emprestarTodos (Emprestavel[] itens, String responsavel)
//que funciona com qualquer uma;
public interface Emprestavel {
    void emprestar(String responsavel);
    void devolver();
    boolean estaDisponivel();
}
