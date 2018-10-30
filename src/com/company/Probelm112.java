package com.company;
import java.util.Scanner;

public class Probelm112 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia = in.nextFloat(), velocidad_maxima=((in.nextFloat()*1000)/3600), tiempo=in.nextFloat();

        while (distancia != 0 || velocidad_maxima!=0 || tiempo!=0) {
            if (distancia<=0 || velocidad_maxima<=0 || tiempo<=0)System.out.println("ERROR");
            else if ((distancia/tiempo)<velocidad_maxima)System.out.println("OK");
            else if((distancia/tiempo)<(velocidad_maxima*1.2)) System.out.println("MULTA");
            else System.out.println("PUNTOS");
            distancia = in.nextFloat(); velocidad_maxima=((in.nextFloat()*1000)/3600); tiempo=in.nextFloat();
        }
    }

}
