package bloco1.aula04exercicios.exercicios;

public class Estatisticas {
    public static double maior(double[] valores){
        double maiorValor =valores[0];
        for(int i=0;i<valores.length;i++){
            if (valores[i]>maiorValor){
                maiorValor = valores[i];
            }
        }
        return maiorValor;
    }
    public static double menor(double[] valores){
        double menorValor = valores[0];
        for(int i=0; i<valores.length;i++){
            if(menorValor>valores[i]) {
                menorValor = valores[i];
            }
            }
        return menorValor;
        }

    public static double soma(double[] valores){
        double Soma = 0;
        for(int i=0;i<valores.length;i++){
            Soma+=valores[i];
        }
        return Soma;
        }
    public static double media(double[] valores){
        double mediaResultado = 0;
        double somaResultado=soma(valores);
        mediaResultado = (somaResultado/(valores.length));
        return mediaResultado;

    }

    public static void main(String[] args) {
        double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};
        double menorResultado = menor(notas);
        double maiorResultado = maior(notas);
        double mediaResultado = media(notas);
        double somaResul = soma(notas);
        System.out.println("A menor nota do aluno é: "+menorResultado);
        System.out.println("A maior nota do aluno é: "+maiorResultado);
        System.out.println("A soma das notas do aluno é: "+somaResul);
        System.out.println("A média de nota do aluno é: "+mediaResultado);

        //dado double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};, calcule e imprima maior, menor, soma e média — sem usar
        //biblioteca
        //pronta, e cada cálculo em seu próprio metodo static;
    }
}

