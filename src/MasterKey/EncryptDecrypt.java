/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterKey;

/**
 *
 * @author Shaun
 */
public class EncryptDecrypt {

    public String getEncryption(String enteredPassword) {
        String characters = "!#$%&'()*+,-./0123456789:;<=>?@";
        String alphabets = "BaNeLeHeNdRicKsHaUnMlAmLeLi";
        char firstKey = enteredPassword.charAt(0);
        char lastKey = enteredPassword.charAt(enteredPassword.length() - 1);

        char key = characters.charAt((int) (Math.random() * characters.length()));
        char key1 = characters.charAt((int) (Math.random() * characters.length()));
        char key2 = characters.charAt((int) (Math.random() * characters.length()));
        char key3 = characters.charAt((int) (Math.random() * characters.length()));
        char midKey = alphabets.charAt((int) (Math.random() * alphabets.length()));
        char midKey1 = alphabets.charAt((int) (Math.random() * alphabets.length()));
        char midKey2 = alphabets.charAt((int) (Math.random() * alphabets.length()));

        String encryptedPassword = "" + key + key1 + lastKey + enteredPassword.substring(1, (enteredPassword.length() - 1)) + firstKey + key2 + key3;
        String combine = "" + encryptedPassword.substring(0, 5) + midKey + midKey1 + midKey2;
        String fullPassword = "" + combine + encryptedPassword.substring(combine.length() - 3, encryptedPassword.length());
        String reverseLastFiveChars = fullPassword.substring(fullPassword.length() - 7, fullPassword.length());
        fullPassword = "" + reverseLastFiveChars + fullPassword.substring(0, fullPassword.length() - 7);
        encryptedPassword = fullPassword;
        return encryptedPassword;
    }

    public String getDecryption(String strPassword) {
        String decryptedPassword;
        String reverseFirstFiveChars = strPassword.substring(0, 7);
        String password = strPassword.substring(7, strPassword.length());
        String combine = password + reverseFirstFiveChars;
        String xtractPassword = combine.substring(2, strPassword.length() - 2);
        char xtrctFirstKey = xtractPassword.charAt(0);
        char xtrctLastKey = xtractPassword.charAt(xtractPassword.length() - 1);

        decryptedPassword = "" + xtrctLastKey + xtractPassword.substring(1, (xtractPassword.length() - 1)) + xtrctFirstKey;
        String fullPassword = decryptedPassword.substring(0, 3) + decryptedPassword.substring(6, decryptedPassword.length());
        decryptedPassword = fullPassword;
        return decryptedPassword;
    }
}
