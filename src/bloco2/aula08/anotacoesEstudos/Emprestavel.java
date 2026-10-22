package bloco2.aula08.anotacoesEstudos;

public interface Emprestavel {
    void emprestar(String responsavel);
    void devolver();   // sem corpo, public e abstract implícitos
    boolean estaDisponivel();
}
