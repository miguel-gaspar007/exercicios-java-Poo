//package bloco2.aula05.aulasAnotacoes;
//
//public class newReferenceNull {
////    4. new, referência e null
//   Aluno ana = new Aluno();
////    Essa linha faz três coisas: new Aluno() cria o objeto na memória, Aluno ana declara uma variável capaz de apontar
////    para um aluno, e o = guarda o endereço do objeto nela.
////
////    A variável não guarda o objeto — guarda uma referência a ele. E isso muda tudo:
////
//    Aluno a = new Aluno();
//    a.nome = "Ana";
//
//    Aluno b = a;              // NÃO copia o aluno: dá um segundo nome ao mesmo objeto
//   b.nome = "Beatriz";
//
////System.out.println(a.nome);
//
////    5. Construtores: nascer já pronto
////    Criar o objeto e preencher atributo por atributo é ruim por dois motivos: é verboso e permite objetos pela metade (um aluno sem nome). O construtor resolve os dois:
////
//    public class Aluno {
//        String nome;
//       String matricula;
//       double[] notas = new double[3];
////
////         CONSTRUTOR: mesmo nome da classe, SEM tipo de retorno (nem void!)
//        public Aluno(String nome, String matricula) {
//            this.nome = nome;               // this.nome = o atributo; nome = o parâmetro
//           this.matricula = matricula;
////        }
////
////        // ... métodos ...
////    }
////    Agora criar um aluno sem nome não compila:
////
//    Aluno ana = new Aluno("Ana", "1001");    // ✅
//    Aluno x = new Aluno();
//
//}
