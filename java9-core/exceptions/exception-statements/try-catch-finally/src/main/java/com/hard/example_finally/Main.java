package com.hard.example_finally;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();

        try {
            reader.read();
        } catch (NotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("exception in catch: NotFoundException");
        } catch (NotReadingException e) {
            e.printStackTrace();
            throw new RuntimeException("exception in catch: NotReadingException");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * exceptions
 */

class NotFoundException extends IOException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}

class NotReadingException extends IOException {
    public NotReadingException() {
    }

    public NotReadingException(String message) {
        super(message);
    }
}

/**
 * class
 */

class Reader {
    public void read() throws NotFoundException, NotReadingException {
        System.out.println("reading");

        switch (2) {
            case 1:
                throw new NotFoundException("entity isn't found");
            case 2:
                throw new NotReadingException("entity isn't reading");
        }
    }

    public void close() throws IOException {
        System.out.println("closing");
    }
}
