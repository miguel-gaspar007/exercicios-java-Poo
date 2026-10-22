package bloco2.aula08.exercicios.ex04;

public abstract class DadosPag {
    protected String nomeCliente;
    protected String horarioPag =  null;

    public DadosPag(String nomeCliente, String horarioPag){
        this.nomeCliente = nomeCliente;
        this.horarioPag = horarioPag;
    }
    public DadosPag(String nomeCliente){
        this( nomeCliente, null);
    }
    public String getNome(){
        return this.nomeCliente;
    }
    public String getHorario(){
        return this.horarioPag;
    }
    @Override
    public String toString(){
        if(horarioPag == null){
            return String.format("Nome do cliente: %s || Horário do pagamento: Não registrado.",this.nomeCliente);
        }else{
        return String.format("Nome do cliente: %s || Horário do pagamento: %s",this.nomeCliente,this.horarioPag);
    }}
}
