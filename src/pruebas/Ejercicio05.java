package pruebas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author madrid
 * programa que lea 10 números no nulos y luego muestre un
 * mensaje de si ha leído algún número negativo o no.
 */

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        int cont, num;
        boolean negativo;   // Variable para controlar si hay algún negativo
        final int maximo = 10;  // Constante con la cantidad de números a introducir
        
       
       /* OPCIÓN 2: CON WHILE LEYENDO TODOS LOS NÚMEROS */
        negativo = false;
        // Bucle while inicializando el contador a 1 hasta el máximo (10)
        cont = 1;
        while (cont <= maximo)
        {
            System.out.println ("Introduce el número " + cont +" de " + maximo + ": ");
            num = entrada.nextInt();
            
            // Como el incrementador en el while se pone manualmente, 
            // en el caso de num = 0 no tendría que incrementar.
            // Por eso, solo se consideran los casos num < 0 y num > 0.
            // En cualquiera de esos dos casos, se tiene que incrementar el contador
            // y si es num < 0, tiene que poner que hay alguno negativo.
            if (num < 0)
            {
                negativo = true;
                cont++;
            }
            else if (num > 0)
            {
                cont++;
            }
        }
        
        if (!negativo) {
            System.out.print("No ");
        }
        System.out.println ("se han introducido números negativos");
        

       /* OPCIÓN 3: CON WHILE LEYENDO HASTA NEGATIVO */
        negativo = false;
        // Bucle while inicializando el contador a 1 hasta que 
        // lea algún número negativo o llegue al máximo (10)
        cont = 1;
        while ( (cont <= maximo) && (!negativo) )
        {
            System.out.println ("Introduce el número " + cont +" de " + maximo + ": ");
            num = entrada.nextInt();
            
             // Como el incrementador en el while se pone manualmente, 
            // en el caso de num = 0 no tendría que incrementar.
            // Por eso, solo se consideran los casos num < 0 y num > 0.
            // En cualquiera de esos dos casos, se tiene que incrementar el contador
            // y si es num < 0, tiene que poner que hay alguno negativo.
            if (num < 0)
            {
                negativo = true;
                cont++; // Se podría eliminar esta instrucción porque ya no va a seguir en el bucle
            }
            else if (num > 0)
            {
                cont++;
            }
        }
        
        if (!negativo) {
            System.out.print("No ");
        }
        System.out.println ("se han introducido números negativos");
    }
    
}