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
public class Ejercicio_recursividad_DDR_9 {
public static void main(String[] args) {
//Se crean las variables
int base = 10;
int exponente = -2;
//Se invocan los argumentos establecidos
System.out.println(potencia(base, exponente));
}
//Se crea una variable de doble potencia
public static double potencia(int base, int exponente) {
//Se crea la condicion 
if (exponente == 0) { //caso base
return 1; //10^0 = 1
} else if (exponente == 1) { //caso base
return base; //10^1 = 10
} else if (exponente < 0) { //Exponente negativo
return potencia(base, exponente + 1) / base;
} else { //Exponente positivo
return base * potencia(base, exponente - 1);
}
}
}