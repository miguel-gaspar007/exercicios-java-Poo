package ex04;

// Retangulo.java + Geometria.java — a classe recebe base e altura pelo construtor e oferece calcularArea(),
// calcularPerimetro() e ehQuadrado().
public class Retangulo {
    double base;
    double altura;
    double area;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        area = (this.base * this.altura);
        System.out.println("A Área do Retângulo é: " + area);
    }

    public void calcularPerimetro() {
        double perimetro = (2 * (base + altura));
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }

    public void ehQuadrado() {
        boolean ehQuadrado = false;
        if (this.base == this.altura) {
            ehQuadrado = true;
        } else if (this.base != this.altura) {
            ehQuadrado = false;
        }
        System.out.printf("%s", ehQuadrado ? "Sim, é um quadrado" : "Não, não é um quadrado.");
    }
}