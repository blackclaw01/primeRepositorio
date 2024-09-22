/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unidad1.ejercicio7;

/**
 *
 * @author orden
 *7. Programa que asigna los valores sin pedirlos por pantalla a una variable a el valor 
23 y a otra variable b el valor 56. Intercambiar el valor de dichas variables y mostrar 
por pantalla el valor que tenían antes y después del intercambio. 
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        int a=23;
        int b= 56;
         
        System.out.println("antes a = "+ a);
        System.out.println("antes b = "+ b);
        System.out.println("después a = " + (a=b));
        System.out.println("después b = " + (b=a));
       
    }
}
