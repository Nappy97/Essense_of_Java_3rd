package com.nappy.Book1.Chapter9;

import java.util.StringJoiner;

class StringEx5 {
    public static void main(String[] args) throws Exception{
        String str = "가";

        byte[] bArr = str.getBytes("UTF-8");
        byte[] bArr2 = str.getBytes("CP943");

        System.out.println("UTF-8 : " + joinByteArr(bArr));
        System.out.println("CP943 : " + joinByteArr(bArr2));
        System.out.println("UTF-8 : " + new String(bArr, "UTF-8"));
        System.out.println("CP943 : " + new String(bArr2, "CP943"));

    }

    static String joinByteArr(byte[] bArr) {
        StringJoiner sj = new StringJoiner(":", "[", "]");

        for (byte b : bArr)
            sj.add(String.format("%02X", b));
        return sj.toString();
    }
}
