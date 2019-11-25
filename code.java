// Using Scanner

import java.util.Scanner;
public class Day_to_date

{
    public static void main (String args[])
    {
        Scanner in= new Scanner (System.in);
        int day,month,year,dcode=0,ycode=0,sum=0;
        int mcode=0;
        System.out.println("The program will find the day if you enter the month, year and date");
        System.out.println("Enter the date");
        day=in.nextInt();
        System.out.println("Enter 1 for jan,2 for feb,3 for march,4 for april,5 for may,6 for june,7 for july,8 for aug,9 for sept,10 for oct,11 for nov & 12 for dec ");
        month=in.nextInt();        
        System.out.println("Enter the year");
        year=in.nextInt();
        if (month==1&&year%400==0)
        mcode=5;
        if (month==1||month==10)
        mcode=6;
        if (month==2&&year%400==0)
        mcode=1;
        if (month==2||month==3||month==11)
        mcode=2;
        if (month==4||month==7)
        mcode=5;
        if (month==5)
        mcode=0;
        if (month==6)
        mcode=3;
        if (month==8)
        mcode=1;
        if (month==9||month==12)
        mcode=4;
        ycode=(year%100)/4+(year%100);
        if ((year>=1900&&year<2000)||(year>=2300&&year<2400)||(year>=2700&&year<2800))
        sum=ycode+mcode+1+day;
        if ((year>=1800&&year<1900)||(year>=2200&&year<2300)||(year>=2600&&year<2700))
        sum=ycode+mcode+3+day;
        if ((year>=1700&&year<1800)||(year>=2100&&year<2200)||(year>=2500&&year<2600)||(year>=2900&&year<3000))
        sum=ycode+mcode-2+day;
        if ((year>=2000&&year<2100)||(year>=1600&&year<1700)||(year>=2400&&year<2500)||(year>=2800&&year<2900))
        sum=ycode+mcode+day;
        dcode=sum%7;
        if (dcode==0||dcode==7)
        System.out.println("The day is a sunday");
        if (dcode==1)
        System.out.println("The day is a monday");
        if (dcode==2)
        System.out.println("The day is a tuesday");
        if (dcode==3)
        System.out.println("The day is a wednesday");
        if (dcode==4)
        System.out.println("The day is a thursday");
        if (dcode==5)
        System.out.println("The day is a friday");
        if (dcode==6)
        System.out.println("The day is a saturday"); 
    }
}
