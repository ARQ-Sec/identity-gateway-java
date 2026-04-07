package com.arq.identitygatewayjava.security;
import javax.crypto.Cipher;
public class TokenCipherService { public Cipher cipher() throws Exception { return Cipher.getInstance("AES/ECB/PKCS5Padding"); } }
