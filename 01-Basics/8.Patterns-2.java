import java.util.*;
public class Patterns2 {
  
     //q1 Inverted rotatated Pyramid 

      public static void InvertedStarPyramid(int line){
        for(int i = 1; i<= line; i++){
            for (int j=1; j<=line-i; j++){
             System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
          System.out.println();
        }
    }

    // q2 inverted half pyramid with numbers

    public static void InvertedNumPyramid(int line){
               for(int i = 1; i<= line; i++){
                for (int j = 1; j<=line-i+1; j++){
                    System.out.print(j+" ");
                }
                for(int j = 1; j<=i-1; j++){
                    System.out.print(" ");
                }
                System.out.println();
               }
    }

    //q3 FLOYD's Triangle

    public static void FloydsTriangle(int line){
        int counter = 1;
        for(int i = 1; i<=line; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
           System.out.println();
        }
    }

    //q4  0-1's Triangle ( i+j = even -> 1 and i+j = odd -> 0)

    public static void ZeroOneTriangle(int line){
        for(int i = 1; i<=line; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    //q5 Butterfly Pattern 

    public static void butterfly(int line){
        for(int i = 1; i<=line; i++){
            for(int j = 1; j<=i; j++){
              System.out.print("*");
            }
            for(int j =1; j<=2*(line-i); j++){
                System.out.print(" ");
            }
             for(int j = 1; j<=i; j++){
              System.out.print("*");
            }
          System.out.println();
        }
        for(int i = line; i>=1; i--){
            for(int j = 1; j<=i; j++){
              System.out.print("*");
            }
            for(int j =1; j<=2*(line-i); j++){
                System.out.print(" ");
            }
             for(int j = 1; j<=i; j++){
              System.out.print("*");
            }
            System.out.println();
        }
    }
   public static void main(){
        System.out.println("Enter the number of lines for all the patterns: ");
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        System.out.println("Inverted star pyramid:");
        InvertedStarPyramid(line);
        System.out.println("Inverted number pyramid:");
        InvertedNumPyramid(line);
        System.out.println("Floyd's Triangle:");
        FloydsTriangle(line);
        System.out.println("0-1's Triangle:");
        ZeroOneTriangle(line);
        System.out.println("Butterfly Pattern:");
        butterfly(line);
   }
}
       
