

public class ex01 {
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
        //Valores padrão importam: variáveis locais (dentro de um método) não têm valor padrão. Usar antes de atribuir é erro de compilação:
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
    }

}
