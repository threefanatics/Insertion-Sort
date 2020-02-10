/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void putOnPosition(int arr[],int i){
        
        int length = arr.length;
        int j;
        for(j=0;j<i;j++){
            if(arr[j] > arr[i]){
              break;  
            }
        }
        int temp = arr[i];
        for(int k=i;k>j;k--){
            arr[k] = arr[k-1];
        }
        arr[j] = temp;
    }
    
    public static void InsertionSort(int arr[]){
        
        int length = arr.length;
        for(int i=1;i<length;i++){
            putOnPosition(arr,i);
        }
    }
    
    
    public static void fibonacciSeries(int n){ //to print n fibonacci numbers
    
        System.out.print("1 1 ");
        int x = 1, y = 1;
        int temp;
        for(int i=2;i<n;i++){
            System.out.print(String.valueOf(x + y) + " ");
            temp = x;
            x = y;
            y = temp + y;
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//fibonacciSeries(10);
		Random rd = new Random();
		int arr[] = new int[10];
		for (int i = 0; i < 10; i++) {
         arr[i] = rd.nextInt() % 30; // storing random integers in an array
         System.out.println(String.valueOf(arr[i]) + " "); // printing each array element
      }
      
      InsertionSort(arr);
      System.out.println("After Sorting");
      for(int i=0;i<10;i++)
      {
          System.out.println(arr[i]); 
      }
	}
}
