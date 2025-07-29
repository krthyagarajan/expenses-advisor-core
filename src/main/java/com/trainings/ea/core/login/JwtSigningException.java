package com.trainings.ea.core.login;

public class JwtSigningException extends RuntimeException {
    public JwtSigningException(String message) {
        super(message);
    }
}
