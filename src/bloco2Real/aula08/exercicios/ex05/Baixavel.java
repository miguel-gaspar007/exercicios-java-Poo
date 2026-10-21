package bloco2Real.aula08.exercicios.ex05;
// Reprodutor.java — modele um player de mídia: classe abstrata Midia (título, duração, reproduzir() abstrato),
// com Musica, Podcast e Video; a interface Baixavel (baixar(), getTamanhoMb()) é implementada só por Musica e Video.
// Uma "playlist" (Midia[])
//reproduz tudo em sequência e, num segundo laço, baixa apenas o que for baixável — use instanceof com pattern matching
//aqui e explique num comentário por que, neste caso, ele se justifica.
public interface Baixavel {
    void baixar();
    double getTamanhoMb();
}
