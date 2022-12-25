package com.epam;

import com.epam.StringUtils;

public class Utils extends StringUtils{

    public static boolean isAllPositiveNumbers(String... str){
        for(String string:str){
            int number;
            try {
                number = Integer.parseInt(string);
            } catch (NumberFormatException e) {
                return false;
            }
            if(number<1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}