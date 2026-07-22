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

    // trapping rainwater question 
    
    public static int rainwater(int a[]){

      // setting the left max boundary for each bar 

      int n = a.length;
      int leftmax [] = new int [n];
      leftmax[0] = a[0];
      for(int i = 1; i<n; i++){
        leftmax[i] = Math.max(leftmax[i-1],a[i]);
      }

      // setting the right max boundary for each bar 
      
      int rightmax [] = new int [n];
      rightmax[n-1] = a[n-1];
      for (int i = n-2 ; i>=0; i--){
         rightmax[i] = Math.max(rightmax[i+1],a[i]);
       }
      
     // the area  of the water trapped will be :  waterlevel - height of each bar 
     // and waterlevel = minimum of the two boundaries left and right 

      int trappedwater = 0;
      for (int i=0; i<n; i++){
         int waterlevel = Math.min(leftmax[i],rightmax[i]);
         trappedwater += waterlevel -  a[i];
      }
      return trappedwater;
    }

    // buy sell stock question
   
   public static int buysellstockProfit(int a[]){
    int maxp = 0;
    int bp  = a[0];
     for(int i =1; i<a.length; i++){
      if(a[i]<=bp){
        bp = a[i];
      }
      else{
        if((a[i]-bp)>maxp){
           maxp  = a[i]-bp;
        }
      }
      }
      
     
     if(maxp<0){
        return  -1;
      }
      return maxp;
   }

       

    
    public static void main(String args[]){
        int a[] = {-2,-3,4,-1,-2,1,5,-3}; 
        kadane(a);
      
    }
 }

