/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

import java.math.BigInteger;
import javax.swing.JOptionPane;
/**
 *
 * @author Shania
 */
public class Kunci {
BigInteger pmath,qmath,nmath,zmath,Emath,dmath;

    public Kunci(String p, String q, String e) {
     pmath = new BigInteger(p); // pmath = new BigInteger("3");
     qmath = new BigInteger(q); // qmath = new BigInteger("11");
     Emath = new BigInteger(e); // Emath = new BigInteger("7");
    }

    public void check() {
        if(pmath.gcd(qmath).intValue()==1&&pmath.isProbablePrime(2)&&qmath.isProbablePrime(2)){
           nmath = pmath.multiply(qmath);
           zmath = pmath.subtract(BigInteger.ONE).multiply(qmath.subtract(BigInteger.ONE));
           dmath = Emath.modInverse(zmath);
           
       } 
      if(Emath.equals(dmath)){
              dmath = dmath.add(zmath);
              dmath = dmath.mod(nmath);
               /*System.out.println(dmath);*/
           }
        /*System.out.println(nmath+"   "+zmath+"   "+Emath+"   "+dmath);*/
        }

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frame2 fr2 = new Frame2();
       fr2.setVisible(true);
       
       Frame fr = new Frame();
       fr.setVisible(true);
    }
}