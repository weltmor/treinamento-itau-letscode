package operacoes;

public class Tabuada {
    public void realizarOperacao(double multiplicando, double multiplicador) {

// comando de instranciar uma classe, vantagem é reduzo a criação de acessos de instanciar e chamo o metodo direto no programa
        Multiplicar multiplicar = new Multiplicar();

        for (int i=0;i<=multiplicador;i++){
              multiplicar.realizarOperacao(multiplicando,i);
//            new Multiplicar().realizarOperacao(multiplicando,i);
//            System.out.printf("Resultado: %.2f + %.2f = %.2f %s", multiplicando,i,(multiplicando*i));
        }
    }

}
