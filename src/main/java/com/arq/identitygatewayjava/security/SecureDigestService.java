package com.arq.identitygatewayjava.security;
import java.security.MessageDigest;
public class SecureDigestService { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-256").digest(value); } }
