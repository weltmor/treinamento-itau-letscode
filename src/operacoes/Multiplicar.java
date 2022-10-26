package operacoes;

/*
   >>>>>>>>>> tipos de modificadores de acessos para classes
    default: dentro do pacote
    public: em qualquer parte


   >>>>>>>>>> tipos de modificadores de acessos para métodos
    default: dentro do pacote
    private: dentro da propria classe
    public: em qualquer parte
    protected: apenas funciona com herança
 */

public class Multiplicar {
    public void realizarOperacao(double var1, double var2) {
        System.out.printf("Resultado %.2f * %.2f = %.2f %s", var1, var2,(var1 * var2),"!\n");
    }
}
