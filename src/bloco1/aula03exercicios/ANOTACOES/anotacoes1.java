package bloco1.aula03exercicios.ANOTACOES;
import java.util.Scanner;
public class anotacoes1 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        System.out.println(a==b); // true por coincidência, ao criar a e b com o mesmo texto direto, o Java cria apenas
        //um objeto na memória, oq ocasiona o true. Portanto não da para comparar objetos com
        // ==, o certa seria usar a.equals(c)

        String c = new String("Java");
        System.out.println(a == c);
        System.out.println(a.equals(c));
        //Por quê? Porque String é objeto: == pergunta "são o mesmo objeto na memória?", e .equals() pergunta "têm o
        //mesmo conteúdo?". Literais idênticos escritos no código são otimizados para o mesmo objeto — mas texto vindo
        // do Scanner, de um arquivo ou de uma concatenação não é.


        System.out.println("--------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        if (senha =="1234") {
            System.out.printf("Sua senha é: 1234"); // nunca vai ser true
        }else if(senha.equals("1234")) {
            System.out.printf("Sua senha é: 1234");
        }else if("1234".equals(senha)){
            System.out.printf("Sua senha é: 1234");// evita erro se a senha for null(zerada)
        }else if (senha.equalsIgnoreCase("Sim")){
            System.out.printf("Sua senha é: \"Sim\"");
        }



        System.out.println("------------------IFS EM APENAS 1 LINHA ----------------------------");
        int nota = 7;
        String situacao = (nota>=7) ? "Aprovado" : "Reprovado";

        System.out.println("\n" +situacao);


        int linha1 = 1000;
        String linhas = (linha1<900) ? "Aprovado" : "Reprovado";
        System.out.println(linhas);

        //Ótimo para escolhas curtas; péssimo para lógica comprida (não aninhe ternários dentro de ternários).





    }
}
