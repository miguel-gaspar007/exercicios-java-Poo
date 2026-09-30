package bloco1.aula04exercicios.anotacoes;

public class Escopo {
    //    5. Escopo: onde cada variável existe
//    Uma variável vive dentro das chaves em que foi declarada — e morre ao fechar:
    public static void exemplo() {
        int fora = 10;

        for (int i = 0; i < 3; i++) {
            int dentro = i * 2;
            System.out.println(fora + dentro);   // ✅ enxerga as duas
        }

        System.out.println(dentro);   // ❌ cannot find symbol — morreu com o for
        System.out.println(i);        // ❌ idem
    }
}
