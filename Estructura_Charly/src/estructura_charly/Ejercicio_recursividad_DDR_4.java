/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura_charly;

/**
 *
 * @author carlo
 */
//Se empieza creando una clase y despues de ello un metodo main
public class Ejercicio_recursividad_DDR_4 {
public static void main(String[] args) {
/** el array se le indica que sera de tipo entero y posterior a ello se crean mas 
variables*/
int[] array={1,2,3,4,5};
int elementoBuscar=3;
int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
//Se imprime la variable 
System.out.println(posElementoEncontrado);
}
//Se crea una variable estatica que almacene lo que es mas variables
public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
//Se crea la condicional con lo establecido 
if(indice==array.length || array[indice]==elementoBuscar){
if(indice==array.length){
//Retornamos el valor -1
return -1;
//De lo contrario retorna el indice
}else{
return indice;
}
}else{
 // Retorna las variables
return posicionElementoRecursivo(array, elementoBuscar, indice+1);
}
}
}