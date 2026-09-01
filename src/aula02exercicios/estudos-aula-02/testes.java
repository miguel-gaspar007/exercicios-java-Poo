public class testes {
    static void main(String[] args) {
        if (args.length >0){
        System.out.print("Parametro fora do arquivo: " + args[0]); // --> java testes.java [paramêtro externo -> args[0]
    } else {
            System.out.print("Sem parâmetro.");

        }


    }
}
