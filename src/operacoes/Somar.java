package operacoes;

public class Somar {

// variaveis, não pode colocar o comando souf aqui, só no construtor
        public Somar(){
            System.out.println("Construtor da classe");
        }

        public void realizarOperacao(double var1, double var2) {
            System.out.printf("Resultado %.2f + %.2f = %.2f", var1, var2,(var1 + var2));
        }
}
