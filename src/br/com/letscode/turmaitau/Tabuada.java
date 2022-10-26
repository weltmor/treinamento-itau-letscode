package br.com.letscode.turmaitau;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a;

        System.out.printf("Informe o nº de 1 a 09 da taboada deseja exibir : \n");
        a = ler.nextInt();

        tabuada(a);
    }
        static void tabuada (int var1){
            int vresultado;
            for (int i=1; i <=10;i++) {
                vresultado = var1 * i;
                System.out.println(var1 + "x"+ i +"="+ vresultado);


            }
        }
        }

