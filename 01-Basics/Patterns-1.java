import java.util.*;
public class Patterns2 {
   
    // q1 Hollow Rectangle Patttern 

    public static void hollowRectangle(int totrows , int totcols){
        for (int i = 1; i<=totrows; i++){
            for (int j = 1; j<=totcols; j++){
                if(i==1||i==totrows|| j==1 ||j==totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
  // q2 Solid Rhombus
    
    public static void solidrhombus(int line){
        for (int i = 1; i<=line; i++){
            for(int j = 1; j<=(line-i); j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=line; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    //q3 Hollow Rhombus

     public static void hollowrhombus(int line){
        for (int i = 1; i<=line; i++){
            for(int j = 1; j<=(line-i); j++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=line; j++){
             if(i == 1 || i == line || j == 1 || j == line)
             {System.out.print("*");
              }
             else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
        
    }

    //q4 Diamond pattern 
    
     public static void diamond(int line){
        for (int i = 1; i<=line; i++){
            for(int j = 1; j<=(line-i); j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = line; i>=1; i--){
            for(int j = 1; j<=(line-i); j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
  public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and colums for hollow rectangle:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println("Hollow Rectangle: ");
        hollowRectangle(rows,cols);
        System.out.println("Enter  number of lines in all of the patterns: ");
        int line = sc.nextInt();
        System.out.println("Solid Rhombus: ");
        solidrhombus(line);
        System.out.println("Hollow Rhombus: ");
        hollowrhombus(line);
        System.out.println("Diamond pattern: ");
        diamond(line);
  }
}
       
        
