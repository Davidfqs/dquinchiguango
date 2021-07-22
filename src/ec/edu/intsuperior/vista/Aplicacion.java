/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Clase1;

/**
 *
 * @author David
 */
public class Aplicacion {
    public static void main(String [] args){
        Clase1.dormir();                    //método de clase de salida   
        System.out.println(Clase1.suma());  //método de clase de retorno 
        Clase1 obj = new Clase1();          // método de instancia de salida
        obj.salir();                        // método de instancia de salida        
        System.out.println(obj.comparar()); //método de instancia de retorno
    }
    
}
