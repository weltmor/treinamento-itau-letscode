package br.com.letscode.turmaitau.exercicio24out;

import operacoes.*;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double vcotacao;
        double voperacao;

        System.out.printf ("Informe o valor em dolar : \n");
        voperacao = ler.nextDouble();

        System.out.printf("Informe a cotação do colar: \n");
        vcotacao = ler.nextDouble();
        System.out.printf("Valor total convertido em reais : %.2f * %.2f = %.2f %s", voperacao, vcotacao,(voperacao * vcotacao),"!\n");

        }
    }
