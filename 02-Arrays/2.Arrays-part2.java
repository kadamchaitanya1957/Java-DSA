import java.util.*;
public class Array2{

    // maximum sum of subarrays 
    // prefix sum O(N sqaure) time complexity

   public static void subarray(int a[]){
        int sum = 0;
        int totsubarrays = (((a.length)*(a.length+1))/2);
        int sumarr[] = new int[totsubarrays];
        int count = 0;
        int prefix [] = new int[a.length];
        prefix[0]=a[0];
        for(int i = 1; i<prefix.length; i++){                      // A new array where each element stores the sum of all elements from the beginning of the original array up to the current index.
           prefix[i]= prefix[i-1]+a[i];
        }
        for(int i=0; i<a.length; i++){
            for( int j = i; j<a.length; j++){
             sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];    // sum = prefix[j] - ptrefix[i-1] is the formula replacing the loop
             sumarr[count] = sum;
              count++;
            }

        }
        System.out.println("The sum of subarray's:");
        for(count=0; count<sumarr.length; count++){
            System.out.print(sumarr[count]+" ");
        }
        System.out.println();
        int max = sumarr[0];
        int min = sumarr[0];
        for(int i=1; i<sumarr.length; i++){
               if( max < sumarr[i]){
                max = sumarr[i];
               } 
        }
        System.out.println("The max sum of subarray's is: "+max);
         for(int i=1; i<sumarr.length; i++){
               if( min > sumarr[i]){
                min = sumarr[i];
               } 
        }
        System.out.println("The min sum of subarray's is: "+min);

    }

    // maximum sum of subarrays(Kadane's Algorithm)

    // Kadane's Algorithm is an optimal dynamic programming algorithm 
    // that finds the maximum sum of a contiguous subarray by maintaining a running sum. 
    // If the running sum becomes negative, it is discarded because it can only reduce the sum of any future subarray. 
    // The algorithm runs in O(n) time and O(1) extra space.

    public static void kadane(int a[]){                  
       int cs = 0;
       int ms = 0;
       for(int i=0; i<a.length; i++){                
          cs = cs + a[i];
             if(cs < 0){
               cs = 0;}
             if(cs > ms){
                 ms = cs;
                }
            }
               System.out.println(ms);   
        }
       

    
    public static void main(String args[]){
        int a[] = {-2,-3,4,-1,-2,1,5,-3}; 
        kadane(a);
      
    }
 }

