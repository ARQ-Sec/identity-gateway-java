package com.arq.identitygatewayjava.security;
import java.util.Random;
public class ResetTokenService { public int issueCode() { return new Random().nextInt(100000); } }
