/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

import java.math.BigInteger;
import java.util.Arrays;

/**
 *
 * @author Shania
 */
/*public class enkripsi {
    
    public static void main (String[] args){
        enkripsi Enkrip = new enkripsi ();
            String M = Frame3.txtmessage.getText();          
            BigInteger n = Frame.kcn.nmath;
            
            BigInteger m = new BigInteger(M.getBytes());
        if (m.compareTo(n) == 1) throw new IllegalArgumentException("message too long - increase bitLength or split the message");

        // He then computes the ciphertext c corresponding to: {@code c = m^e mod n}
        byte[] c = m.modPow(Frame.kcn.Emath, Frame.kcn.nmath).toByteArray();
        System.out.println("c   = " + Arrays.toString(c));
    }
}*/
public class enkripsi {
BigInteger pmath,qmath,nmath,zmath,Emath,dmath;

    public enkripsi(String p, String q, String e) {
     pmath = new BigInteger(p); 
     qmath = new BigInteger(q);
     Emath = new BigInteger(e);
    }

   // enkripsi() {
     //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}

    public void check() {
        if(pmath.gcd(qmath).intValue()==1&&pmath.isProbablePrime(2)&&qmath.isProbablePrime(2)){
           nmath = pmath.multiply(qmath);
           zmath = pmath.subtract(BigInteger.ONE).multiply(qmath.subtract(BigInteger.ONE));
           dmath = Emath.modInverse(zmath);
           
       } 
      if(Emath.equals(dmath)){
              dmath = dmath.add(zmath);
              dmath = dmath.mod(nmath);
           }
      String M = Frame3.txtmessage.getText();
      //  String M = "Hello world";
            BigInteger m = new BigInteger(M.getBytes());
        /*if (m.compareTo(nmath) == 1) throw new IllegalArgumentException("message too long - increase bitLength or split the message");
*/
        // He then computes the ciphertext c corresponding to: {@code c = m^e mod n}
        byte[] c = m.modPow(Emath, nmath).toByteArray();
       Frame4.txtFinal.setText(Arrays.toString(c));
        //System.out.println("c   = " + Arrays.toString(c));
        }

public static void main(String[] args) {
       Frame4 fr4 = new Frame4();
       fr4.setVisible(true);
       
       Frame3 fr3 = new Frame3();
       fr3.setVisible(true);
    }
}