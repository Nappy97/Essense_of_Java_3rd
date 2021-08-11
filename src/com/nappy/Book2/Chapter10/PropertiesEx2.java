/*
package com.nappy.Book2.Chapter10;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.*;

class PropertiesEx2 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("USAGE : java PropertiesEx2 INPUTFILENAME");
            System.exit(0);
        }

        Properties prop = new Properties();

        String inputFile = args[0];

        try{
            prop.load(new FileInputStream(inputFile));
        } catch (IOException e) {
            System.out.println("지정된파일을 찾을수 없습니다");
            System.exit(0);
        }

        String na,e = prop.getProperty("name");
        String[] data = prop.getProperty("data").split(",");
        int max = 0, min = 0;
        int sum = 0;

        for(int i = 0 ; i< data.length;i++){
            int intValue = Integer.parseInt(data[i]);

            if(i==0)max = min = intValue;

            if(max<intValue)
                max = intValue;
            else if (min>intValue)
                min = intValue;
            sum+= intValue;
        }
        System.out.println("name = " + name);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
    }
}
*/
