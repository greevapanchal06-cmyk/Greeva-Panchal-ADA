import java.util.*;
public class Bubblesort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int size, temp, flag;
        
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();
 {
            for(int i = 0; i < size; i++){
                a[i] = (int)(Math.random() * 100);
            }
        } {
            System.out.println("Enter correct choice to insert value.");
        }
 
        long t1 = System.nanoTime();
        
        for(int i = 0; i < size-1; i++){
            flag = 0;
            for(int j = 0; j < size-i-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0){
                break;
            }
   
            //System.out.println("Stage of array after " + (i+1) + " step : ");
           // for(int j = 0; j < size; j++){
             //   System.out.print(a[j] + " ");
           // }
            System.out.println("");
        }
        
        long t2 = System.nanoTime();
        
        System.out.println("\nYour sorted array :");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nThe total time taken by the system to sort the array is " + (t2-t1) + " nanosecond.");
    }
}
