package com.example.android.audacity.utilities;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helpers {
    public static String formatDate(String date) {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        Date myDate = null;
        try {
            myDate = fmt.parse(date);
            SimpleDateFormat fmtOut = new SimpleDateFormat("dd-MM-yyyy");
            return fmtOut.format(myDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }
}
