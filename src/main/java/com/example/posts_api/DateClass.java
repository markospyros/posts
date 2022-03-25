package com.example.posts_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    static String setDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        String formatDate = formatter.format(date);

        return formatDate;
    }
}
