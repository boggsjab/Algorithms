//import java.lang.*; //Math library if needed

public class BinarySearch {
    // divide-and-conquer.  pick a pivot point, starting index (0), and 
    // ending index (array length-1).
    // if the value at the pivot = the key, return the pivot.
    // if the key is less than the pivot value, divide the array by
    // setting the ending index to the position before the pivot (end=pivot-1).
    // if the key is greater than the pivot value, divide the array
    // by setting the starting index to the position after the pivot (start=pivot+1).
    // repeat until the pivot==key or the starting index passes the ending index.

    // best-case O(1)
    // avg/worst-case O(logn)
    // input data must be sorted (ascending)

    // iterative binary search implementation
    public static int BinarySearch(int[] arr, int k){
        int left=0, 
            right=arr.length-1, 
            pivot=0;

        while(left<=right){
            pivot=left+(int)Math.floor((right-left)/2);
            if(arr[pivot]==k){return pivot;}
            else if(arr[pivot]<k){left = pivot+1;}
            else if(arr[pivot]>k){right = pivot-1;}
        }

        return -1;
    }

    // recursive binary search implementation
    public static int BinarySearchRecur(int[] arr, int k, int left, int right){
        if(left>right){return -1;}

        int pivot=left+(int)Math.floor((right-left)/2),
            r=-1;

        if(arr[pivot]==k){return pivot;}
        else if(arr[pivot]<k){r=BinarySearchRecur(arr, k, pivot+1, right);}
        else if(arr[pivot]>k){r=BinarySearchRecur(arr, k, left, pivot-1);}

        return r;
    }

    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,10,14,16,17,20};

        printA(arr);

        int r = BinarySearch(arr,20);
        System.out.println("Iter: k=20 r="+r);

        r = BinarySearchRecur(arr,13,0,arr.length-1);
        System.out.println("Recurs: k=13 r="+r);
    }

}
