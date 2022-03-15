/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 * Un programa donde el usuario "piensa" un numero del 1 al 100 y el ordenador
 * intenta adivinarlo.Es decir, el ordenador irá proponiendo numeros una y otra
 * vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor,
 * menor o igual al número que ha pensado).
 *
 * @author estrella
 */
public class NewClass {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int primero = 1, ultimo = 100, numero;
        boolean acertado = false;
        char respuesta;
        System.out.println("Piensa un numero entre 1 y 100");
        do{
            numero = (primero + ultimo) / 2;
            System.out.println("El numero " + numero + " es mayor, menor o igual? >/</=");
            respuesta = entrada.next().charAt(0);
            switch (respuesta) {
                case '=':
                    acertado = true;
                    System.out.println("gane");
                    break;
                case '>':
                    primero = numero + 1;
                    break;
                case '<':
                    ultimo = numero - 1;
                    break;
                default:
                    System.out.println("mal introducido >, < o =");
                    break;
            }
        }while (!acertado);

        if (!acertado) {
        }

    }
}
