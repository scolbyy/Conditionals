package com.company;
import java.awt.Color;
public class Main {
    public static double totalWages (double hours, double rate){
        double wages;
        double overtime;
        wages = hours*rate;
        overtime = 40*rate + ((hours-40)*1.5*rate);
        if (hours >= 40){
            return overtime;
        }
        else{
            return wages;
        }
    }

    public static boolean isLeapYear(int year){
        if (year%4==0 && (year%100!=0 || year%400==0)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isLater(int month1, int day1, int year1, int month2, int day2, int year2){
        if(year1>=year2){
            if
            return true;
        }
    }


    public static void main(String[] args) {
        double wages = totalWages(45, 12.5);
        System.out.println("Wages for 45 hours at $12.50 " + wages);
        wages = totalWages(30, 10);
        System.out.println("Wages for 30 hours at $10.00 " + wages);

 //leap year
        System.out.println("2000 " + isLeapYear(2000));
        System.out.println("2004 " + isLeapYear(2004));
        System.out.println("2003 " + isLeapYear(2003));
        System.out.println("2100 " + isLeapYear(2100));


// is later
//        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
//        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
//        System.out.println("1/2/2010 is later than 3/2/2010 " + isLater(1,2,2010, 3,2,2010));
//        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
//        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
//        System.out.println("1/2/2010 is later than 1/3/2011 " + isLater(1,2,2010, 1,3,2010));
//        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));

// Best match
//        System.out.println("Best match 2 3 4 " + bestMatch(2,3,4));
//        System.out.println("Best match 4 3 3 " + bestMatch(4,3,3));
//        System.out.println("Best match 3 8 4 " + bestMatch(3,8,4));
//        System.out.println("Best match 4 3 4 " + bestMatch(4,3,4));
//        System.out.println("Best match 2 4 4 " + bestMatch(2,4,4));
//        System.out.println("Best match 8 8 4 " + bestMatch(8,8,4));
//        System.out.println("Best match 4 4 4 " + bestMatch(4,4,4));

// Best Fit
//        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
//        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
//        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
//        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
//        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
//        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));

    }
}
