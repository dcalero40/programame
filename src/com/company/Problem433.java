package com.company;
import java.util.Scanner;

public class Problem433 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //igualamos numero de uvas al introducido.
        int num_uvas = in.nextInt();
        while (num_uvas != 0) {
            //descartamos casos que no cumpla 1<=n<=1.000.000
            if (num_uvas <= 1000000 || num_uvas<=1) calcular_niveles(num_uvas);
            else System.out.println("NUMERO DE UVAS NO VALIDO");
            num_uvas = in.nextInt();
        }
    }

    public static void calcular_niveles(int num_uvas) {
        //creamos contador que será el resultado.
        int nivel = 1;
        while(num_uvas > nivel){
            num_uvas = num_uvas-nivel;
            nivel++;
        }
        System.out.println(nivel);
    }
}
