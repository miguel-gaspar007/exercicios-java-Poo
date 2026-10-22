package bloco2.aula08.exercicios.ex04;
//Pagamento.java + Pix.java, CartaoCredito.java, Boleto.java — interface Pagamento com double calcularTaxa(double valor)
// e String descricao(); Pix sem taxa, cartão com 3,5% + parcelamento, boleto com R$ 2,50 fixo. Um main recebe o valor
// da compra e imprime o total em cada forma;
public class Pix extends DadosPag implements Pagamento{
    protected double valorLiquido =  0;
    public Pix(String nomeCliente, String horarioPag){
        super(nomeCliente, horarioPag);
    }
    public Pix(String nomeCliente){
        this(nomeCliente, null);
    }
    @Override
    public double calcularTaxa(double valor){
        return 0.0;
    }
    @Override
    public String descricao(){
        return " Pagamento realizado via Pix.";
    }
    @Override
    public String toString(){
        double taxaPix = 0.0;
        return super.toString() + descricao() ;
    }

}
