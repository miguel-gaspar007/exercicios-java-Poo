package bloco2.aula08.anotacoesEstudos;

public class Livro extends Publicacao implements Emprestavel, Comparable<Livro> {
    private boolean disponivel = true;
    private String comQuem;
    private String autor;

    public Livro(String titulo, String autor){
        super(titulo);
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    @Override
    public void emprestar(String responsavel){
        if (!disponivel){
            System.out.println(getTitulo()+ " já está emprestado para: " + this.comQuem );
        } this.disponivel = false;
        this.comQuem = responsavel;
        return;
    }
    @Override
    public void devolver(){
        this.disponivel = true;
        this.comQuem = null;
    }
    @Override
    public boolean estaDisponivel(){
        return disponivel;
    }

    @Override
    public  int compareTo(Livro outroLivro){
        return this.getTitulo(). compareTo(outroLivro.getTitulo());
    }

    @Override
    public String toString(){
        return String.format("Título: %s , Autor: %s, Está disponível: %s",getTitulo(),getAutor(),estaDisponivel() ? "Sim" : "Não" );
    }
    }

    //Agora qualquer classe — Livro, Projetor, SalaDeAula — pode assinar o mesmo contrato, e o código que empresta
    // funciona com todas:
    //Emprestavel[] itens = { new Livro("Dom Casmurro"), new Projetor("Epson X1") };
    //for (Emprestavel item : itens) {
    //    if (item.estaDisponivel()) {
    //        item.emprestar("Ana");
    //    }
    //}
    //Uma classe estende uma superclasse, mas pode implementar várias interfaces:
    //
    //public class Livro extends Publicacao implements Emprestavel, Comparable<Livro> {







