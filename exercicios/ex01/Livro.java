package bloco2.aula05.exercicios.ex01;


//a classe Livro tem titulo, autor, paginas e disponivel, mais os métodos emprestar(), devolver() e exibirFicha().
// No main de Estante, crie 3 livros, empreste um e exiba as três fichas
public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean disponivel = true;


    public Livro(String titulo,String autor,int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void emprestar(){
        if (this.disponivel == true){
            this.disponivel = false;
            System.out.println("O livro "+this.titulo+" foi emprestado com sucesso.");
        }else if(this.disponivel == false){
            System.out.println("O livro "+this.titulo+" já foi emprestado com sucesso.");
        }
    }

    public void devolver(){
        if(this.disponivel == false){
            this.disponivel = true;
            System.out.println("O livro "+this.titulo+" foi devolvido com suceso.");
        }else if (this.disponivel == true){
            System.out.println("Não é possível devolver o item: "+this.titulo+ "ele já está em estoque.");
        }}
    public void exibirFicha(){
        System.out.printf("Ficha do livro: %15s %8s %8d %8s\n",this.titulo,this.autor, this.paginas, this.disponivel ? "Disponível" : "Indisponível");
    }

}
