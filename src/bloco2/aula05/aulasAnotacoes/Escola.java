package bloco2.aula05.aulasAnotacoes;

public class Escola {
    public static void main(String[] args) {
        Aluno ana = new Aluno("Ana","10012");
        ana.notas[0] = 8.0;
        ana.notas[1] = 7.0;
        ana.notas[2] = 1.0;

        Aluno joao = new Aluno("Joao","10011");
        joao.notas[0] = 8.0;
        joao.notas[1] = 8.0;
        joao.notas[2] = 7.0;

        ana.imprimirBoletim();
        joao.imprimirBoletim();

}}