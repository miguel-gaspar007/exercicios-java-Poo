package bloco2.aula08.exercicios.ex01;
//Forma.java, Circulo.java, Retangulo.java, Triangulo.java, Geometria.java — Forma é abstrata com calcularArea() e
//calcularPerimetro() abstratos e um toString() concreto que usa os dois. No main, crie um Forma[] com as três e imprima
//a área de cada uma e a soma total — sem nenhum if de tipo;
public class Geometria {
    public static void main(String[] args) {
        double somaAreas = 0;
        Forma[] formas = {
                new Circulo(2.7),
                new Triangulo(2.0,2.0,2.0,2.0,2.0),
                new Retangulo(6.0,9.0)
        };

        for(Forma f: formas){
            System.out.println(f);
            somaAreas += f.calcularArea();
        }
        System.out.println("Soma total das áreas das formas geométricas: " + somaAreas);
    }
}
