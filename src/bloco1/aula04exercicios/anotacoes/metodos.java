package bloco1.aula04exercicios.anotacoes;
    public class metodos {

        // ┌ visível de fora
        // │      ┌ pertence à classe (não a um objeto) — por enquanto, sempre static
        // │      │      ┌ tipo do que devolve (void = não devolve nada)
        // │      │      │      ┌ nome (verbo, camelCase)     ┌ parâmetros
        public static double calcularMedia(double[] valores) {
            double soma = 0;
            for (double v : valores) {
                soma += v;
            }
            return soma / valores.length;      // devolve o resultado
        }

        public static void imprimirSituacao(double media) {
            System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
        }

        public static void main(String[] args) {
            double[] notas = {8.5, 7.0, 9.5, 6.0};

            double media = calcularMedia(notas);      // chama e guarda o retorno
            System.out.printf("Média: %.2f%n", media);
            imprimirSituacao(media);
        }
    }
