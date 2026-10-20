package bloco2Real.aula08.exercicios.ex01;

public class Triangulo extends Forma{
    protected double baseTriangulo = 0;
    protected double alturaTriangulo = 0;
    protected double ladoA= 0;
    protected double ladoB = 0;
    protected double ladoC = 0;

    public Triangulo (double baseTriangulo, double alturaTriangulo, double ladoA, double ladoB, double ladoC){
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo =  alturaTriangulo;
        this.ladoA = ladoA;
        this.ladoB =  ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea(){
        return (baseTriangulo * alturaTriangulo) /2;
    }

    @Override
    public double calcularPerimetro(){
        return (ladoA + ladoB + ladoC);
    }

    @Override
    public String toString(){
        return String.format("Área do Triângulo: %.2f  || Perimetro do Triângulo: %.2f",calcularArea(),calcularPerimetro());
    }


}
