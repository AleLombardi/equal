/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.equal;

import java.util.Scanner;

/**
 *
 * @author posta
 */
public class startApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pw = new Scanner(System.in);
        System.out.println("Inserisci la password");
        String pw1 = pw.nextLine();
        System.out.println("Inseriscila di nuovo");
        String pw2 = pw.nextLine();
        if (pw1.equals(pw2)) {
            System.out.println("Password inserita correttamente");
        }
        else {
            System.out.println("Le password inserite sono diverse");
        }
    }

    
}
