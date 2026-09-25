package ex04;

// Crie um Retangulo[] com 3 objetos e imprima a área de todos com um for-each;
public class Geometria {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(12.00, 23.00);
        Retangulo retangulo2 = new Retangulo(24.00, 30.00);
        Retangulo retangulo3 = new Retangulo(19.00, 29.00);

        Retangulo[] lista = {retangulo1, retangulo2, retangulo3};

        for (Retangulo apelido : lista) {
            apelido.calcularArea();
            apelido.calcularPerimetro();
            apelido.ehQuadrado();
            System.out.println("\n");
        }
    }
}