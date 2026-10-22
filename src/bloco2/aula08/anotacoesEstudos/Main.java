package bloco2.aula08.anotacoesEstudos;
import java.util.Scanner;
import java.util.List;
public class Main{
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro ("aaa","Claudinho do grau"));



        System.out.println("Digite o termo buscado ou uma parte dele: ");
         String termoBuscado = scanner.nextLine();
        List<Livro> encontrados = biblioteca.buscarPorTitulo(termoBuscado);
        if(encontrados.isEmpty()){
            System.out.println("Nenhum livro encontrado. ");}
        else{
            System.out.println("Livros encontrados: ");
            for(Livro l: encontrados){
                System.out.println(l);
            }
        }

        biblioteca.ordenarAcervo();

        System.out.println("---TODOS OS LIVROS EM ORDEM ALFABÉTICA:  --- ");
        for (Livro l : biblioteca.getAcervo()){
            System.out.println(l);
        }





    }
}
