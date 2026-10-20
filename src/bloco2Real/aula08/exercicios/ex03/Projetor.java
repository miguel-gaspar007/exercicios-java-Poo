package bloco2Real.aula08.exercicios.ex03;
//Emprestavel.java, Livro.java, Projetor.java, Almoxarifado.java — implemente a interface da aula em duas classes sem
//parentesco e escreva um metodo static void emprestarTodos (Emprestavel[] itens, String responsavel)
//que funciona com qualquer uma;
public class Projetor implements Emprestavel{
    protected String modelo;
    protected boolean disponivel = true;
    private String sala;
    protected String comQuem;

   public Projetor(String modelo){
       this.modelo = modelo;
   }
   public String getModelo(){
       return modelo;
   }


    @Override
    public void emprestar(String responsavel){
        if(!disponivel){
            System.out.println("Já emprestado.");
        } else{this.comQuem = responsavel;
        this.disponivel = false;
        System.out.println("Emprestado para: "+ responsavel+ "Na sala: "+sala);
    }}
    @Override
    public void devolver(){
        if(!disponivel){
            this.comQuem = null;
            System.out.println("Projetor devolvido com sucesso.");
            disponivel = true;} else if (this.disponivel){System.out.println("Projetor disponível no sistema.");}
        else{System.out.println("ERRO, TENTE NOVAMENTE.");}
    }
    @Override
    public boolean estaDisponivel (){
        return disponivel;
    }

    @Override
    public String toString(){
       return String.format("Modelo do projetor: %s",this.getModelo());
    }


}
