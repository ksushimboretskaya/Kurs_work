package com.kursowaya.kurs_work.exception;

public class DataBaseForeignKeyException extends Exception {
    private static final long serialVersionUID = 1L;

    public DataBaseForeignKeyException(String message) {
        super(message);
    }

    public DataBaseForeignKeyException() {
        super();
    }
}