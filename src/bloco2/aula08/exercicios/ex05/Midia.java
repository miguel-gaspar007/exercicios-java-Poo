package bloco2.aula08.exercicios.ex05;
// Reprodutor.java — modele um player de mídia: classe abstrata Midia (título, duração, reproduzir() abstrato),
// com Musica, Podcast e Video; a interface Baixavel (baixar(), getTamanhoMb()) é implementada só por Musica e Video.
// Uma "playlist" (Midia[])
//reproduz tudo em sequência e, num segundo laço, baixa apenas o que for baixável — use instanceof com pattern matching
//aqui e explique num comentário por que, neste caso, ele se justifica.
public abstract class Midia {
    protected String titulo;
    protected String duracao;
    public Midia(String titulo, String duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public abstract void reproduzir();

    @Override
    public String toString(){
        return String.format("Titulo: %s || Duracao: %s",titulo,duracao);
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getDuracao(){
        return this.duracao;
    }

}
