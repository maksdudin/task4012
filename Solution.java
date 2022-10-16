package com.javarush.task.task40.task4012;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/* 
Полезные методы DateTime API
*/

public class Solution {
    public static void main(String[] args) {
       
    }

    public static boolean isLeap(LocalDate date) {
    //return date.lengthOfYear()==366;
      return date.isLeapYear();  
    }

    /*public  static boolean isLeap(String year){
        Year year1 = Year.parse(year, DateTimeFormatter.ofPattern("y"));
        return year1.isLeap();
    }*/

    public static boolean isBefore(LocalDateTime dateTime) {
        return dateTime.isBefore(LocalDateTime.now());
    }

    public static LocalTime addTime(LocalTime time, int n, ChronoUnit chronoUnit) {
        return time.plus(n,chronoUnit);
    }

    public static Period getPeriodBetween(LocalDate firstDate, LocalDate secondDate) {
        if(firstDate.isBefore(secondDate)){
            return firstDate.until(secondDate);
        }else{return secondDate.until(firstDate); }
        
    }

    /*public static Period getPeriodBetween(LocalDate firstDate, LocalDate secondDate) {
        if (firstDate.isBefore(secondDate)) {
            return Period.between(firstDate, secondDate);
        } else {
            return Period.between(secondDate, firstDate);
        }

    }*/
}
