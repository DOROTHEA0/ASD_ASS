/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd.model.dao;

import java.security.Key;
import javax.crypto.Cipher;

/**
 *
 * @author komei
 */
public class StrEncrypt {
    private static String encryptKey = "yarimasune114514@#$";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;
    
    public StrEncrypt() throws Exception{
        Key key = getKey(encryptKey.getBytes());
        encryptCipher = Cipher.getInstance("DES");
        encryptCipher.init(Cipher.ENCRYPT_MODE, key);
        decryptCipher = Cipher.getInstance("DES");
        decryptCipher.init(Cipher.DECRYPT_MODE, key);
    }
    
    private Key getKey(byte[] byteArr) throws Exception{
        byte[] byteArrT = new byte[8];
        for (int i = 0; i < byteArr.length && i < byteArrT.length; i++) 
            byteArrT[i] = byteArr[i];
        return new javax.crypto.spec.SecretKeySpec(byteArrT, "DES");
    }
    
    public static String bytrArrtoHexStr(byte[] byteArr){
        StringBuffer sb = new StringBuffer(byteArr.length * 2);
        for (int i = 0; i < byteArr.length; i++) {
            int tempInt = byteArr[i];
            while (tempInt < 0) tempInt += 256;
            if (tempInt < 16) sb.append("0");
            sb.append(Integer.toString(tempInt, 16));
        }
        return sb.toString();
    }
    
    public static byte[] hexStrtoByteArr(String str){
        byte[] byteArr = str.getBytes();
        byte[] output = new byte[byteArr.length / 2];
        for (int i = 0; i < byteArr.length; i += 2) {
            String tempStr = new String(byteArr, i, 2);
            output[i / 2] = (byte)Integer.parseInt(tempStr, 16);
        }
        return output;
    }
    
    public byte[] byteEncrypt(byte[] byteArr) throws Exception{
        return encryptCipher.doFinal(byteArr);
    }
    
    public byte[] byteDecrypt(byte [] byteArr) throws Exception{
        return decryptCipher.doFinal(byteArr);
    }
    
    public String encrypt(String str) throws Exception{
        return bytrArrtoHexStr(byteEncrypt(str.getBytes()));
    }
    
    public String decrypt(String str) throws Exception{
        return new String(byteDecrypt(hexStrtoByteArr(str)));
    }
}
