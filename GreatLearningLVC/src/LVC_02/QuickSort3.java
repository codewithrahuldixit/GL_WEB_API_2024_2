package LVC_02;
import java.util.*;

class QS03 {
    static int partition(int [] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i]<= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }

    static void qs(int [] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static void quickSort(int[] arr) {
        // Write your code here.
        qs(arr, 0, arr.length - 1);
    }
}

public class QuickSort3 {
    public static void main(String args[]) {
        
       int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        QS03.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
                System.out.println();
    }

} 