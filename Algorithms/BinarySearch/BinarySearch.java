//import java.lang.*; //Math.floor()

public class BinarySearch {
    // Binary search
    // best-case O(1)
    // avg/worst-case O(logn)
    // input data must be sorted (ascending)

    // Wikipedia article
    // https://en.wikipedia.org/wiki/Binary_search_algorithm
    
    /*
    Binary search, also known as half-interval
    search,[1] logarithmic search,[2] or binary chop,[3] is a search
    algorithm that finds the position of a target value within a sorted
    array.[4][5] Binary search compares the target value to the middle
    element of the array. If they are not equal, the half in which the
    target cannot lie is eliminated and the search continues on the
    remaining half, again taking the middle element to compare to the 
    target value, and repeating this until the target value is found. 
    If the search ends with the remaining half being empty, the target 
    is not in the array. Even though the idea is simple, implementing 
    binary search correctly requires attention to some subtleties about 
    its exit conditions and midpoint calculation. 
    */
    
    // iterative binary search
    public static int BinarySearch(int[] a, int k){
        int left=0, 
            right=a.length-1, 
            pivot=0;

        while(left<=right){
            pivot=left+(int)Math.floor((right-left)/2);
            if(a[pivot]==k){return pivot;}
            else if(a[pivot]<k){left = pivot+1;}
            else if(a[pivot]>k){right = pivot-1;}
        }

        return -1;
    }

    // recursive binary search
    public static int BinarySearchRecur(int[] a, int k, int left, int right){
        if(left>right){return -1;}

        int pivot=left+(int)Math.floor((right-left)/2);
        int r=-1;

        if(a[pivot]==k){return pivot;}
        else if(a[pivot]<k){r=BinarySearchRecur(a, k, pivot+1, right);}
        else if(a[pivot]>k){r=BinarySearchRecur(a, k, left, pivot-1);}

        return r;
    }

    // prints the contents of array, a, and moves
    // cursor to next line
    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,6,7,10,14,16,17,20};

        printA(a);

        int r = BinarySearch(a,20);
        System.out.println("Iter: k=20 r="+r);

        r = BinarySearchRecur(a,13,0,a.length-1);
        System.out.println("Recurs: k=13 r="+r);
    }

}
