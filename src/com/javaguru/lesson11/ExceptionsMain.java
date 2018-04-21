package com.javaguru.lesson11;

class ExceptionsMain {

    public static void main(String[] args) {
        try {
//            throwRuntimeException();
            throwException();
            System.out.println("Hello world");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINALLY");
        }
    }

    static void throwException() throws Exception {
        throw new Exception("Oops! Something going wrong...");
    }

    static void throwRuntimeException() {
        throw new RuntimeException("Hello, I'm RuntimeException");
    }
}
