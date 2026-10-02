package bloco2Real.aula06.Exercicios.ex01;

// ContaBancaria.java + Banco.java — reescreva a conta da Aula 05 com todos os atributos private; ofereça
// getSaldo() sem setSaldo(), mais depositar, sacar e toString(). Tente alterar o saldo direto no main e copie o erro do
// compilador num comentário;

// -------------------------------------------EXERCICIO AULA 5 -----------------------------------------------
//ContaBancaria.java + Banco.java — atributos titular, numero e saldo; métodos depositar(double valor),
// sacar(double valor) (que só saca se houver saldo, imprimindo aviso caso contrário) e exibirExtrato().
// Teste os dois cenários de saque;
//------------------------------------------------------------------------------------------------------------
public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;
    private String extrato[];
    private int indiceExtrato = 0;

    public ContaBancaria(String titular, int numero, double saldo){
        this.titular= titular;
        this.numero = numero;
        this.saldo = saldo;
        this.extrato = new String [100];
    }
    public ContaBancaria(String titular){
        this(titular, 0,0.0);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        if(valor<=0){
            System.out.println("O valor digitado é negativo ou nulo.");
            return;
        }
        if (indiceExtrato < extrato.length){
            extrato[indiceExtrato]= "DEPÓSITO--> +" + valor ;
            this.saldo += valor;
            indiceExtrato++;
            System.out.println("Depósito de: R$"+valor);
        }else {System.out.println("Total de espaços no Extrato ocupado.");}
    }
    public String getTitular(){
        return this.titular;
    }
    public void sacar(double valor){
        if(valor<=0){
            System.out.println("O valor é nulo ou negativo.");
            return;
        } else if (this.saldo <0){
            System.out.println("O saldo é negativo.");
            return;
        }else if (this.saldo < valor){
            System.out.println("O Valor de saque é maior que o Saldo Disponível em conta.");
            return;
        }
        if(indiceExtrato < extrato.length){
            extrato[indiceExtrato] = "SAQUE   -->    -" + valor ;
            this.saldo -=valor;
            indiceExtrato++;
            System.out.printf("O saque no valor de: R$"+valor+" foi realizado com sucesso.%n");
        }else {System.out.println("O valor é nulo ou negativo.");}
    }
    public void exibirFicha(){
        System.out.printf("------------------------------------- Extrato do Titular: %s -------------------------------------%n",titular);
        for(int i=0;i<extrato.length;i++){
            if(extrato[i] != null) {
                System.out.println(extrato[i]);
            }        }


    }

    @Override
    public String toString() {
        return String.format("TITULAR DA CONTA: %s%nSALDO: %.2f%nNúmero da Conta: %d", titular, saldo, numero);
    }




}
