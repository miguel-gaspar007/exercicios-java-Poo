package bloco1.aula04exercicios.anotacoes;

public class anotacoes1 {
    public static void main(String[] args) {
        //FOR E FOR LOOP

//        for (int i =1; i<=10; i++){
//            System.out.printf("7 x %d = %d %n", i, 7*i  ); // TABUADA DO 7
//        }

//        for (int i=0; i<=10; i++){
//            if (i%2 !=0) continue; //contando até 8 de 2 em 2
//            if(i>8)break;
//            System.out.println(i);
//        }

// ----------------------------------------------------------------------------//

        // ARRAYS, Muitos valores, um nome.
        //Declarar 30 variáveis para 30 notas é insustentável, o array guarda diversos valores do mesmo tipo,com tamanho fixo.
        double[] notas = new double[4]; //Declarei 4 posições todas com valor 0.00
        notas[0] = 8.5;
        notas[1] = 10.0;
        notas[2]= 8.0;
        notas[3]=5.67;
        //array strings

        String[] nomes = {"Ana", "Bruno", "Carla"};
        System.out.println(notas[0]);
        System.out.print("\n");
        System.out.println(notas.length);

        //⚠️ Array de tamanho 4 tem índices 0, 1, 2 e 3. O último índice é sempre length - 1 — por isso a condição do
        // for usa < e não <=.


        //percorrendo
        for(int i=0;i<notas.length;i++){
            System.out.printf("Nota %d: %.2f\n ",i +1,notas[i]);
        }
        double soma = 0 ;
        for(double nota: notas){
            soma +=nota;
        }
        System.out.printf("Média: %.2f%n", soma / notas.length);









    }
}
