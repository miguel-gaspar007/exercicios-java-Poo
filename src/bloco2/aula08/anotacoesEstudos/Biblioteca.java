package bloco2.aula08.anotacoesEstudos;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Biblioteca {
    private List<Livro> acervo = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        acervo.add(livro);
    }
    public void ordenarAcervo(){
        Collections.sort(acervo);
    }

    public List<Livro> getAcervo(){
        return acervo;
    }

    public List<Livro> buscarPorTitulo(String termo){
        List<Livro> resultados = new ArrayList<>();
        String termoFormatado = termo.toLowerCase();
        if(termoFormatado == ""  ){
            System.out.println("Digite um termo para prosseguir. ");
        }else if(termo.trim().length() < 4){
            System.out.println("Digite mais de 4 dígitos contidos no título do livro. ");
        }else{
        for(Livro livro: acervo){
        if (livro.getTitulo().toLowerCase().contains(termoFormatado)){
            resultados.add(livro);
        }
    }}return resultados;}
}
