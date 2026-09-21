package bloco1.aula04exercicios.anotacoes;

public class metodos1 {
    public static double calcularMedia(double[] valores){
        double soma = 0;
        for(double v : valores){
            soma += v;
        }
        return soma /valores.length ;
    }

    public static void imprimirSituacao(double media) {
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }

    public static void main(String[] args) {
        double notas[] = {8.5, 7.0, 9.0,2.0};
        double media = calcularMedia(notas);
        System.out.printf("Sua média é: %.2f%nVocê está ",media);
        imprimirSituacao(media);

//Por que vale a pena:
// Nome = documentação. calcularMedia(notas) se explica sozinho;
// Reuso. Escreveu uma vez, chama quantas quiser;
// Conserto local. Bug na média? Existe um único lugar para olhar.
// Metodo com retorno precisa de return em todos os caminhos, senão: error: missing return statement.



    }
}
