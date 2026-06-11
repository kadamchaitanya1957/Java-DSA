import java.util.*;

public class Datatypes {
    public static void main(String[] args) {
        
        // q1 avg of three numbers

           Scanner sc = new Scanner(System.in);
           System.out.print("Enter any three numbers: ");
           float a = sc.nextFloat();
           float b = sc.nextFloat();
           float c = sc.nextFloat();
           float average = (a + b + c) / 3;
           System.out.println("Average = " + average);

        // q2 area of a circle

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter radius of a circle: ");
          float r = sc.nextFloat();
          float a = 3.14f*r*r;
          System.out.println("Area of circle = " + a);

        // q3 Enter the cost of 3 items from the user (using float data type) — a pencil, a pen, and an eraser. 
        // You have to output the total cost of the items back to the user as their bill.
        // Add-on (Advanced): You can also try adding 18% GST tax to the items in the bill and display the final amount.
       
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter cost of pencil: ");
          float pencil = sc.nextFloat();
          System.out.print("Enter cost of pen: ");
          float pen = sc.nextFloat();
          System.out.print("Enter cost of eraser: ");
          float eraser = sc.nextFloat();
          float totalCost = pencil + pen + eraser;
          System.out.println("Total bill = " + totalCost);
          float gst = totalCost * 0.18f;
          float finalBill = totalCost + gst;
          System.out.println("GST (18%) = " + gst);
          System.out.println("Final bill after GST = " + finalBill);
          sc.close();
    }
}
    

