/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js05inputdarikeyboard;

import java.util.Scanner;

/**
 *
 * @author Febi
 */
public class KataTerakhirScanner {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter word 1: ");
    String word1 = in.nextLine();
    
    System.out.print("Enter word 2: ");
    String word2 = in.nextLine();
    
    System.out.print("Enter word 3: ");
    String word3 = in.nextLine();
    
    System.out.println(word1 + " " + word2 + " " + word3);
    }
}
