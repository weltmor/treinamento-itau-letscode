package br.com.letscode.turmaitau;

import operacoes.Dividir;
import operacoes.Multiplicar;
import operacoes.Somar;
import operacoes.Subtrair;
import operacoes.Tabuada;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double a;
        double b;
        String voperacao;

        System.out.printf ("Informe qual operação deseja realizar : \n");
        System.out.printf ("1-somar; 2-subtrair ; 3-multiplicar; 4-dividir; t-tabuada \n");
        voperacao = ler.next();

        System.out.printf("Informe o primeiro número \n");
        a = ler.nextInt();

        System.out.printf("Informe o segundo número \n");
        b = ler.nextInt();

        // é possivel exibir a operação diretamente na syout..
        // %.2f significa formatar o campo
//        if (voperacao == 1) {
//            System.out.printf("Resultado: %.2f + %.2f = %.2f",a,b, (a+b));

        switch (voperacao) {
            case "1":
                new Somar().realizarOperacao(a,b);
                break;
            case "2":
                new Subtrair().realizarOperacao(a,b);
//                subtrair(a,b);
                break;
            case "3":
//                multiplicar(a,b);
                new Multiplicar().realizarOperacao(a,b);
                break;
            case "4":
                new Dividir().realizarOperacao(a,b);
//                dividir ((double)a,b);
                break;
            case "t":
                new Tabuada().realizarOperacao(a,b);
//                dividir ((double)a,b);
                break;
            case default:
                System.out.println("Operação invalida");
                break;
            }
    }}
/*        public void inputdados () {
            System.out.printf("Informe um valor \n");
            a = ler.nextInt();

            System.out.printf("Informe o segundo valor \n");
            b = ler.nextInt();
        }
*/
/*        static void soma (double var1,double var2) {
            double vresultado = var1 + var2;
            System.out.println("Resultado da Soma = " + vresultado);
        }
        static void subtrair (double var1,double var2) {
            double vresultado = var1 - var2;
            System.out.println("Resultado da Subtração = " + vresultado);
        }
        static void multiplicar (double var1,double var2) {
            double vresultado = var1 * var2;
            System.out.println("Resultado da Subtração = " + vresultado);
        }
        static void dividir (double var1,double var2) {
            double vresultado = var1 / var2;
            System.out.println("Resultado da Divisão = " + vresultado);
        }

 */
