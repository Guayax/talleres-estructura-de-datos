package Clase2;

import java.util.ArrayList;
import  java.util.List;

public class Metodos_fivonacci
{
    public List<Integer> resultados;
    public Metodos_fivonacci()
    {
        resultados = new ArrayList<>();
    }

    public void MetodoFivonacci1(int iteraciones) // Este metodo fue crado por mi para calcular Fivonacci
    {
        int F0 = 0;
        int F1 = 1;
        if(iteraciones == 1)
        {
            resultados.add(F0);
        }
        else if (iteraciones == 2)
        {
            resultados.add(F0);
            resultados.add(F1);
        }
        else if (iteraciones > 2)
        {
            resultados.add(F0);
            resultados.add(F1);
            for(int i = 0; i <= iteraciones-3; i++)
            {
                int temp = F0 + F1;
                F0 = F1;
                F1 = temp;
                resultados.add(F1);
            }
        }
        else
        {
            System.out.println("Entrada invalida");
        }
        System.out.print(resultados + "\n");
        resultados.clear();

    }

    public void MetodoFivonacci2(int iteraciones) // Este metodo fue sacado de internet y tambien calcula fivonacci
    {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = '\0';

        resultados.add(firstNumber);
        resultados.add(secondNumber);

        for (int i = 2; i < iteraciones; i++)
        {

            fibonacci = firstNumber + secondNumber;
            resultados.add(fibonacci);

            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
        System.out.println(resultados);
        resultados.clear();
}
}
