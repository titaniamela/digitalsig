/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

/*import java.security.*;
import javax.crypto.*;*/
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
    void main() throws NoSuchAlgorithmException {
        //TODO code application logic here
        //get input, example compute digest of string in txthasil
      /*byte [] input = txthasil.getText().getBytes();
        
        //get a message digest object using SHA256 Algorithm
        MessageDigest SHA256 = MessageDigest.getInstance("SHA-256");
        
        //compute digest
        SHA256.update(input);
        byte [] digest = SHA256.digest();
        
        //convert byte digest to hex format
        StringBuffer hexDigest = new StringBuffer();
        for (int i=0 ;i<digest.length; i++)
            hexDigest.append(Integer.toString((digest[i]&0xff)+0x100,16).substring(1));
        
        //print out digest
        System.out.print(hexDigest);
    }
    /*void main() throws NoSuchAlgorithmException {
        Scanner in = new Scanner (System.in);
        String input = txthasil.getText();   
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(input.getBytes());
        
        byte[] digest = md.digest();
        StringBuffer sb = new StringBuffer();
        for (byte b : digest){
            sb.append(String.format("%02x", b & 0xff));
        }
        System.out.println(sb.toString());*/
    }
}