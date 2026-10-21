package bloco2Real.aula08.exercicios.ex05;

public class Video extends Midia implements Baixavel{
    protected String nomeDoCanal;
    protected int numeroInscritos;
    protected double tamanhoMb;

    public Video(String titulo, String duracao, String nomeDoCanal, int numeroInscritos , double tamanhoMb){
        super(titulo,duracao);
        this.nomeDoCanal = nomeDoCanal;
        this.numeroInscritos = numeroInscritos;
        this.tamanhoMb = tamanhoMb;
    }

    @Override
    public void reproduzir(){
        System.out.printf("Vídeo: %s - Duração: %s - Canal: %s - %d Inscritos -- começou a tocar.%n",titulo,duracao,nomeDoCanal,numeroInscritos);
    }

    @Override
    public void baixar(){
        System.out.printf("Vídeo: %s - Nome do canal: %s || TAMANHO DO DOWNLOAD: %.2f%n",this.titulo, this.nomeDoCanal, this.tamanhoMb);
    }
    @Override
    public double getTamanhoMb(){return this.tamanhoMb;}


















}
