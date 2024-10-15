package com.pluralsight.formatdates;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;


public class Dates {
    public static void main(String[]args){


                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                dtf.setTimeZone(TimeZone. getTimeZone( "GMT" ));
                System.out.println(dtf.format(now));
            }
        }


