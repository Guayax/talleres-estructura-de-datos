package Clase1;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos_Lista {
    ArrayList<String> Personas;
    public Metodos_Lista()
    {
        Personas = new ArrayList<>();
        Personas.add("miguel");
        Personas.add("simon");
        Personas.add("maria");
        Personas.add("samuela");
        Personas.add("pepe");
    }

    public void Agregar()
    {
        Scanner Respuesta = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String pPersona = Respuesta.nextLine();
        Personas.add(pPersona);
        Respuesta.close();

    }

    public void Eliminar()
    {
        boolean eliminado = false;
        Scanner Respuesta = new Scanner(System.in);
        System.out.println("Ingrese nombre a eliminar");
        String pPersona = Respuesta.nextLine();
        for(int i = 0; i <= Personas.size();i++)
        {
            if(pPersona.equals(Personas.get(i)) && !Personas.isEmpty())
            {
                Personas.remove(i);
                System.out.println("se a elminado la persona de la lista");
                eliminado = true;
                break;

            }
            if(eliminado == false){
                System.out.println("No se encontro la persona en la lista");
            }

        }
        Respuesta.close();
    }
    public void Listar()
    {
        for(int i = 0; i <= Personas.size();i++)
        {
            System.out.println(Personas.get(i));
        }
    }
    public void Buscar()
    {
        System.out.println("Introduzca la persona a buscar: ");
        Scanner Respuesta = new Scanner(System.in);

    }

    public void loop()
    {   boolean finalizado = false;
        while(finalizado == false)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("1)agregar.");
            System.out.println("2)eliminar.");
            System.out.println("3)listar.");
            System.out.println("4)buscar.");
            System.out.println("0)salir.");
            int seleccion = input.nextInt();

            switch(seleccion)
            {
                case 1:
                    Agregar();
                    input.close();
                    break;
                case  2:
                    Eliminar();
                    input.close();
                    break;
                case 3:
                    Listar();
                    input.close();
                    break;
                case 4:
                    Buscar();
                    input.close();
                    break;
                case 0:
                    System.out.println("Fin");
                    input.close();
                    finalizado = true;
            }
        }
    }

}
