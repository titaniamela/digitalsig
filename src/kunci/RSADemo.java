/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kunci;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;

/**
 *
 * @author Shania
 */
public class RSADemo {
     public static void main(String[] args) throws Exception {
        // Generate RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(512, new SecureRandom());
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get private and public key
        PrivateKey privateKey = keyPair.getPrivate();
        PublicKey publicKey = keyPair.getPublic();

        // Encrypt message using public key
        String message = "Hello, world!";
        byte[] messageBytes = message.getBytes(StandardCharsets.UTF_8);
        Signature rsa = Signature.getInstance("SHA256withRSA");
        rsa.initSign(privateKey);
        rsa.update(messageBytes);
        byte[] signatureBytes = rsa.sign();

        // Decrypt message using private key
        Signature rsaVerify = Signature.getInstance("SHA256withRSA");
        rsaVerify.initVerify(publicKey);
        rsaVerify.update(messageBytes);
        boolean isSignatureValid = rsaVerify.verify(signatureBytes);

        // Print the results
        System.out.println("Original message: " + message);
        System.out.println("Signature (hex): " + bytesToHex(signatureBytes));
        System.out.println("Is signature valid? " + isSignatureValid);
    }

    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_ARRAY[v >>> 4];
            hexChars[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}