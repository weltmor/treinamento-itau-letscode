package br.com.letscode.turmaitau.exercicio24out;

import java.util.Scanner;

public class ListaPreco {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int a;
        String  nome1;
        Double  preco1;
        String[] nome;
        Double[] preco;


        System.out.printf ("Informe a quantidade de produtos que deseja cadastrar : \n");
        a = ler.nextInt();

        nome = new String[a];
        preco = new Double[a];

        for (int i=0;i<a;i++)
        {
            System.out.printf("Informe o nome do produto : \n");
            nome1 = ler.next();
            System.out.printf("Informe o preço do produto:  \n");
            preco1 = ler.nextDouble();

            nome[i] = nome1;
            preco[i] = preco1;
        }

        int index;

        index = 0;

        for (int i= 0;i < a;i++)
        {
            if (preco[i] <= preco[index]) {
                index = i;
            }
        }
        System.out.printf("Produto mais barato: " + nome[index] + "\n");

        index = 0;
        for (int i=0;i < a;i++)
        {
            if (preco[i] >= preco[index]) {
            index = i;
        }
        }
        System.out.printf("Produto mais caro: "+ nome[index] +"\n");

    }}
