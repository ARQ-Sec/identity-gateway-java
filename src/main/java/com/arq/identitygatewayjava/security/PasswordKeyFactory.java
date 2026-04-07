package com.arq.identitygatewayjava.security;
import javax.crypto.SecretKeyFactory;
public class PasswordKeyFactory { public SecretKeyFactory factory() throws Exception { return SecretKeyFactory.getInstance("PBEWithMD5AndDES"); } }
