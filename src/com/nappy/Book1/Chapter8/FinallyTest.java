package com.nappy.Book1.Chapter8;

class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFIles();
            deleteTempFiles();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFiles();
        }
    }

    static void startInstall() {
    }

    static void copyFIles() {
    }

    static void deleteTempFiles() {
    }
}
