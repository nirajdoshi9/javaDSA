package Basics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to World of Java");
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");

        System.out.println("* * * *\n* * *\n* *\n*");

        Date d = new Date();
        String ora = format1(d);
        if(ora.length() == 3){
            ora = "0".concat(ora);
        }
        System.out.println(ora);
    }

    public static String format1(Date d){
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm", Locale.ITALY);
        sdf.setLenient(false);
        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Rome"));
        return sdf.format(d);
    }
}
