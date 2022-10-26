package br.com.letscode.turmaitau.exercicio26out;

import java.util.Scanner;

public class SolucaoMaiorSequencia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputLetras;
        String letras;
        String mletras ="";


            System.out.printf("Informe a sequencia de letras \n");
            inputLetras = input.next();

        int i = 0;

        while (i < inputLetras.length()){
            letras = inputLetras.substring(i);

            if (letras.length() > mletras.length()) {
                mletras = letras;
            }
            if ( inputLetras.substring(i) <= inputLetras.substring(i)+1){
                 letras = inputLetras[i + 1];}

            if (letras > mletras) {
                mletras = letras;}
            else if (letras = ""){
                i += 1;}

            i++;
            System.out.printf(mletras);

        }

    }
}
