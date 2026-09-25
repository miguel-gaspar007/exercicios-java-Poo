package bloco2.aula05.exercicios.ex01;


//a classe Livro tem titulo, autor, paginas e disponivel, mais os métodos emprestar(), devolver() e exibirFicha().
// No main de Estante, crie 3 livros, empreste um e exiba as três fichas
public class Estante {
    public static void main(String[] args){
        Livro harryPotter = new Livro("Harry Potter","Clebinho",267);
        Livro diarioBanana = new Livro("Diário de um Banana","Cleidson",302);
        Livro pythonLearning = new Livro("Python Learning", "Glauber", 799);

        harryPotter.emprestar();
        harryPotter.exibirFicha();
        diarioBanana.exibirFicha();
        pythonLearning.exibirFicha();


    }

}
