import java.io.*;
import java.util.*;
class P35
{
  public static void main(String args[])
{
  int i,t,j;
  int[] arr=new int[]{2,8,9,3,0,5};
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
for(j=0;j<n;j++)
System.out.print(arr[j] );
}
}