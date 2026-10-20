package bloco2Real.aula08.exercicios.ex01;

public class Retangulo extends Forma {
    protected double baseRetangulo = 0;
    protected double alturaRetangulo = 0;


    public Retangulo(double larguraRetangulo, double alturaRetangulo){
        this.baseRetangulo = larguraRetangulo;
        this.alturaRetangulo = alturaRetangulo;
    }
    @Override
    public double calcularArea(){
        return (this.baseRetangulo * this.alturaRetangulo);
    }
    @Override
    public double calcularPerimetro(){
        return ((this.baseRetangulo * 2) * (this.alturaRetangulo * 2));
    }
    @Override
    public String toString(){
        return String.format("Área do Retângulo: %.2f || Perimetro do Retângulo: %.2f",calcularArea(),calcularPerimetro());
    }


}
