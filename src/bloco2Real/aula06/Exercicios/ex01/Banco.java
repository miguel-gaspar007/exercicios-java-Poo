    package bloco2Real.aula06.Exercicios.ex01;


    public class Banco {
        public static void main(String[] args) {
            ContaBancaria sergio = new ContaBancaria("Sergio",10111203,99.00);
            sergio.sacar(99.00);
            sergio.depositar(22.00);
            System.out.println(sergio);
            sergio.exibirFicha();
        }
    }

    //PS C:\Users\Miguel Suporte TI\IdeaProjects\Projeto01_\src\aula06\Exercicios\ex01> java Banco.java
    //Banco.java:10: error: saldo has private access in ContaBancaria
    //            sergio.saldo = 29;
    //                  ^
    //1 error
    //error: compilation failed
