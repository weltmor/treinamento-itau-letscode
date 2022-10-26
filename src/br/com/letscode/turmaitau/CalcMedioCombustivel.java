package br.com.letscode.turmaitau;

import java.util.Scanner;

public class CalcMedioCombustivel {

    public static void main(String[] args) {
        double tempogasto;
        double velmedia;
        double distancia;
        double litros;

        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o tempo gasto na viagem:");
        tempogasto = ler.nextDouble();
        System.out.printf("Informe sua velocidade média:");
        velmedia = ler.nextDouble();

        distancia = tempogasto * velmedia;
        litros = distancia / 12;

        System.out.println("Velocidade média:" + velmedia);
        System.out.println("Tempo percorrido:" + tempogasto);
        System.out.println("Distância percorrida:" + distancia +"KM");
        System.out.println("Litros consumidos:" + litros);

    }
}
