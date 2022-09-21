/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js04javaoperator;

/**
 *
 * 21343018_Anita Nursi
 */
public class TugasJob4GreatesValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 5;
        int max;
        
        System.out.println("Number 1 = " + a);
        System.out.println("Number 2 = " + b);
        System.out.println("Number 3 = " + c);
        
        //Mencari nilai tertinggi menggunakan operator kondisi
        max = (a >= b) ? a : b;
        max = (c >= max) ? c : max;
        System.out.println("Nilai tertingginya adalah angka = " + max);
    }
}
