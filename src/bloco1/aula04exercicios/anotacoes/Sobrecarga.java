package bloco1.aula04exercicios.anotacoes;

public class Sobrecarga {
    public static double somar(double a, double b){
        return a + b;

    }
    public static double somar(double a, double b, double c){
        return a + b + c ;

    }

    public static void main(String[] args) {
        somar(2,3);
        somar(2,3,4);
    }
    // O compilador escolhe pelo número e tipo dos argumentos. É por isso que System.out.println aceita texto,
    // número ou boolean: são várias versões sobrecarregadas.




}
