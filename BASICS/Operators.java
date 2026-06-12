//predict the output of the q below
import java.util.*;
publuic class Operators{
  public static void main(String[] args){
int a = 5;
int b = 10;
int c = ++a + b-- + a++ + --b;
System.out.println(c);
System.out.println(a);
System.out.println(b);
  }
}
// a is incremented a=6 b is post decremented b=10 (later b=9)
//a is 6 and is post incremented a=6 (later a=7)
//b is 9 and is pre decremented b=8
//c = 30
//a = 7
//b = 8
