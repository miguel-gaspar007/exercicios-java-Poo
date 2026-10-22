package bloco2.aula08.anotacoesEstudos;

public abstract class Publicacao {
    protected String titulo;

    public Publicacao(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){ return this.titulo;}
}
