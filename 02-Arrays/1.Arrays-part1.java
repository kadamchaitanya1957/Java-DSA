import java.util.*;
 public class Array {
    public static int binarysearch(int a[],int find){

       //q1 Search for an element with binary search

       int beg = 0;
       int end = a.length - 1;
       int mid = (beg + end)/2;
        while(beg <= end){
           if( a[mid] == find){
            return mid;
        }                                    
           if(a[mid] < find){ 
             beg = mid + 1;

           }
           else{
             end = mid - 1;
           }
           mid = (beg + end)/2;
        }
       
        return -1;
    }

    //q2 To reverse an array 

    public static void reverse( int a[]){
        int first = 0;
        int last = a.length - 1;
        while(first < last){
            int temp = a[last];
            a[last] = a[first];
            a[first] = temp;
            first++;
            last--;

        }
    }

     // q3 Pairs in an array 

     public static void pairs(int a[]){
        for(int i = 0; i < a.length; i++){
            int curr = a[i];
            for(int j = i+1; j<a.length; j++){
                System.out.print("("+ curr + "," + a[j] +")");
            }
            System.out.println();
        }
     }

     // q4  Print all subarrays find their individual sums, max sum and min sum.
     //Brute force method
     
    public static void subarray(int a[]){
        int totsubarrays = (((a.length)*(a.length+1))/2);
        int sumarr[] = new int[totsubarrays];
        int count = 0;
        for(int i=0; i<a.length; i++){
            for( int j = i; j<a.length; j++){
                int sum = 0;
                for(int k = i; k<= j; k++){
                    sum = sum + a[k];
                    System.out.print(a[k]+" ");
                    
                }
              sumarr[count] = sum;
              count++;
              System.out.println();
            }
            System.out.println();

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
 
    
    public static void main(String args[]){
        int a[] = {2,4,6,8,10}; 
        subarray(a);
      
    }
 }
