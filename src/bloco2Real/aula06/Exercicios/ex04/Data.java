package bloco2Real.aula06.Exercicios.ex04;
//Data.java — três construtores sobrecarregados: Data(int dia, int mes, int ano), Data(int dia, int mes) (ano atual,
// 2026) e Data() (01/01/2026). Use this(...) para que os dois primeiros deleguem ao completo, e valide mês de 1 a 12;
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        setMes(mes);
        this.ano = ano;
    }
    public Data(int dia, int mes){
        this(dia,mes,2026);
    }
    public Data(){
        this(01,01,2026);
    }
    public void setMes(int mes){
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else {System.out.println("O mês digitado é inválido.");
        return;}
    }


    @Override
    public String toString(){
        return String.format("Data escolhida: %d/%d/%d",dia,mes,ano);
    }
    public static void main(String[] args) {
        Data nova = new Data();
        System.out.println(nova);

    }





}
