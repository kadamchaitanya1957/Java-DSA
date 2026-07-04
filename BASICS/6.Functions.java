import java.util.*;
public class Functions {
    
    // q1 binomial coefficent of distribution nCr and decimal to binary conversion:
   
    public static int factorial(int num1){
        int fact = 1;
        if (num1 == 0 || num1 == 1){
            System.out.println("The factorial of a is: 1");      // factorial function 
        }
        for(int i = 1; i<= num1; i++){
            fact = fact*i;
        }
       return fact;

    }
    public static int decimaltobinary(int num1){                 // decimal to binary conversion
        int pow = 0;
        int binNum = 0;
        while(num1 > 0){
        int rem = num1 % 2;
        binNum = binNum + (rem*(int)Math.pow(10,pow));
        pow++;
        num1 = num1/2;
        }
        return binNum;
    }
    public static int binomialcoefficent(int n, int r){            // n and r are formal parameters
        return(factorial(n)/(factorial(r)*factorial(n-r)));
        
    }

   // q2  Pallindrome number and sum of all digits 

    public static boolean pallindrome(int num1){   
        int orignal = num1;                                        // pallindrome number is a number which remains same even after being reversed 
        int rev = 0;
        int rem = 0;
        while(num1 > 0){
            rem = num1 % 10;
            rev = rev * 10 + rem;
            num1 = num1 / 10;                   
        } 
        if(orignal == rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static int sumofalldig(int n){               // sum of all digits of a number 
        int sum = 0;
        while(n > 0){
        int dig = n % 10;
        sum = sum + dig;
        n = n / 10;
        }
        return sum;
    }
      
    
    public static void main(String[] args){             // void functions do not return any value to the main function
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();                            //a and b are actual parameters
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        System.out.println("The factorial of: "+ a +" is "+factorial(a));
        System.out.println("The factorial of: "+ b +" is "+factorial(b));
        System.out.println("The binomial distribution a^C :"+ binomialcoefficent(a,b));
        System.out.println("The binary form of a is: " + decimaltobinary(a));
        System.out.println("The binary form of b is: " + decimaltobinary(b));

        System.out.println("Math methods:");
        System.out.println("The smaller  number is: "+ Math.min(a,b));
        System.out.println("The larger number is: "+ Math.max(a,b));
        System.out.println("The square roots are: a = "+ Math.sqrt(a) +" b = "+ Math.sqrt(b));
        System.out.println("a raise to b is: "+ Math.pow(a,b));
        System.out.println("|a| = " + Math.abs(a) + "|b| = " + Math.abs(b));
        
        
        System.out.println("Enter a number to check pallindrome or not and sum of all it's digit:");
        int x = sc.nextInt();
        if(pallindrome(x)){
            System.out.println("The number is pallindrome");
        }
        else{
            System.out.println("The number is not Pallindrome");
        }
        System.out.println("The sum of all digits is: "+ sumofalldig(x));
    }
}
