package br.com.letscode.turmaitau;

public class TIposPrimitivosInteiros {

    //variaveis de classe morrem na propria classe
    //variavel de classe: int (tipo) static (varivel de classe) Nome
    // variavel estatica a vantagem é que posso utiliza-la em varias partes do código
    //Clicar com Control e clicar com mouse na variavel ele mostra onde ela foi declarada

    // variavel constante
    final static String Resultado = "Resultado";

    public static void main(String[] args) {
        short b = 1;
        int numeroInt = 5;
        long numeroLong = 5;

        // Soma +
        // subtração -
        // divisão /
        // multiplicação *

       int soma = numeroInt + 10;
       System.out.println("soma = " + soma);

       //divisao de numento long com inteiro
       int divisao = (int) (numeroInt / numeroInt);
       System.out.println("Resultado da Divisão =" + divisao);

       //chamar um método passando os valores de uma variável
       somar (10,20);

    }
    // método que recebe duas variaveis e devolve um valor
    // metodo com dois argumentos
    // assinatura do metodo é receber o somar dois numeros inteiros

    static void somar (int var1, int var2){
        int soma = var1 + var2;
        System.out.println("Resultado da soma = " + soma );

    }

}
