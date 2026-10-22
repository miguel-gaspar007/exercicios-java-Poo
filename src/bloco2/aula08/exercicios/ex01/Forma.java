package bloco2.aula08.exercicios.ex01;
//Forma.java, Circulo.java, Retangulo.java, Triangulo.java, Geometria.java — Forma é abstrata com calcularArea() e
//calcularPerimetro() abstratos e um toString() concreto que usa os dois. No main, crie um Forma[] com as três e imprima
//a área de cada uma e a soma total — sem nenhum if de tipo;
public abstract class Forma {

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString(){
        return String.format("Aréa: %.2f || Perímetro: %.2f",calcularArea(),calcularPerimetro());
    }


}
