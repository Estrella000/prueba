package pruebas;

import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros P y Q, luego crea un array que
 * contenga todos los valores desde P hasta Q, y lo muestre por pantalla, si Q
 * fuera menor que P contendría todos los valores desde Q hasta P
 */
public class Arrays6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] lista;
        int P, Q;

//pida P y Q
        System.out.println("dame dos numeros");
        P = entrada.nextInt();
        Q = entrada.nextInt();
//crear lista
        if (P <= Q) {
            lista = new int[Q - P + 1];

            //rellena array
            for (int i = 0; i < lista.length; i++) {
                lista[i] = i + P;
            }
        } else {
            lista = new int[P - Q + 1];

            //rellena array
            for (int i = lista.length - 1; i >= 0; i--) {
                lista[i] = P - i;
            }
        }
        //mostrar arrays
        for (int i = 0; i < lista.length; i++) {
            System.out.println("elemento " + i + " = " + lista[i]);
        }
    }
}
