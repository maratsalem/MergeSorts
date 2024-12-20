import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Array before sorting: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        Main objectOfMain = new Main();
        objectOfMain.mergeSort(arr, 0, arr.length-1);

        System.out.print("Array after sorting: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    void mergeSort(int[] arr, int begin, int end)
    {
        if (begin < end)
        {
            // Find the middle point
            int mid = (begin+end)/2;

            // Sort first and second halves
            mergeSort(arr, begin, mid);
            mergeSort(arr , mid+1, end);

            // Merge the sorted halves
            Merge(arr, begin, mid, end);
        }
    }

    void Merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the two subarrays
        int i = 0; // Index for the first subarray (L)
        int j = 0; // Index for the second subarray (R)
        int k = l; // Index for the merged subarray (arr)

        for (int placeNumber = l; placeNumber <= r; placeNumber++) {
            if (i < n1 && (j >= n2 || L[i] <= R[j])) {
                arr[placeNumber] = L[i];
                i++;
            } else {
                arr[placeNumber] = R[j];
                j++;
            }
        }
    }


}