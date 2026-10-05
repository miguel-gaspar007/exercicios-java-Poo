package bloco2Real.aula07.studys;

public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCidade(){
        return endereco.getCidade();
    }
    // Mais exemplos: Carro tem um Motor (não é um motor); Pedido tem vários Item; Aluno é uma Pessoa. Na dúvida entre
    // as duas, componha — é mais flexível e não amarra sua classe à evolução da outra.
    //
    //💡 Herança boa costuma ter 2 ou 3 níveis, no máximo. Hierarquias fundas viram labirinto: para entender
    // uma classe, você precisa abrir cinco arquivos.

}
