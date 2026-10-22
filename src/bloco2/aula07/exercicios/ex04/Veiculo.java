package bloco2.aula07.exercicios.ex04;
//Veiculo.java, Carro.java, Moto.java — Veiculo tem marca, modelo, ano e calcularIpva() (4% do valor); Carro acrescenta
// portas; Moto sobrescreve calcularIpva() para 2%. Imprima o IPVA dos dois;

import java.util.Scanner;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double valor;
    protected String texto;
    protected boolean entradaValida =false;


    public Veiculo(String marca, int ano, double valor){
        this.marca = marca;
        this.modelo =lerModelo();
        this.ano = ano;
        this.valor = valor;
    }
    public double calcularIpva(){
        return this.valor * 0.04;}

    public String lerModelo(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o modelo (apenas letras):");
            texto = scanner.nextLine();
            if(texto.matches("[a-zA-ZÀ-ÿ]+") && !texto.isEmpty()){
                entradaValida= true;
            }else {
                System.out.println("ERRO! A ENTRADA DEVE CONTER APENAS LETRAS");
            }
        }while(!entradaValida);
        System.out.println("Sucesso! Marca registrada com sucesso ("+texto+")");
        return texto;
    }

    @Override
    public String toString(){
        return String.format("Marca do Veículo: %s || Modelo: %s || Ano: %d || Valor: %.2f",marca,modelo,ano,valor);
    }







}
