package com.xp.wx.util;

import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    static final String AES = "AES";
    static final String AES_TRANSFORMATION = "AES/CBC/PKCS5Padding";

    public static String encrypt(String str, String str2) {
        try {
            Cipher instance = Cipher.getInstance(AES_TRANSFORMATION);
            instance.init(1, new SecretKeySpec(str2.getBytes(), AES), new IvParameterSpec(new byte[16]));
            return Base64.encodeToString(instance.doFinal(str.getBytes()), 0).replaceAll("[\\s*\t\n\r]", "");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
            return "";
        } catch (InvalidAlgorithmParameterException e3) {
            e3.printStackTrace();
            return "";
        } catch (NoSuchPaddingException e4) {
            e4.printStackTrace();
            return "";
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return "";
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return "";
        }
    }

    public static String decrypt(String str, String str2) {
        try {
            Cipher instance = Cipher.getInstance(AES_TRANSFORMATION);
            instance.init(2, new SecretKeySpec(str2.getBytes(), AES), new IvParameterSpec(new byte[16]));
            return new String(instance.doFinal(Base64.decode(str, 0)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return "";
        } catch (InvalidAlgorithmParameterException e3) {
            e3.printStackTrace();
            return "";
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return "";
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return "";
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return "";
        }
    }
}
