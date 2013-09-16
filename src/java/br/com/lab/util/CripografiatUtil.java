/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lab.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Giovani
 */
public class CripografiatUtil {

    public static String encripta (String senha) { 
        try { 
            MessageDigest digest = MessageDigest.getInstance("SHA-256"); 
            digest.update(senha.getBytes()); 
            BASE64Encoder encoder = new BASE64Encoder (); 
            return encoder.encode (digest.digest()); 
        } catch (NoSuchAlgorithmException ns) { 
            ns.printStackTrace (); 
            return senha; 
        } 
    }
    
}
