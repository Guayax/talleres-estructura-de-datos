package Clase2;

import java.util.Scanner;

public class Main_Clase2 {


    public static  void main(String arg[])
    {
        long inicio;
        long fin;
        long tiempo_1;
        long tiempo_2;
        Metodos_fivonacci metodos = new Metodos_fivonacci();



        inicio = System.nanoTime();
        metodos.MetodoFivonacci1(10);
        fin =System.nanoTime();
        tiempo_1 =fin-inicio;

        inicio = System.nanoTime();
        metodos.MetodoFivonacci2(10);
        fin = System.nanoTime();
        tiempo_2 = fin-inicio;

        System.out.print("tiempo metodo 1: "+ Long.toString(tiempo_1)+ " nanosegundos " + "\n") ;
        System.out.print("tiempo metodo 1: "+ Long.toString(tiempo_2)+ " nanosegundos");




    }


}
