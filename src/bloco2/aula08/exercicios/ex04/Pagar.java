package bloco2.aula08.exercicios.ex04;
import java.util.ArrayList;

//Pagamento.java + Pix.java, CartaoCredito.java, Boleto.java — interface Pagamento com double calcularTaxa(double valor)
// e String descricao(); Pix sem taxa, cartão com 3,5% + parcelamento, boleto com R$ 2,50 fixo. Um main recebe o valor
// da compra e imprime o total em cada forma;
public class Pagar {
    public static void main(String[] args) {
        ArrayList<Pagamento> listaPagamentos = new ArrayList<>();
        listaPagamentos.add(new Pix("Claudio", "22:30"));
        listaPagamentos.add(new CartaoCredito("Miguel",12));
        listaPagamentos.add(new Boleto("Miguel","12:00"));
        double valorCompra = 10000;
        for (Pagamento p: listaPagamentos){
            System.out.println(p);
            System.out.println("Valor da compra: " + valorCompra + " || Valor da taxa: "+ p.calcularTaxa(valorCompra) + " || Valor com taxa: " + (valorCompra + p.calcularTaxa(valorCompra)  ));
        }
    }
}
