package bloco2.aula07.exercicios.ex04;
import java.util.Scanner;
//Veiculo.java, Carro.java, Moto.java — Veiculo tem marca, modelo, ano e calcularIpva() (4% do valor); Carro acrescenta
// portas; Moto sobrescreve calcularIpva() para 2%. Imprima o IPVA dos dois;
public class Carro  extends Veiculo{
    protected int portas = 0;
    protected int numero;
    protected boolean entradaValida = false;

    public Carro(String marca,int ano, double valor ){
        super(marca,ano,valor);
        this.portas= setPortas();
    }


    public int setPortas(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o número de portas do carro(0-10):");
            numero = scanner.nextInt();
            if(numero >0 &&  numero<=10){
                entradaValida= true;
            }else {
                System.out.println("ERRO! A ENTRADA DEVE CONTER APENAS LETRAS");
            }
        }while(!entradaValida);
        System.out.println("Número de portas registrado com sucesso! ("+numero+")");
        this.portas =numero;
        return numero;

        }


    @Override
    public String toString(){
        return super.toString() + String.format("|| Número de portas: %d || IPVA(4%%): %.2f",portas,calcularIpva());
    }

    }






