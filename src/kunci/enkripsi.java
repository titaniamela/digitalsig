/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

import javax.crypto.KeyGenerator;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import static kunci.Frame3.txtmessage;
/**
 *
 * @author Shania
 */
public class enkripsi {
    public void main(String[] args, byte[] privateKeyBase64) throws Exception {
    /*KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
    keyPairGenerator.initialize(1024);
    KeyPair keyPair = keyPairGenerator.generateKeyPair();
    PrivateKey privateKey = keyPair.getPrivate();
    PublicKey publicKey = keyPair.getPublic();
    System.out.println("Private Key:");
    System.out.println(Arrays.toString(privateKey.getEncoded()));
    System.out.println(Base64.getEncoder().encodeToString(privateKey.getEncoded()));*/
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    byte[] decodeKey = Base64.getDecoder().decode(privateKeyBase64);
    PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(decodeKey));
    String data = txtmessage.getText();
    Cipher cipher = Cipher.getInstance("RSA");
    cipher.init(Cipher.ENCRYPT_MODE,privateKey);
    byte[] encryptedBytes = cipher.doFinal(data.getBytes());
    System.out.println(Base64.getEncoder().encodeToString(encryptedBytes));
    
}
}
