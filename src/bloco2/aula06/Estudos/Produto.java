package aula06.Estudos;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
        this.estoque = 0;
    }
    public void setPreco(double preco){
        if (preco <= 0 ){
            System.out.println("Preço inválido: "+ preco + ". Mantido " + this.preco);
            return;
        }this.preco = preco;
    }
    public void adicionarEstoque(int quantidade){
        if (quantidade <=0){
            System.out.println("Quantidade deve ser positiva.");
            return;
        }this.estoque += quantidade;
    }

    //Por que não tem else?
    //
    //O comando return dentro de um método void (ou que retorna algo) faz o Java parar imediatamente a execução
    // do método e sair dele naquele exato momento.

    public boolean vender(int quantidade){
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente. Dísponivel: " +estoque);
            return false;
        }
        this.estoque -= quantidade;
        return true;
    }
//    Repare que vender() e adicionarEstoque() não são setters — são operações do negócio. É assim que uma boa classe
//    se parece: menos set, mais verbos de verdade.
//💡 Por enquanto avisamos com System.out.println e return. Na Aula 10 você vai lançar exceções, que é o jeito
// profissional de dizer "isso não pode".


}
