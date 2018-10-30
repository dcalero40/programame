package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem127 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<String> nombres_list = new ArrayList<String>();

        int casos = in.nextInt();
        in.nextLine();
        for(int i=0; i<casos; i++){


            String nombre = in.nextLine();

            String[] todo = nombre.split(" ");

            int j=0;

            while (!todo[j].equals("F")){
                nombres_list.add(todo[j]);
                j++;
            }

            int camas=Integer.parseInt(todo[todo.length-2]);

            int palabras=Integer.parseInt(todo[todo.length-1]);


            if (camas>=nombres_list.size()) System.out.print("TODOS TIENEN CAMA");

            else if (camas == 0) System.out.print("NADIE TIENE CAMA");

            else tiene_cama(camas, palabras, nombres_list);
            System.out.println();
            nombres_list.clear();
        }

    }

    public static void tiene_cama (int camas, int palabras, ArrayList<String> nombres_list){

        int turnos=palabras;

        while ((nombres_list.size())>camas) {

            if (turnos >(nombres_list.size())) {

                while (turnos > (nombres_list.size())) {

                    turnos = turnos - (nombres_list.size());

                }

            }

            nombres_list.remove((turnos-1));
            turnos = (turnos) + (palabras-1);
        }

        for(int i=0;i<nombres_list.size();i++){
            if (i==0)System.out.print(nombres_list.get(i));
            else System.out.print(" "+nombres_list.get(i));
        }

    }
}
