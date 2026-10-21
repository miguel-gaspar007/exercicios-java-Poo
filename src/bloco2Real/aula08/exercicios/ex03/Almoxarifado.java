package bloco2Real.aula08.exercicios.ex03;



//Emprestavel.java, Livro.java, Projetor.java, Almoxarifado.java — implemente a interface da aula em duas classes
// sem parentesco e escreva um metodo static void emprestarTodos(Emprestavel[] itens, String responsavel) que funciona
// com qualquer uma;
public class Almoxarifado {
    static void emprestarTodos(Emprestavel[] itens,String responsavel){
        for (int i=0; i<itens.length;i++){
            Emprestavel item = itens[i];
            if(item instanceof Livro){
                Livro livro = (Livro) item;
            System.out.println("PROCESSANDO EMPRÉSTIMO DO LIVRO "+livro.getTitulo()+ " para " +responsavel);

            }else if(item instanceof Projetor){
                Projetor projetor = (Projetor) item;
                System.out.println("PROCESSANDO EMPRÉSTIMO DO PROJETOR MODELO: "+projetor.getModelo());
            }item.emprestar(responsavel);}
}

    public static void main(String[] args) {
        Emprestavel[] itemArray = {
                new Livro("CASEBRE","Dom Casmurro"),
                new Projetor("XDC-9000","11111")
        };
        emprestarTodos(itemArray,"Miguel");

    }

}
