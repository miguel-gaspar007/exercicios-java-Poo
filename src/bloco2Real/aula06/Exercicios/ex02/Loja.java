package bloco2Real.aula06.Exercicios.ex02;
//Produto.java + Loja.java — implemente a classe da seção 3 completa (validação de preço, estoque, venda) e escreva um
// main que testa todos os caminhos: preço inválido, venda maior que o estoque, venda válida;
public class Loja {
    public static void main(String[] args) {
        Produto p = new Produto("Crédito",11.00);
        Produto erro1 = new Produto("ERRO?", -11.00); // setPreco bloqueia adicionar valores negativos
        erro1.setPreco(19.00);
        System.out.println("Set preco libera o setter desde que o valor seja positivo. Preço atualizado:" +erro1.getPreco());
        erro1.adicionarEstoque(-99);
        erro1.adicionarEstoque(99);
        System.out.println("A regra de negócio para 'adicionarEstoque' é apenas uma, o número deve ser positivo, estoque atualizado. VALOR: "+erro1.getEstoque());
        erro1.vender(1000);
        erro1.vender(2);
        System.out.println("A venda só ocorrerá se a regra de negócio for validada. Obviamente o valor de itens a vender nao pode ser maior que o valor em estoque. Quantidade em estoque depois da venda: "+erro1.getEstoque());
        System.out.println(p);
    }


}
