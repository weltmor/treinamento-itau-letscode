package br.com.letscode.turmaitau.exercicio26out;

import java.util.Scanner;

public class SequenciaLetras {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String inputLetras;
        String maiorseq ="";

        inputLetras = new String();

        System.out.printf("Informe a sequencia de letras \n");
        inputLetras = input.next();

            String seq = "";

                for (int i =0;i<inputLetras.length();i++){
                    seq = extracted(inputLetras.charAt(i), inputLetras.substring(i+1));
                    if (seq.length() > maiorseq.length()){
                        maiorseq = seq;
                    }}
        System.out.printf(maiorseq);
        }

        private static String extracted(char c, String s){
            if (s.isEmpty() || c >s.charAt(0)){
                return c+"";
            }
            return c+ extracted(s.charAt(0),s.substring(1));
        }
    }

