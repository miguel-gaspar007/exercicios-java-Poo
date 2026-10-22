package bloco2.aula08.anotacoesEstudos;

public class Projetor implements Emprestavel{
    private String modelo;
    private boolean disponivel = true;
    private String comQuem;

    public Projetor(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){return modelo;}

    @Override
    public void emprestar(String responsavel){
        if (!disponivel){
            System.out.println("Projetor " + modelo + " já está emprestado para " + comQuem);
            return;
        }this.disponivel = false;
        this.comQuem = responsavel;
        System.out.println("Projetor " + modelo + "emprestado para "+ responsavel );
    }
    @Override
    public void devolver() {
        this.disponivel = true;
        this.comQuem = null;
        System.out.println("Item: "+modelo+"devolvido com sucesso!");
    }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }
}
