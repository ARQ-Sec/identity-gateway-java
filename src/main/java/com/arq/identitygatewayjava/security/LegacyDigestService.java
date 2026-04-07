package com.arq.identitygatewayjava.security;
import java.security.MessageDigest;
public class LegacyDigestService { public byte[] md5(byte[] value) throws Exception { return MessageDigest.getInstance("MD5").digest(value); } public byte[] sha1(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-1").digest(value); } }
