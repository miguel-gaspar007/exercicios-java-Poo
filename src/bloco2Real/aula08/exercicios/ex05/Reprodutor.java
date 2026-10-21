package bloco2Real.aula08.exercicios.ex05;
import java.util.ArrayList;
import java.util.List;
// Reprodutor.java — modele um player de mídia: classe abstrata Midia (título, duração, reproduzir() abstrato),
//        com Musica, Podcast e Video; a interface Baixavel (baixar(), getTamanhoMb()) é implementada só por Musica e Video.
//        Uma "playlist" (Midia[])
//reproduz tudo em sequência e, num segundo laço, baixa apenas o que for baixável — use instanceof com pattern matching
//aqui e explique num comentário por que, neste caso, ele se justifica.
public class Reprodutor {
    public static void main(String[] args) {
        ArrayList<Midia> midias =  new ArrayList<>();
        midias.add(new Musica("Funk 2.0 mais tocadas","2:34",22.00, "MC Henrique de Ferraz", "Melhores Funks 2026"));
        midias.add(new Podcast("Flow Fabio Akita","2:34","Igor"));
        midias.add(new Video("Mulher caindo da escada","2:34","Memes Loucos",100000,12.00));

        System.out.println("---------------------LAÇO 1 DO EXERCICIO------------------");
        for (Midia m : midias){
            m.reproduzir();
        }

        System.out.println("---------------------LAÇO 2 DO EXERCICIO------------------");

        for(Midia m: midias){
            if(m instanceof Video video){
                video.baixar();
            }else if(m instanceof Musica musica){
                musica.baixar();
            }
        }
        // O uso do instanceof (com Pattern Matching) se justifica aqui porque a playlist é uma
// coleção genérica de 'Midia' (onde nem tudo é 'Baixavel', como o Podcast).
// Como o metodo 'baixar()' pertence à interface 'Baixavel' e NÃO à classe base 'Midia',
// precisamos checar em tempo de execução quais objetos assinam essa interface/contrato
// e fazer o casting seguro para acessar seus métodos específicos.

    }


































}
