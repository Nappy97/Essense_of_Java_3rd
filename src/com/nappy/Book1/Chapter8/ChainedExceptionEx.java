/*
package com.nappy.Book1.Chapter8;

class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (Space1Exception se) {
            InstallException ie = new InstallException("설치중예외발생");
            ie.initCause(se);
            throw ie;
        } catch (Memory1Exception me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCuase(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws Space1Exception, Memory1Exception {
        if (!enoughSpace()) {
            throw new Space1Exception("설치공간부족");
        }
        if (!enoughMemory()) {
            throw new Memory1Exception("메모리 부족");
        }
    }

    static void copyFiles() {
    }

    static void deleteTempFiles() {
    }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class Space1Exception extends Exception {
    Space1Exception(String msg) {
        super(msg);
    }
}

class Memory1Exception extends Exception {
    Memory1Exception(String msg) {
        super(msg);
    }
}*/
