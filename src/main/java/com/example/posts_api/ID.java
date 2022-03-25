package com.example.posts_api;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ID {
    static String generateLetters(){
        String[] arrayOfLetters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String generatedIDLetters = "";
        int iterator = 0;

        for (int i = 0; i < arrayOfLetters.length; i++) {
            i = (int)(Math.random()*arrayOfLetters.length)+0;
            generatedIDLetters += arrayOfLetters[i];

            if (generatedIDLetters.length() == 4) {
                break;
            } else if (i == arrayOfLetters.length-1){
                 i--;
            }
        }

        return generatedIDLetters;
    }
    static String createID(){
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
        Date date = new Date();
        String formatID = formatter.format(date);
        formatID += generateLetters();

        return formatID;
    }
}
