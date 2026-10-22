package bloco2.aula08.exercicios.ex03;
//Emprestavel.java, Livro.java, Projetor.java, Almoxarifado.java — implemente a interface da aula em duas classes sem
//parentesco e escreva um metodo static void emprestarTodos (Emprestavel[] itens, String responsavel)
//que funciona com qualquer uma;
public class Livro extends Publicacao implements Emprestavel {
    private boolean disponivel = true;
    private String comQuem;
    private String autor;
    public Livro(String titulo, String autor){
        super(titulo);
        this.autor = autor;
    }


    @Override
    public void emprestar(String responsavel){
    if(!disponivel){
        System.out.println("Já emprestado.");
    } this.comQuem = responsavel;
    this.disponivel = false;
    }
@Override
    public void devolver(){
        if(!disponivel){
            this.comQuem = null;
            System.out.println("Livro devolvido com sucesso.");
            disponivel = true;
        }if(disponivel){System.out.println("Livro disponível no sistema.");}
    }
@Override
    public boolean estaDisponivel (){
        return disponivel;
    }

    @Override
    public String toString(){
        return String.format("Titulo do livro: %s",this.getTitulo());
    }

}
