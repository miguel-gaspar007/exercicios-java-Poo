package bloco2Real.aula07.exercicios.ex02;

// Ordem.java — coloque um System.out.println no construtor de cada classe da hierarquia (avó, mãe/filha, neta, três níveis)
// e crie um objeto da filha/neta. Anote num comentário a ordem impressa e explique por quê;
public class neta extends filha{
    public neta(){
        super();
        System.out.println(" 3- Construtor Neta");
    }
}
