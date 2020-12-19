package com.thowo.bmd;

import com.thowo.jmjavaframework.JMDate;

public class Global {
    public static final String localeCode="in_ID";
    private static int currentYear;
    private static JMDate currentDate;

    public static int getCurrentYear(){
        return currentYear;
    }
    public static void setCurrentYear(int year){
        Global.currentYear=year;
    }
    public static int getCurrentDate(){
        return currentYear;
    }
    public static void setCurrentDate(JMDate date){
        Global.currentDate=date;
    }
}
