package bloco2.aula08.exercicios.ex05;
// Reprodutor.java — modele um player de mídia: classe abstrata Midia (título, duração, reproduzir() abstrato),
// com Musica, Podcast e Video; a interface Baixavel (baixar(), getTamanhoMb()) é implementada só por Musica e Video.
// Uma "playlist" (Midia[])
//reproduz tudo em sequência e, num segundo laço, baixa apenas o que for baixável — use instanceof com pattern matching
//aqui e explique num comentário por que, neste caso, ele se justifica.
public class Musica extends Midia implements Baixavel{
    protected String nomeArtista;
    protected String nomeAlbum;
    protected double tamanhoMb;
    public Musica(String titulo, String duracao, double tamanhoMb,String nomeArtista, String nomeAlbum){
        super(titulo,duracao);
        this.tamanhoMb = tamanhoMb;
        this.nomeArtista =  nomeArtista;
        this.nomeAlbum = nomeAlbum;
    }
    public String getNomeArtista(){
        return nomeArtista;
    }
    public String getAlbum(){
        return nomeAlbum;
    }

    @Override
    public void reproduzir(){
        System.out.println("A música "+this.getTitulo() + "-Artista: "+this.getNomeArtista()+ "-Album: "+this.getAlbum()+"-Duração: "+this.getDuracao() + " -- começou a tocar.");
    }

    @Override
    public void baixar(){
        System.out.println("A musica: "+this.getTitulo() + " está sendo baixada. Tamanho do Download: "+this.getTamanhoMb());

    }
    @Override
    public double getTamanhoMb(){return this.tamanhoMb;}



}
