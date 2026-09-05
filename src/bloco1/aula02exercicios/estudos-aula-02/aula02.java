
public class aula02 {
    public static void main(String[] args) {
        //tipagem estatica
        int idade = 19; //campo só guarda numeros
        String nome = "claudinha"; //campo só guarda Letras
        System.out.println("A idade da " + nome + " é: " + idade);
        double preco = 19.99; //campo só suporta numeros com casas decimais!!
        // idade = 20; continua sendo int e idade= "vinte" ocasiona erro ❌ error: incompatible types: String cannot be converted to int
        
         // O padrão de nomes é o camelCase, começando por minúscula:
    double mediaFinal = 8.5; //camelCase, padrão java    //double MediaFinal = 8.5; // funciona, mas não é o estilo Java
    // int 2nota = 7; // ❌ error: not a statement ( Não pode começar com número)
    //int class = nome; -------> palavras reservadas não podem ser nomes
    
        System.out.println("A média final é: " + mediaFinal);

        //São 8 tipos que não são objetos — guardam o valor puro. Estes quatro resolvem 95% do curso:

        int quantidade = 42; // só numeros inteiros
        double preco2 = 19.90; // só números com casas decimais
        boolean aprovado = true; // só true e false
        char inicial = 'M'; // UM CARACTERE, entre aspas simples 
        //⚠️ char usa aspas simples; String usa aspas duplas. 'M' é um caractere, "M" é um texto de tamanho 1. Trocar as aspas dá erro de compilação.
       

        //int soma;
        //Valores padrão importam: variáveis locais (dentro de um metodo) não têm valor padrão. Usar antes de atribuir é erro de compilação:
        //System.out.println(soma);   // ❌ error: variable soma might not have been initialized

        String frase = "Java é uma linguagem de programação legal";
        System.out.println(frase.length()); // length() retorna o tamanho da string(quantidade de caracteres)
        System.out.println(frase.toUpperCase()); // toUpperCase() retorna a string em maiúsculas
        System.out.println(frase.toLowerCase()); // toLowerCase() retorna a string em minúsculas
        System.out.println(frase.contains("Java"));// contains() retorna true se a string contém o texto passado como parâmetro
        System.out.println(frase.charAt(0)); // charAt() retorna o caractere na posição passada como parâmetro
        System.out.println(frase.substring(0,4)); //subtring() retorna a substring da posição inicial até final que foram declaradadas como parâmetro
        System.out.println(" espaços  ".trim());// trim() remove os espaços em branco do início e do fim da string

        // Concatenar texto é com "+"  :
        System.out.println("A frase tem: " + frase.length() + " caracteres." );

        //Para saídas mais bem formatadas, use printf() e -- %s recebe texto, %d recebe número inteiro, %.2f recebe numero decimal com 2 casas e %n quebra linha.
        double media = 0.85;
        int arredondamento= 2; 
        System.out.printf("Olá, %s! A sua média é:%n%.2f.%nVenho através desse email comunicar o arredondamento da sua nota para %d.",nome, media, arredondamento);

        //Casting e a armadilha da divisão inteira  ---java converte automaticamente quando não há riscos de perder informação ( caixa
        int inteiro = 10;
        double comDecimais = inteiro; // 10.0 cabe tranquilamento em 10.00 (double é número com 2 casas decimais)
        System.out.println("\n\n\n10 de int para double: "+comDecimais);

       // No sentido contrário, você precisa assumir a responsabilidade com um ----------CAST---------- :
        double valor =0.99;
        //int truncado = valor; --> não vai funcionar, possível conversão com perdas de double para int.
        int truncado = (int)valor; //--> Assim funciona, assumindo a responsabilidade pelo cast
        System.out.println("0.99 em double para INT: "+truncado);


        System.out.println("E aqui está o erro que mais estraga cálculo de média no mundo:");
        //E aqui está o erro que mais estraga cálculo de média no mundo:
        //int soma = 7;
        //int quantidade = 2;
        //System.out.println(soma / quantidade);              // 3    ← divisão INTEIRA! 😱
        //System.out.println((double) soma / quantidade);     // 3.5  ✅
        //System.out.println(7 / 2.0);                        // 3.5  ✅
        //System.out.println(7 % 2);                          // 1    (resto da divisão)
        int soma = 7;
        int soma2 = 2;
        System.out.println((double)soma/soma2); // --> funciona, se o resultado do calculo terá o retorno com decimais,é necessário tipar , como no mínimo double, se não float.
        System.out.println(11 / 2.0);
        System.out.println(11 / 2);
        System.out.println(7%2); // --> resto da divisão
        //Regra: int / int sempre dá int. Se você quer casas decimais, pelo menos um dos lados precisa ser double.

        // final: quando o valor não pode mudar
        final double PI = 3.14159;
        final int IDADE_MINIMA;
        // PI =3.15; // Cannot assign a value to final variable 'PI' ( constantes imutáveis)
        // Constantes são escritas em MAIUSCULA_COM_UNDERLINE, por convenção.
        // Use final sempre que um valor não deveria mudar: o compilador passa a proteger essa decisão.




    }

}
