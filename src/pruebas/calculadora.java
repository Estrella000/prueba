/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *Una calculadora sencilla como ejemplo para Junit
 * @author estrella
 */
public class calculadora {
    //implementa dos operaciones sencillas, la suma y la resta
    
    public static int Sumar(int a, int b){
        return a+b;
    }
    public static int Restar(int a, int b){
        return a-b;
    }
    public static void main(String args[])
    {
        int num1=3, num2=5;
        System.out.println(Sumar(num1,num2));
        System.out.println(Restar(num1,num2));
        
        
    }
}
