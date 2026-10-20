package bloco2Real.aula07.exercicios.ex04;
//Veiculo.java, Carro.java, Moto.java — Veiculo tem marca, modelo, ano e calcularIpva() (4% do valor); Carro acrescenta
// portas; Moto sobrescreve calcularIpva() para 2%. Imprima o IPVA dos dois;
public class Moto extends Veiculo{
    public Moto(String marca, int ano, double valor){
        super(marca,ano,valor);
    }
    @Override
    public double calcularIpva(){
        return this.valor * 0.02;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("|| IPVA(2%%): R$%.2f",calcularIpva());
    }

    public static void main(String[] args) {
        Moto cg160 = new Moto("Honda",2026,15000.00);
        Veiculo x = new Veiculo("Volkswagen",2025, 20000.00);
        System.out.println(x);
        System.out.println(cg160);
    }

}
