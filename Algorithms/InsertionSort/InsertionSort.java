public class InsertionSort{
    // Insertion Sort
    // best-case: O(n)
    // worst/average case: O(n2)

    // Wikipedia article
    // https://en.wikipedia.org/wiki/Insertion_sort
    /*
    Insertion sort iterates, consuming one input element each 
    repetition, and growing a sorted output list. At each iteration, 
    insertion sort removes one element from the input data, finds the 
    location it belongs within the sorted list, and inserts it 
    there. It repeats until no input elements remain.

    Sorting is typically done in-place, by iterating up the array, growing
    the sorted list behind it. At each array-position, it checks the
    value there against the largest value in the sorted list (which happens
    to be next to it, in the previous array-position checked). If larger, it
    leaves the element in place and moves to the next. If smaller, it finds 
    the correct position within the sorted list, shifts all the larger
    values up to make a space, and inserts into that correct position.

    The resulting array after k iterations has the property where
    the first k + 1 entries are sorted ("+1" because the first
    entry is skipped). In each iteration the first remaining entry of the
    input is removed, and inserted into the result at the correct position, 
    with each element greater than x copied to the right as it is compared 
    against x.
    */

    // iterative Insertion sort
    public static void InsertionSort(int[] a){
        int k=0;
        int j=0;
        
        for(int i=1; i<a.length;i++){
            k=a[i];
            j=i-1;
            while(j>=0 && k<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=k;
        }
    }
    
    // recursive Insertion sort
    public static void InsertionSortRecurs(int[] a, int len){
       if(len<2){ return; }
       
       InsertionSortRecurs(a, len-1);
       
       int k=a[len-1];
       int j=len-2;
       
       while(j>=0 && k<a[j]){
           a[j+1]=a[j];
           j--;
       }
       a[j+1]=k;
    }
    
    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String args[]){
        int[] 	a = {7,3,5,25,63,3,2,1,67,86,35,52};
        int[]   b = {26,24,52,78,75,3,56,-2,8,9,64,37};

        printA(a);
        InsertionSort(a);
        printA(a);
        
        printA(b);
        InsertionSortRecurs(b,b.length);
        printA(b);   
    }
}