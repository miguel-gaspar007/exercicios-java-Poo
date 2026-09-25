package ex02;


//Referencia.java — crie um objeto ContaBancaria, atribua a uma segunda variável, deposite pela segunda variável e
// imprima o saldo pela primeira. Explique num comentário o resultado. Depois provoque um NullPointerException de
// propósito e copie a mensagem;
public class Referencia {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Jéssica", 11111);
        ContaBancaria conta2 = conta1;
        ContaBancaria conta3 = null;
        conta2.depositar();
        conta2.sacar();
        conta1.exibirSaldo();
// O motivo do deposito em conta2 ser exibido na conta1 é por que "conta2 = conta1" apenas guarda o pointer da variavel conta2 no mesmo objeto da conta1.
 //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ex02.ContaBancaria.exibirSaldo()" because "<local3>" is null
        //        at ex02.Referencia.main(Referencia.java:14) (contaBancaria conta3 = null)
    }
}
