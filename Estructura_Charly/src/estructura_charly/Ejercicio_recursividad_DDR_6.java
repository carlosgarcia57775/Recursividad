/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_charly;

/**
 *
 * @author carlo
 */
//Se crea una clase y un metodo main 
public class Ejercicio_recursividad_DDR_6 {
public static void main(String[] args) {
//Serie fibonacci
// 1 1 2 3 5 8 13 21 34 55
//llamada inicial
//Creando diferentes variables para despues invocar 
int posicion = 5;
int resultado = fibonacciRecursivo(posicion);
System.out.println(resultado);
}
public static int fibonacciRecursivo(int n) {
//Si es cero devuelve un cero
//Puedes poner n<=0 tamvien para incluir negativos
if (n == 0) {
return 0;
//Si es 1 devuelve un 1
} else if (n == 1) {
return 1;
} else {
//Hago la respectiva suma
return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
}
}