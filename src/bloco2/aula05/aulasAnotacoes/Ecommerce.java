package bloco2.aula05.aulasAnotacoes;

public class Ecommerce {
    public static void main(String[] args)
    {
        Produto[] carrinho = new Produto[3];

        carrinho[0] = new Produto("Teclado Gamer", 5.00);
        carrinho[1] = new Produto("Mousepad gamer",1000.00);
        carrinho[2] = new Produto("Teclado de Membrana horrível", 1.99);

        double total =0;

        for (Produto p: carrinho){
            System.out.println("Produto: "+p.nome+"- "+p.preco);
            total = total + p.preco;
        }
        System.out.println("Total da compra: "+total+"R$");

    }
}
