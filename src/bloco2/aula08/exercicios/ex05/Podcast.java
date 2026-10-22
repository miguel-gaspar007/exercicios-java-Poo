package bloco2.aula08.exercicios.ex05;
// Reprodutor.java — modele um player de mídia: classe abstrata Midia (título, duração, reproduzir() abstrato),
// com Musica, Podcast e Video; a interface Baixavel (baixar(), getTamanhoMb()) é implementada só por Musica e Video.
// Uma "playlist" (Midia[])
//reproduz tudo em sequência e, num segundo laço, baixa apenas o que for baixável — use instanceof com pattern matching
//aqui e explique num comentário por que, neste caso, ele se justifica.
public class Podcast extends Midia {
    protected String apresentador;
    public Podcast(String titulo, String duracao, String apresentador){
        super(titulo, duracao);
        this.apresentador = apresentador;

    }


    @Override
    public void reproduzir(){
        System.out.printf("O Podcast %s, com duração %s - Apresentador: %s  -- começou a tocar%n",this.titulo,this.duracao,this.apresentador);
    }

}
