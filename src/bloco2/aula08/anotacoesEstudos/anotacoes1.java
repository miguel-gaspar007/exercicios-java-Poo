package bloco2.aula08.anotacoesEstudos;

public class anotacoes1 {
//No desafio da Aula 07, você escreveu isto:
//
//Funcionario[] folha = { new Gerente(...), new Vendedor(...), new Estagiario(...) };
//
//for (Funcionario f : folha) {
//    System.out.println(f.getNome() + ": " + f.calcularSalario());
//}
//Repare no que aconteceu: um único laço, uma única chamada calcularSalario(), e três cálculos completamente diferentes executados. Nenhum if perguntando "que tipo é esse?".
//
//Polimorfismo (do grego, "muitas formas") é exatamente isso: a mesma chamada produz o comportamento certo para cada objeto. Compare com a alternativa sem POO:
//
// 😖 Sem polimorfismo: um if para cada tipo, em TODO lugar que usa funcionário
//if (tipo.equals("gerente")) {
//    salario = base * 1.2 + AUXILIO;
//} else if (tipo.equals("vendedor")) {
//    salario = base + vendas * 0.05;
//
//
//
// } else if (tipo.equals("estagiario")) {
//    salario = bolsa;
//}
//Nesta versão, adicionar um cargo novo significa caçar todos os if espalhados pelo sistema. Na versão polimórfica, significa criar uma classe nova — e nada do código existente muda.
}






















