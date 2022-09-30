/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_charly;

/**
 *
 * @author carlo
 */
/**Se empieza creando una clase donde posteriormente
dentro de ella esta un metodo main string*/
public class Ejercicio_recursividad_DDR_10 {
public static void main(String[] args) {
//Se crea una variable de tipo entero llamada numero con 
//un valor de 123
int numero = 123;
/**Se imprime la varibe sumaDigitos donde dentro de ella
tiene la variable numero*/
System.out.println(sumaDigitos(numero));
}
/*La variable SumaDigitos tiene dentro de la misma 
una variable llamada numero*/
public static int sumaDigitos(int numero){
if(numero < 10){ //caso base
return numero; //devuelvo el numero
}else{
return (numero % 10) + sumaDigitos(numero/10); //Tomo el digito y llamo a la funcion
}
}
}


