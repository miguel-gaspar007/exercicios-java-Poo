package bloco2.aula08.anotacoesEstudos;

public abstract class Funcionario {

    //3. Classe abstrata: um molde que não vira objeto
    //Existe um problema no desenho atual: new Funcionario("Ana", "1", 3000) é possível — e o que essa pessoa faz na
    // empresa? Que salário ela tem? A superclasse existe só para ser herdada; ela é um conceito, não algo concreto.
        protected String nome;
        protected double salarioBase;

        public Funcionario(String nome, double salarioBase) {   // construtor existe (para o super)
            this.nome = nome;
            this.salarioBase = salarioBase;
        }

        // METODO ABSTRATO: sem corpo. "Toda subclasse é OBRIGADA a implementar."
        public abstract double calcularSalario();

        // Métodos concretos convivem normalmente com os abstratos
        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return String.format("%s: R$ %.2f", nome, calcularSalario());
        }

//new Funcionario("Ana", 3000);      // ❌ error: Funcionario is abstract; cannot be instantiated
//Funcionario f = new Gerente();  // ✅ a variável pode ser do tipo abstrato
//    Duas garantias valiosas de graça:
//
//    Ninguém cria um funcionário "genérico" sem cargo;
//    Se alguém criar Diretor extends Funcionario e esquecer o calcularSalario(), não compila. O contrato é cobrado pelo compilador.
//    Repare no toString() da superclasse chamando calcularSalario() — um metodo que ela nem sabe implementar. Funciona porque, na execução, quem responde é o objeto real. Isso é abstração: programar contra a ideia de funcionário.
}
