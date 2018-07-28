public class QuickSort{
//  Quicksort
//  Wikipedia Article:
//  https://en.wikipedia.org/wiki/Quicksort
//Quicksort (sometimes called partition-exchange sort) is an efficient sorting
//algorithm, serving as a systematic method for placing the elements of an array
//in order. Developed by Tony Hoare in 1959[1] and published in 1961,[2] it is
//still a commonly used algorithm for sorting. When implemented well, it can
//be about two or three times faster than its main competitors, merge sort and
//heapsort.[3][contradictory]
//
//Quicksort is a divide and conquer algorithm. Quicksort first divides a large
//array into two smaller sub-arrays: the low elements and the high elements. 
//Quicksort can then recursively sort the sub-arrays.
//
//The steps are:
//
//    1. Pick an element, called a pivot, from the array.
//    2. Partitioning: reorder the array so that all elements with values less 
//        than the pivot come before the pivot, while all 
//        elements with values greater than the pivot come after it 
//        (equal values can go either way). After this partitioning, the pivot
//        is in its final position. This is called the partition operation.
//    3. Recursively apply the above steps to the sub-array of elements with
//        smaller values and separately to the sub-array of elements 
//        with greater values.
//
//The base case of the recursion is arrays of size zero or one, which 
//are in order by definition, so they never need to be sorted.
//
//The pivot selection and partitioning steps can be done in several
//different ways; the choice of specific implementation schemes
//greatly affects the algorithm's performance. 
//
//Mathematical analysis of quicksort shows that, on average, the algorithm
//takes O(n log n) comparisons to sort n items. In the worst case, it makes 
//O(n2) comparisons, though this behavior is rare. 

    public static void QuickSort(int[] a, int lo, int hi){
       if(lo>hi){ return; }
       int p=partQS(a,lo,hi);
       QuickSort(a,  lo, p-1);
       QuickSort(a, p+1,  hi);
    }
    
    // partQS takes a pivot value, a[hi],
    // and arranges it in an array such that all numbers
    // less than this pivot value are to the left [0-pivot]
    // and all numbers greater than this pivot value
    // are to the right [pivot-end].
    // the function returns the index of that pivot
    // in its final position
    
    public static int partQS(int[] a, int lo, int hi){
        int pivot = a[hi];
        int i = lo-1;
        
        for(int j=lo;j<hi;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,hi);
        
        return i+1;
    }
    
    public static void main(String args[]){
        int[]   a={ 
                    3,6,35,43,31,
                    1,2,35,67,88,
                    54,53,52,78,1023,
                    42,102,37,99,102
                };
    
        QuickSort(a,0,a.length-1);
        printA(a);
    }
    
        // swap function exchanges the values at indeces
    // i and j, in array a
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    // prints the contents of array, a, and moves
    // cursor to next line
    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }
}
