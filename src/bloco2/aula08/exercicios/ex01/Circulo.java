package bloco2.aula08.exercicios.ex01;

public class Circulo extends Forma {
    protected double raio = 0 ;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio(){return this.raio;}

    @Override
    public String toString(){
        return String.format("A area do circulo: %.2f || Perimetro: %.2f",calcularArea(),calcularPerimetro());
    }
    @Override
    public double calcularArea(){
        double areaCirculo = (3.14*(this.raio*this.raio));
        return  areaCirculo;
    }

    @Override
    public double calcularPerimetro(){
        return (2 * 3.14 * this.raio);
    }


}
