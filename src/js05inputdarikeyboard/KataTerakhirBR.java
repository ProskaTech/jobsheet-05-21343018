/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js05inputdarikeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class KataTerakhirBR {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        String word1 = "", word2 = "", word3 = "";
        try {
            System.out.print("Enter word 1: ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2: ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3: ");
            word3 = dataIn.readLine();
        }
    
    
    catch (IOException e ){
        System.out.println("Gagal membaca keyboard");
        }
    
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
