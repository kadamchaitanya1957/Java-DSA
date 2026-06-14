import java.util.*;
public class conditionals{
    public static void main(String[] args){
    
     // Question1: Write a Java program to 
     // see if a number is even  or odd.
      
      System.out.println("Enter any number:");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
    
      String x = ((a%2)==0)? "Even number":"Odd number"; //ternary operator
      System.out.println(x);   

     //Question3:Write a Java program to input week number
     // (1-7)andprintdayofweeknameusing switch case.

      System.out.println("Enter any number(1-7)");
      int b = sc.nextInt();

      switch(b) {
        case 1:System.out.println("Monday");
               break;
        case 2:System.out.println("Tuesday");
               break;
        case 3:System.out.println("Wednesday");
               break;
        case 4:System.out.println("Thursday");
               break;
        case 5:System.out.println("Friday");
               break;
        case 6:System.out.println("Saturday");
               break;
        case 7:System.out.println("Sunday");
               break;
        default:System.out.println("Incorrect input");
        }
     
     //Write a Java program that takes a year as an input
     // and print whether that year is a leap year or not.

      System.out.println("Enter a year:");
      int year = sc.nextInt();
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       System.out.println("Leap Year");
      }
     else {
     System.out.println("Not a Leap Year");
       }
     sc.close();
      
      // The Earth does not take exactly 365.25 days to go around the Sun.
      // It actually takes about 365.2422 days.
      // If we simply added 1 extra day every 4 years:
      // Average year length = 365.25 days
      // Real year length = 365.2422 days
      // Error = about 0.0078 days per year
      // That small error accumulates. 
      // After about 128 years, the calendar would be off by roughly 1 day.
      // To fix this, the Gregorian calendar introduced the 100-year and 400-year rules
      }
}   
