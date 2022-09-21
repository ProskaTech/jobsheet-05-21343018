/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js05inputdarikeyboard;

import javax.swing.JOptionPane;

/**
 *
 * Created by 21343018_Anita Nursi
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        String name = "", hoby = "";
        
        name = JOptionPane.showInputDialog("Nama anda: ");
        hoby = JOptionPane.showInputDialog("Hobi anda: ");
        
        String msg = "Jadi hobi anda " + hoby + ". " 
                + "Hobi yang bagus " + name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi hobi anda " + hoby + ". Hobi yang bagus " +name);
    }
}
