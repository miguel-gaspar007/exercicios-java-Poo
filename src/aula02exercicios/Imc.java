package aula02exercicios;
import java.util.Scanner;
public class Imc {
    // leia nome, peso e altura do teclado; calcule o IMC (peso / (altura * altura)) e imprima assim: Maria, seu IMC é
    // 21,45. Use nextLine() depois do último número lido e explique num comentário por que ele foi necessário.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bem vindo ao sistema de cálculo de IMC.\nDigite seu peso: ");
        String peso = scanner.next();
        peso = peso.replace("," ,".");
        double pesoF = Double.parseDouble(peso);
        System.out.print("\nDigite sua altura: ");
        String altura = scanner.next();
        altura = altura.replace("," ,".");
        double alturaF = Double.parseDouble(altura);
        scanner.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();// -->se mandar o nextline direto dps do .next ou até mesmo .nextInt
        // ele vai ler o \n da linha do scan anterior e pular a leitura do nome.
        //para resolvermos isso adicionamos um scan no vazio (ou no \n solto)
        double IMC = (pesoF /(alturaF* alturaF));


        System.out.printf("\n Olá, %s.\nSeu IMC é: %.2f.",nome,IMC);




    }
}
