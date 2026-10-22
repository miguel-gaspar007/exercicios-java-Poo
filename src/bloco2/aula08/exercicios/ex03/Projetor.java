package bloco2.aula08.exercicios.ex03;
import java.util.ArrayList;
import java.util.List;
//Emprestavel.java, Livro.java, Projetor.java, Almoxarifado.java — implemente a interface da aula em duas classes sem
//parentesco e escreva um metodo static void emprestarTodos (Emprestavel[] itens, String responsavel)
//que funciona com qualquer uma;
public class Projetor implements Emprestavel{
    protected String modelo;
    protected boolean disponivel = true;
    protected String comQuem;
    private List<String> historicoSalas = new ArrayList<>();
    protected String sala;

   public Projetor(String modelo, String sala){
       this.modelo = modelo;
       this.sala = sala;
   }
   public String getModelo(){
       return modelo;
   }
   public String getSala(){return this.sala;}



    public void emprestarSala(String responsavel, String sala){
        if(!disponivel){
            System.out.println("Já emprestado.");return;
        } else{this.comQuem = responsavel;
        this.disponivel = false;
        this.historicoSalas.add(sala);
        System.out.println("Emprestado para: "+ responsavel+ " Na sala: "+sala);
    }}
    @Override
    public void emprestar(String responsavel){
       emprestarSala(responsavel,sala);
    }
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
