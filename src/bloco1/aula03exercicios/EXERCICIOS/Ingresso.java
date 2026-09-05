package bloco1.aula03exercicios.EXERCICIOS;
import java.util.Scanner;
// leia idade, se é estudante (s/n) e o dia da semana; calcule o preço a partir de final double INTEIRA = 40.0: meia
// para menores de 18, idosos e estudantes; terça-feira tem 20% de desconto adicional sobre o valor já calculado.
// Imprima com printf e uma linha explicando quais descontos foram aplicados.
public class Ingresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //declara scanner
        //variaveis e constante
        final double INTEIRA = 40.0;
        double preco = INTEIRA;
        double descontoMeia = 0;
        boolean estuda = false;
        String estudaSN = "";
        int diaDaSemana = 0;

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        while(true) {
            System.out.print("Você é estudante: (S/N): ");
            estudaSN = scanner.nextLine();
            if(estudaSN.equalsIgnoreCase("S")){
                 estuda = true;
                 estudaSN = "O aluno estuda!";
                 break;
            }else if(estudaSN.equalsIgnoreCase("n")){
                estuda = false;

                break;
            }else if (!estudaSN.equalsIgnoreCase("S") || !estudaSN.equalsIgnoreCase("N")){
                System.out.println("Resposta inválida! Digite S ou N !!");
                continue;
            }
        }
        while(true) {
            System.out.print("\n1->SEGUNDA\n2->TERÇA\n3->QUARTA\n4->QUINTA\n5->SEXTA\n6->SABADO\n7->DOMINGO\nA sessão será agendada para qual dia da semana(1-7): ");
            diaDaSemana = scanner.nextInt();
            if(diaDaSemana >=1 && diaDaSemana<8){
                break;
            }else{
                System.out.println("Digite o número correspondente ao dia desejado(1-7)");
                continue;
            }
        }

        if(idade<18 || idade >59 || estuda == true){
            preco = (INTEIRA/2);
            descontoMeia = ((preco-INTEIRA)*(-1));
            System.out.printf("\n\nVocê paga meia: %.2f (estudantes, menores de idade e idosos)",preco);
        } else if((idade>=18 && idade <59) && estuda == false){
            System.out.printf("\n\nVocê paga inteira: %.2f", INTEIRA);
        } else if((idade>=18 && idade <59) && estuda == false && diaDaSemana == 2){
            System.out.printf("Você pagará Inteira de %.2f menos descontos (dias específicos da semana) ",INTEIRA);
        }

        double preco1 = preco;
        double descontoTerca = 0;
        //double descontoMeia = ();
        if(diaDaSemana == 2){
            preco = (preco*0.8);
            descontoTerca = (preco1 - preco);
        }


        System.out.printf("\nDesconto meia entrada: %.2f\nDesconto Dia da Semana: %.2f\nValor Final: %.2f",descontoMeia,descontoTerca,preco);



    // leia idade, se é estudante (s/n) e o dia da semana; calcule o preço a partir de final double INTEIRA = 40.0: meia
    // para menores de 18, idosos e estudantes; terça-feira tem 20% de desconto adicional sobre o valor já calculado.
    // Imprima com printf e uma linha explicando quais descontos foram aplicados.




    }
}
