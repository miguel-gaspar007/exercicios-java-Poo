package aula06.Estudos;

public class lerConta {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria("Jeferson", "1011101");

        System.out.println(conta.getSaldo());
       conta.setTitular("Claudião");

        // Convenção universal do Java: getNomeDoAtributo() para ler, setNomeDoAtributo(valor) para escrever,
        // e isAlgumaCoisa() para getters de boolean (isDisponivel()).
        //💡 Gere, não digite. No IntelliJ, Alt + Insert → Getter and Setter escreve todos de uma vez.
        //⚠️ Encapsulamento não é "criar getter e setter para tudo". Se todo atributo tem os dois, você só trocou
        // conta.saldo = 1000 por conta.setSaldo(1000) — mesma bagunça, mais linhas. Pergunte sempre: quem, de fora, tem o direito de mudar isto? No caso do saldo: ninguém — ele só muda por depósito ou saque. Logo, getSaldo() sim, setSaldo() não.
    }
}
