/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programas;

import java.util.Scanner;

/**
 *
 * @author EderJasciel
 */
public class CapturarUnNombre {
            

    
    public static void main (String[] args) {
        
    Scanner captura = new Scanner(System. in);
            
        String nombre;
        System.out.print ("Dame tu name");
        nombre=captura.nextLine();
        System.out.print ("Tu nomnre es >>"+ nombre);
        
    }
    
}

    

