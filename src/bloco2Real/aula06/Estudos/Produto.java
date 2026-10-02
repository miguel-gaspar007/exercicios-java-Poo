    package bloco2Real.aula06.Estudos;

    public class Produto {
        private String nome;
        private double preco;
        private int estoque;
        private static int totalCadastrados = 0;
        private static final double DESCONTO_MAXIMO = 0.30;

       // O setter que defende a classe
       // O valor do setter aparece quando ele rejeita o que não faz sentido:

        //CONSTRUTOR PRIMÁRIO --> DECLARACAO das 3 variaveis para assinatura produto p ....  =
        // new produto (nome x , preco y , estoque )
        public Produto(String nome, double preco, int estoque){
            this.nome = nome;
            setPreco(preco);
            this.estoque = estoque;
            totalCadastrados++;
        }

        //CONSTRUTOR SECUNDARIO --> DECLARAÇÃO produto p = new produto ( nome e preco apenas, estoque já inicia com 0)
        public Produto(String nome, double preco){
            this(nome,preco, 0 );
        }
        public Produto(String nome) {
            this(nome, 0.0, 0);   // cada nascimento incrementa
        }
        public static int getTotalCadastrados(){
            return totalCadastrados;
        }

        @Override
        public String toString() {
            return String.format("%s - R$ %.2f (%d em estoque)", nome, preco, estoque);
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
        public int getEstoque(){
            return this.estoque;
        }
        public String getNome(){
            return this.nome;
        }
        public double getPreco(){
            return this.preco;
        }

//O System.out.println chama toString() sozinho. A anotação @Override avisa o compilador: "isto aqui é para substituir
// um metodo que já existe" — se você errar o nome ou a assinatura, ele reclama na hora, em vez de deixar você
// criar um metodo novo sem querer.
//💡 toString() é a ferramenta de depuração mais barata que existe. Implemente em toda classe do curso.
//💻 Código desta aula pronto para rodar: Produto.java + Loja.java

        public boolean vender(int quantidade){
            if (quantidade > estoque) {
                System.out.println("Estoque insuficiente. Dísponivel: " +estoque);
                return false;
            }
            this.estoque -= quantidade;
            return true;
            //Por que não tem else?
            //O comando return dentro de um metodo void (ou que retorna algo) faz o Java parar imediatamente a
            // execução
            // do metodo e sair dele naquele exato momento.
        }
    //    Repare que vender() e adicionarEstoque() não são setters — são operações do negócio. É assim que uma boa classe
    //    se parece: menos set, mais verbos de verdade.

    //💡 Por enquanto avisamos com System.out.println e return. Na Aula 10 você vai lançar exceções, que é o jeito
    // profissional de dizer "isso não pode".

        public static void main(String[] args) {
            Produto p1 = new Produto("Teste 1" , 12.99, 55);
            System.out.println(p1);
            System.out.printf("O total de produtos %s, com preço:  %.2f em estoque é: %d%n ", p1.getNome(),p1.getPreco(),p1.totalCadastrados);
            Produto leite = new Produto("Leite",5.99, 29);
            Produto ovo = new Produto("Ovo", 12.99);
            System.out.println("A Quantidade em estoque de " + ovo.getNome() + "s é: " + ovo.getEstoque());
            leite.adicionarEstoque(2);
            leite.vender(1);
            leite.setPreco(7.99);
            System.out.println("O Estoque atual de " + leite.getNome() + " é: "+leite.getEstoque());
            System.out.println("O Total de Cadastrados é: "+ leite.getTotalCadastrados());


        }

        //⚠️ Um metodo static não enxerga atributos de instância — ele não sabe de qual objeto você fala. Tentar usar nome
        // dentro de um metodo static dá non-static variable nome cannot be referenced from a static context. É exatamente o mesmo motivo pelo qual você não chama calcularMedia() direto do main.
        //
        //Usos legítimos de static: contadores, constantes (Math.PI), e utilitários sem estado (Math.max, Integer.parseInt). Fora isso, desconfie: static demais é sinal de código que ainda pensa em procedimentos, não em objetos


    }
