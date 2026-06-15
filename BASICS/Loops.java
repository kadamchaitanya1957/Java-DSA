import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //q1 Reverse a user inputed number 

        System.out.println("enter any number:");
        int n = sc.nextInt();
        int rev = 0;
        int lastDigit;
        while(n>0)
        {
         lastDigit = n % 10;
         n/=10;
         rev = (rev*10) + lastDigit;
        }
          System.out.println("Reverse number is:");
          System.out.println(rev);
        
        //q2 user based star pattern 

        System.out.println("Enter the number of rows and columns of star pattern:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int i=1;
        int j = 1;
        for(i=1;i<=r;i++)
        { for(j=1;j<=c;j++)
        { 
            System.out.print("*");
        }
        System.out.println("");
        } 

        //q3 Check wether the number entered is prime or not
        
         System.out.println("Enter a number to check wether it's prime:");
        int check = sc.nextInt();
        boolean isPrime = true;
        for(i = 2; i<=Math.sqrt(check); i++) 
        {
          if(check % i == 0) 
          {isPrime = false;
           break;
          }
        }
        if(isPrime){
            System.out.println("Number entered is prime ");
        }
        else{
            System.out.println("Number entered is not prime ");
        }

        //q4 Write a program that reads a set of integers,
        //and then prints the sum of the even and odd integers.

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        sc.close();
    }
}
 
