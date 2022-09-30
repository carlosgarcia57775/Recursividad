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
public class Ejercicio_recursividad_DDR_8 {
public static void main(String[] args) {
//Un valor cadena con el argumento establecido
String palabra = "Hola";
//Invocamos el metodo con lo declarado
System.out.println(invertirPalabra(palabra, palabra.length()-1));
}
//Se crea una cadena estatica con los parametros establecidos
public static String invertirPalabra(String palabra, int longitud){
//Se crea la condicion si longitud es igual a 0
if(longitud==0){
//Retornamos el valor 
return palabra.charAt(longitud)+"";
//De lo contrario
}else{
return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
}
}
}