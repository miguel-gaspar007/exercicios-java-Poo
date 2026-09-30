package bloco1.aula04exercicios.exercicios;

public class Refatorar {
    public static int soma(int[] valores1){
        int soma = 0;
        for(int v : valores1) soma+=v;
return(soma);
    }
    public static int maiorValor(int[] valores1){
        int maior = valores1[0];
        for (int v: valores1) if (v>maior) maior=v;
        return(maior);
    }
    public static int valoresPares(int[] valores1){
        int pares = 0;
        for (int v: valores1)  if(v % 2 == 0) pares++;
        return(pares);
    }



    public static void main(String[] args) {
        int[] valores = {4, 7, 2, 9, 3};
        System.out.printf("A soma dos valores é: %d%nO maior valor é %d%nOs números pares no array são: %d ",soma(valores),maiorValor(valores),valoresPares(valores));
        //for (int v : valores) soma += v; // adiciona cada valor do array  valores (com v) a soma
        //int maior = valores[0]; //declara maior como o valor na primeira posição no array de valores
        //for (int v : valores) if (v > maior) maior = v; // passando por cada valor, se o valor for que a variavel maior, se transforma nela. (maior valor  )
        //int pares = 0;
        //for (int v : valores) if (v % 2 == 0) pares++;
        //System.out.println(soma + " " + maior + " " + pares);
    }
}
