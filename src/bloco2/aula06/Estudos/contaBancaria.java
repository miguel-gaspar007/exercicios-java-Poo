package aula06.Estudos;

public class contaBancaria {
    private String titular;
    private float saldo;
    private String numero;

    public contaBancaria(String titular, String numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public float getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }


        }