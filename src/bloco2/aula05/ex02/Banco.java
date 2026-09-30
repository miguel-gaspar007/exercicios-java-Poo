package ex02;

public class Banco {
    public static void main(String[] args){
        ContaBancaria claudinho = new ContaBancaria("claudinho", 1111);
        claudinho.depositar();
        claudinho.sacar();
        claudinho.exibirFicha();
    }
}
