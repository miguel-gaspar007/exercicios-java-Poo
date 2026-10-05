package bloco2Real.aula06.Exercicios.ex05;

//Desafio 🌶️ CofrePorcos.java — um cofre que aceita moedas de 5, 10, 25, 50 centavos e R$ 1,00
// (qualquer outro valor é rejeitado com aviso), guarda o total, conta quantas moedas de cada tipo entraram e
// só permite quebrar() se o total passar de R$ 20,00 — zerando tudo e devolvendo o valor. Nenhum atributo público,
// nenhum setter.


public class CofrePorcos {
    private int moedas5 ;
    private int moedas10 ;
    private int moedas25 ;
    private int moedas50 ;
    private int moedas1 ;
    private double valorTotal = 0;
    private double valorTotal1 = 0;
    public CofrePorcos(){
        valorTotal = 0;
        moedas5 = 0;
        moedas10 = 0;
        moedas25 = 0;
        moedas50 = 0;
        moedas1 = 0;
    }
    public void depositar(double valor){
        if (valor ==0.05){
            this.moedas5++;
            this.valorTotal += 0.05;
            System.out.printf("Moeda de 5 Centavos adicionada com sucesso.\nMoedas de 5 Centavos no cofrinho: %d\nValor Total no cofrinho: %.2f\n",this.moedas5,this.valorTotal);
        }else if(valor ==0.10){
            this.moedas10++;
            this.valorTotal += 0.10;
            System.out.printf("Moeda de 10 Centavos adicionada com sucesso.\nMoedas de 10 Centavos no cofrinho: %d\nValor Total no cofrinho: %.2f\n",this.moedas10,this.valorTotal);

        }else if (valor ==0.25){
            this.moedas25++;
            this.valorTotal += 0.25;
            System.out.printf("Moeda de 25 Centavos adicionada com sucesso.\nMoedas de 25 Centavos no cofrinho: %d\nValor Total no cofrinho: %.2f\n",this.moedas25,this.valorTotal);
        }else if (valor ==0.50){
            this.moedas50++;
            this.valorTotal+=0.5;
            System.out.printf("Moeda de 50 Centavos adicionada com sucesso.\nMoedas de 50 Centavos no cofrinho: %d\nValor Total no cofrinho: %.2f\n",this.moedas50,this.valorTotal);
        }else if (valor == 1){
            this.moedas1++;
            this.valorTotal+= 1;
            System.out.printf("Moeda de 1 Real adicionada com sucesso.\nMoedas de 1  Real no cofrinho: %d\nValor Total no cofrinho: %.2f\n",this.moedas1,this.valorTotal);
        } else {System.out.printf("O valor digitado: R$%.2f não é válido. São permitidas moedas apenas de 0.05 R$ (5 centavos), 0.10R$ (10 centavos), 0.25R$ (25 centavos),%n0.50R$ (50 centavos), 1 R$ (1 Real).\n",valor); return;}
    }
    public double quebrar() {
        if (this.valorTotal >= 20) {
            valorTotal1 = valorTotal;
            this.valorTotal = 0;
            this.moedas5 = 0;
            this.moedas10 = 0;
            this.moedas25 = 0;
            this.moedas50 = 0;
            this.moedas1 = 0;
            return (this.valorTotal1);
        } else if (valorTotal < 20) {
            System.out.printf("O valor mínimo a ser juntado antes de quebrar é de: 20R$.\nVocê possui: R$ %.2f",this.valorTotal);
            return(this.valorTotal);
        }else{System.out.printf("ERRO !O valor mínimo a ser juntado antes de quebrar é de: 20R$.\nVocê possui: R$ %.2f",this.valorTotal);
            return(this.valorTotal);
    }}
    @Override
    public String toString(){return String.format("Valor Total: %.2f ",this.valorTotal);}

    public static void main(String[] args) {
        CofrePorcos p1 = new CofrePorcos();
        p1.depositar(0.10);
        p1.depositar(0.10);
        p1.quebrar();
    }



}
