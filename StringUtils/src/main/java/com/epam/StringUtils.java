package com.epam;
import org.apache.commons.lang3.*;
public class StringUtils extends org.apache.commons.lang3.StringUtils {
    public static boolean isPositiveNumber(String str){
        int number;

        try{
            number = Integer.parseInt(str);
        }catch (NumberFormatException e){
            return false;
        }

        return number>0;
    }

    public static void main(String[] args) {
        System.out.println("Hello Epam");
    }
}

