/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import static kunci.Frame3.txthasil;

/**
 *
 * @author Shania
 */
public class hash {
    public static void main (String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner (System.in);
        String input = txthasil.getText();      
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(input.getBytes());
        
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest){
            sb.append(String.format("%02x", b & 0xff));
        }
        System.out.println(sb.toString());
    }

    void main() {
    
    Frame fr = new Frame();
       fr.setVisible(true);
    
    Frame3 fr3 = new Frame3();
       fr3.setVisible(true);}
}


