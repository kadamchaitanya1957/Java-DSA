//predict the output of the q below
//q1
import java.util.*;
publuic class Operators{
  public static void main(String[] args){
int a = 5;
int b = 10;
int c = ++a + b-- + a++ + --b; // 6+10+6+8=30
System.out.println(c);
System.out.println(a);
System.out.println(b);

// a is incremented a=6 b is post decremented b=10 (later b=9)
//a is 6 and is post incremented a=6 (later a=7)
//b is 9 and is pre decremented b=8
//c = 30
//a = 7
//b = 8

// q2
 x = 200;
 y = 50;
 z = 100;
    if(x > y && y > z)                     // AND gate 
    {System.out.println("Hello");          // true and false -> False
    }
    if(z > y || z > x)                     // OR gate
    {System.out.println("Java");           // true and false -> True
    }
    if(!((y+z)<x))                         // NOT gate 
    {System.out.println("Hello Java");     // not (!)True -> False
    }

//output: Java

// q3 
  x = y = z = 2;
  x += y;                                     // x=x+y     (4)
  y -= z;                                     // y=y-z     (0)
  z /= (x + y);                               // z=z/(x+y) (0.5 but int stores 0)
  System.out.println(x + " " + y + " " + z);   

 //output: 4 0 0 

// q4
 x = 10;
 y = 5;
 int exp1 = (y * (x / y + x / y));
 int exp2 = (y * x / y + y * x / y);
 System.out.println(exp1);  
 System.out.println(exp2);

// output : 20,20
  
}
}

