/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import Clase.Codificador;
import java.util.Scanner;

/**
 *
 * @author jeant
 */
public class Descodificador {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static String descodificador(String codigo, int llave){
        String resultado = "";
        
        for(int i = 0; i < codigo.length(); i++){
            int descodificar;
            descodificar = (int)codigo.charAt(i);
            descodificar -= llave;
            char caracter = (char)descodificar;
            resultado += caracter;
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.nextLine();
        System.out.println("Ingrese un numero: ");
        int llave = teclado.nextInt();
        String codigo = Codificador.codificar(palabra, llave);
        System.out.println("El codigo es: " + codigo);
        
        String resultado = descodificador(codigo, llave);
        System.out.println("La descodificacion es: " + resultado);
    }
}
