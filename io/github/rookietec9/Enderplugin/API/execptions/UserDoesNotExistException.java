package io.github.rookietec9.EnderPlugin.API.execptions;

public class UserDoesNotExistException extends Exception {
    private static final long serialVersionUID = 1L;

    public UserDoesNotExistException(String name) {
        this.getCause();
    }
}