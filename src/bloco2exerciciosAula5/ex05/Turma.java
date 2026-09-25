
package ex05;
public class Turma {
    public static void main(String[] args) {
        Aluno cleber = new Aluno("Miguel", 10, 5, 6);
        Aluno jessica = new Aluno("Jéssica",7,7,7);
        Aluno roberto = new Aluno("Roberto",7,7,7);
        Aluno[] alunos = {cleber,jessica,roberto};
        for(Aluno apelido:alunos){
            apelido.calcularMedia();
            apelido.exibirBoletim();}}}
//12 linhas esse e o outro umas 25. Desse jeito é muito mais facil por nao ter q lidar com aquelas matrizes doidas e
// varias localizações diferentes para manter os arrays paralelos.