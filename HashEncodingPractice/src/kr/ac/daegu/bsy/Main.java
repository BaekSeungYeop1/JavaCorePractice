package kr.ac.daegu.bsy;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashCrypto Practice");

        // 회원가입할 때 비밀번호 저장
        String password = "dddd";
        String salt = String.valueOf(UUID.randomUUID()); // 무작위 문자열 : 회원가입 할 때 생성되어 DB의 SALT 컬럼에 INSERT
        String saltPassword = password + salt;
        String encodedPassword = "";

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(saltPassword.getBytes(StandardCharsets.UTF_8));
            encodedPassword = String.format("%040x", new BigInteger(1,digest.digest()));
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        System.out.println("passwod = " + password);
        System.out.println("salt = " + salt);
        System.out.println("saltPaswword = " + saltPassword);
        System.out.println("encodedPassword = " + encodedPassword);
    }
}
