package com.company;

import javax.swing.*;
import java.awt.*;

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
        if(year1>year2){
            return true;
        }
        if (year1<year2){
            return false;
        }
        if (year1==year2){
            if (month1>month2){
                return true;
            }
            if (month1<month2){
                return false;
            }
            if (month1==month2){
                if (day1>day2){
                    return true;
                }
                if (day1<=day2){
                    return false;
                }
            }
        }
        return false;
    }

    public static Color bestMatch (int r, int g, int b){
        if (r>g && r>b){
            return Color.RED;
        }
        if (g>r && g>b){
            return Color.GREEN;
        }
        if (b>r && b>g){
            return Color.BLUE;
        }
        if (r==g && (r+g)>b && r!=b){
            return Color.YELLOW;
        }
        if (r==b && (r+b)>g && r!=g){
            return Color.MAGENTA;
        }
        if (g==b && (g+b)>r && b!=r){
            return Color.CYAN;
        }
        if (r==b && b==g){
            return Color.GRAY;
        }
        return Color.BLACK;
    }

    public static int findBestFit (int size1, int size2, int space){
        if (size1+size2<space){
            return 3;
        }
        if (size1+size2>space && size1<space || size2<space){
            if (size1>=size2 && size1<space){
                return 1;
                }
            if (size1>=size2 && size1>space) {
                return 2;
            }
            if (size1<size2 && size2<space){
                return 2;
            }
            if (size1<size2 && size2>space){
                return 1;
            }
        }
        return 0;
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


 //is later
        System.out.println("1/2/2010 is later than 1/2/2011 " + isLater(1,2,2010, 1,2,2011));
        System.out.println("1/2/2011 is later than 1/2/2010 " + isLater(1,2,2011, 1,2,2010));
        System.out.println("1/2/2010 is later than 3/2/2010 " + isLater(1,2,2010, 3,2,2010));
        System.out.println("3/2/2010 is later than 1/2/2010 " + isLater(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is later than 1/2/2010 " + isLater(1,3,2010, 1,2,2010));
        System.out.println("1/2/2010 is later than 1/3/2011 " + isLater(1,2,2010, 1,3,2010));
        System.out.println("1/2/2010 is later than 1/2/2010 " + isLater(1,2,2010, 1,2,2010));

// Best match
        System.out.println("Best match 2 3 4 " + bestMatch(2,3,4));
        System.out.println("Best match 4 3 3 " + bestMatch(4,3,3));
        System.out.println("Best match 3 8 4 " + bestMatch(3,8,4));
        System.out.println("Best match 4 3 4 " + bestMatch(4,3,4));
        System.out.println("Best match 2 4 4 " + bestMatch(2,4,4));
        System.out.println("Best match 8 8 4 " + bestMatch(8,8,4));
        System.out.println("Best match 4 4 4 " + bestMatch(4,4,4));

// Best Fit
        System.out.println("Find Best fit 2 3 6 is " + findBestFit(2,3,6));
        System.out.println("Find Best fit 4 3 6 is " + findBestFit(4,3,6));
        System.out.println("Find Best fit 3 4 6 is " + findBestFit(3,4,6));
        System.out.println("Find Best fit 2 3 1 is " + findBestFit(2,3,1));
        System.out.println("Find Best fit 6 3 4 is " + findBestFit(6,3,4));
        System.out.println("Find Best fit 3 6 4 is " + findBestFit(3,6,4));

    }
}
