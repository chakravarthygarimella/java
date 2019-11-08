package com.springboot.rest.service;

public class TestAes {

    public static void main(String[] args) {
        final String key = "hellojava";
        String originalText = "poconus123";
        String encryptedText = AES.encrypt(originalText, key);
        System.out.println("Encrypted text: " + encryptedText);
        System.out.println("Decrypted Text: " + AES.decrypt(encryptedText, key));
    }

}
