package bloco2Real.aula08.exercicios.ex04;
//Pagamento.java + Pix.java, CartaoCredito.java, Boleto.java — interface Pagamento com double calcularTaxa(double valor)
// e String descricao(); Pix sem taxa, cartão com 3,5% + parcelamento, boleto com R$ 2,50 fixo. Um main recebe o valor
// da compra e imprime o total em cada forma;
public class CartaoCredito extends DadosPag implements Pagamento{
    protected int numeroParcelas = 0;
    public CartaoCredito(String nomeCliente, String horarioPag, int numeroParcelas){
        super(nomeCliente, horarioPag );
        this.numeroParcelas = numeroParcelas;
    }
    public CartaoCredito(String nomeCliente, int numeroParcelas){
        super(nomeCliente, null );
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public double calcularTaxa(double valor){
        return valor *(0.035 + (0.01 * this.numeroParcelas));

    }
    @Override
    public String descricao(){
        return " Método de pagamento: Cartão de Crédito.";
    }
    @Override
    public String toString(){
        return String.format(super.toString() + descricao() + " Número de parcelas: "+this.numeroParcelas );
    }

}
