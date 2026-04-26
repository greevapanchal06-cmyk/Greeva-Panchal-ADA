import java.util.*;

public class pr3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int size;

        System.out.print("Enter the size of array : ");
        size = sc.nextInt();

        for(int i = 0; i < size; i++){
            a[i] = (int)(Math.random() * 100);
        }

        long t1 = System.nanoTime();

        for(int i = 1; i < size; i++){
            int key = a[i];
            int j = i - 1;

            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

            /*System.out.println("Stage after " + i + " step:");
            for(int k = 0; k < size; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();*/
        }

        long t2 = System.nanoTime();

        System.out.println("\nSorted array:");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\nTime: " + (t2-t1));
    }
}
