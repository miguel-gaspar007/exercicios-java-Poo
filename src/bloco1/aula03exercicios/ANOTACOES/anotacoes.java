package bloco1.aula03exercicios.ANOTACOES;

public class anotacoes {
    public static void main(String[] args) {
        int a= 7, b=2;
        System.out.println(a+b); //SOMA
        System.out.println(a-b); //SUBTRAÇÃO
        System.out.println(a*b); //MULTIPLICAÇÃO
        System.out.println(a/b); //DIVISÃO
        System.out.println(a%b); // RESTO DA DIVISÃO

        // Atalhos que usaremos durante todo o curso
        int contador = 10;

        contador++; // --> contador +1 =11
        contador--; // --> contador -1 =9
        contador += 5;  // contador --> contador +5 = 15
        contador *= 2; // -->30
        //System.out.print(contador);

        //Operadores relacionais e lógicos
        //Comparações sempre resultam em boolean:
        int nota =7;
        System.out.println(nota> 6 ); // true
        System.out.println(nota >= 7 ); //true
        System.out.println(nota == 10 ); // false <-- IGUALDADE é ==, com dois sinais
        System.out.println(nota != 10 ); // true (diferente)
        //⚠️ = atribui, == compara. Em Java, escrever if (nota = 10)
        // nem compila (o if exige um boolean) — o compilador salva sua pele aqui.

        boolean temIdade = true;
        boolean temDocumento = false;

        System.out.println(temIdade && temDocumento); // false se temIdade e temDocumento são true
        System.out.println(temIdade || temDocumento); //true || --> OU. basta um dos dois serem true.
        System.out.println(!temIdade);

        // if, else if, else


        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        //A condição do if precisa ser boolean — não existe "0 é falso" em Java;
        //As condições são testadas em ordem, e o primeiro if verdadeiro encerra a cadeia.
        // Por isso nota >= 5 só é avaliado se nota >= 7 já falhou;
        //Sempre use chaves, mesmo com uma linha só. Sem elas, este bug clássico aparece:
        //-----------------------------------------
        //if (aprovado)
          //  System.out.println("Parabéns!");
        // System.out.println("Você passou!");
        //---------------------------------------

        // Condições podem aninhar, mas cuidado com o excesso - três níveis de if dentro de if já pedem outra solução:
                //if (idade >=18 && temDocumento){
            //System.out.println("Pode entrar");
        //}

//---------------------------------------------------------------------------------------------------------------------//

        //switch: quando é o mesmo valor comparado a várias opções
        int diaDaSemana =3;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Dia inválido. ");
        }
 //⚠️ Esquecer o break é o bug clássico do switch. Sem ele, a execução continua nos casos seguintes — o famoso fall-through.
    //desde o java 14 existe a forma moderna, com ->, que não precisa de break e ainda devolve um valor:
                String nomeDoDia = switch (diaDaSemana){
                    case 1 -> "Domingo";
                    case 2 -> "Segunda";
                    case 3 -> "Terça";
                    case 4 -> "Quarta";
                    default -> "Dia inválido";

                };
                System.out.println(nomeDoDia + "\n\n\n"); //Terça
        //Use switch quando testar um mesmo valor contra várias opções fixas; use if/else if quando as condições forem
        // diferentes entre si (nota >= 7, idade < 18...).


        // == vs .equals() : a armadilha das Strings
        //Essa é a pegadinha mais importante do bloco:

        String a = "Java";
        String b = "Java";
        System.out.println(a==b); // true  ← funcionou... por acidente!

        String c = new String("Java");
        System.out.println(a == c);  // false 😱 mesmo texto, resposta falsa
        System.out.println(a.equals(c)); // true  ✅ compara o CONTEÚDO

        //Por quê? Porque String é objeto: == pergunta "são o mesmo objeto na memória?", e .equals() pergunta "têm o
        // mesmo conteúdo?". Literais idênticos escritos no código são otimizados para o mesmo objeto — mas
        // texto vindo do Scanner, de um arquivo ou de uma concatenação não é.



        }



    }

