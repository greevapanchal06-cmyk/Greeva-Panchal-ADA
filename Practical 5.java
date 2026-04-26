import java.util.*;

public class pr5 {

    static int partition(int a[], int low, int high){
        int pivot = a[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(a[j] < pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i+1;
    }

    static void quickSort(int a[], int low, int high){
        if(low < high){
            int pi = partition(a, low, high);
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int size;

        System.out.print("Enter the size of array : ");
        size = sc.nextInt();

        for(int i=0;i<size;i++){
            a[i] = (int)(Math.random()*100);
        }

        long t1 = System.nanoTime();

        quickSort(a, 0, size-1);

        long t2 = System.nanoTime();

        System.out.println("Sorted array:");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println("\nTime: " + (t2-t1));
    }
}
