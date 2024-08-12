package Clase1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_clase1 {

    public static void main(String args[]){
        ArrayList<String> Tareas = new ArrayList<>();
        boolean finalizado = false;

        while(finalizado == false)
        {
            Scanner input = new Scanner(System.in);

            System.out.println("1)agregar.");
            System.out.println("2)remover.");
            System.out.println("3)listar.");
            System.out.println("0)salir.");
            int Seleccion = input.nextInt();

            if(Seleccion == 1)
            {

                System.out.println("Ingrese la tarea a añadir: ");
                input.nextLine();
                String tarea_Temp = input.nextLine();
                Tareas.add(tarea_Temp);
            }
            else if (Seleccion == 2)
            {
                boolean eliminado = false;
                System.out.println("Ingrese la tarea a remover: ");
                input.nextLine();
                String tarea_Temp = input.next();
                for(int i = 0; i < Tareas.size() && Tareas.isEmpty() != true;i++)
                {
                    if(Tareas.get(i).equals(tarea_Temp))
                    {
                      Tareas.remove(i);
                      eliminado = true;
                      System.out.println("se a eliminado " + tarea_Temp);

                    }
                }
                if (eliminado == false)
                {
                    System.out.println("No se encontro la tarea a eliminar en la lista.");
                }
            }
            else if(Seleccion == 3)
            {
                System.out.println(Tareas);
            }
            else if (Seleccion == 0)
            {
                finalizado = true;
                input.close();
                System.out.println("Fin.");
            }
            else
            {
                System.out.println("Respuesta invalida.");
            }

        }




    }


}
