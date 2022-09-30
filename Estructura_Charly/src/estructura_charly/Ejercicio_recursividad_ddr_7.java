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
public class Ejercicio_recursividad_ddr_7 {
public static void main(String[] args) {
//Se crea una variable 
int a = 254; //400 + 50 + 2
//Se invoca el argumento
System.out.println(invertirNum(a, 2));
}
//Se crea una variable con los parametros establecidos
public static int invertirNum(int num, int pos){
//Si es menor que 10 devuelvo el numero (el ultimo numero)
if(num < 10){
return num;
}else{
//modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo
return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
}
}
}