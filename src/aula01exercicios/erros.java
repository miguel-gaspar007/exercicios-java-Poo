package aula01exercicios;

public class erros {
    static void main() { // psvm tab
        System.out.println("Miguel Gaspar"); //java: cannot find symbol --- symbol:   method printn(java.lang.String)-- location: variable out of type java.io.PrintStream -->erro de sintaxe no metódo System.out.println
        System.out.println("19 anos");
        System.out.println("Faculdade Anhanguera");
        System.out.println("ADS 2026/2\n"); //java: ')' or ',' expected  ("ADS 2026/2\n""") --> 3 aspas duplas com uma seu seu par  geram erro ao compilar
        Ficha1();
    }

    static void Ficha1() {
        System.out.println("Miguel Gaspar\n19 anos\nFaculdade Anhanguera\nADS 2026/2");
    }
  //}<-- chave extra aqui, gera o erro:  java: class, interface, enum, or record expected
}


