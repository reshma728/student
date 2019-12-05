import java.io.*;
import java.util.*;
class P36
{
  public static void main(String args[])
{
  int i,t,j;
  int[] arr=new int[]{2,2,2,2};
  int n=arr.length;
 for ( i = 0; i < n-1; i++)
     {
           
            int min = i;
            for ( j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
}
if (n==0 || n==1)
{  
        }    
        int k = 0;
        for (i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[k++] = arr[i];  
            }  
        }  
        arr[k++] = arr[n-1]; 
for ( i=0; i<k; i++)  
           System.out.print(arr[i]+" ");  
}
}