package bloco1.aula03exercicios.EXERCICIOS;
import java.util.Scanner;

//FaixaEtaria.java
// — leia a idade do teclado e classifique: criança (0–12), adolescente (13–17), adulto (18–59), idoso (60+).
// Valide idade negativa;

public class FaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu genêro(MASCULINO/FEMININO): ");
        String genero = scanner.next();
        if(genero.equalsIgnoreCase("Masculino") ) {
            if (idade >= 0 && idade <= 12) {
                System.out.println("Você é uma criança.");
            } else if (idade >= 13 && idade <= 17) {
                System.out.println("Você é um adolescente");
            }else if (idade >= 18 && idade <= 59) {
                System.out.println("Você é um adulto");
            }else if (idade >= 60 && idade < 100) {
                System.out.println("O senhor já está idoso xD ! KKKKK");
            }else if (idade >=100) {
                System.out.println("O senhor já está idoso xD ! KKKKK");
            }else if (idade < 0){
                System.out.println("Valor negativo inválido!");
            } else {
                System.out.println("Valor inválido.");
            }
        }

        if(genero.equalsIgnoreCase("Feminino") ) {
            if (idade >= 0 && idade <= 12) {
                System.out.println("Você é uma criança.");
            } else if (idade >= 13 && idade <= 17) {
                System.out.println("Você é uma adolescente");
            }else if (idade >= 18 && idade <= 59) {
                System.out.println("Você é uma adulta");
            }else if (idade >= 60 && idade < 100) {
                System.out.println("Senhora, você é idosa! KKKKK");
            }else if (idade >= 100 ) {
                System.out.println("Senhora, você é IMORTAL! KKKKK");
            }else if (idade < 0){
                System.out.println("Valor negativo inválido!");
            } else {
                System.out.println("Valor inválido.");
            }
        }
    }
}
