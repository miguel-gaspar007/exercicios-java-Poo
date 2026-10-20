package bloco2Real.aula08.anotacoesEstudos;

public interface Emprestavel {
    void emprestar(String responsavel);
    void devolver();   // sem corpo, public e abstract implícitos
    boolean estaDisponivel();
}
