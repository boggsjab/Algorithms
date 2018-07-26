public class SelectionSort{
    // Selection sort
    
    // Wikipedia article
    // https://en.wikipedia.org/wiki/Selection_sort
    /*
    Selection sort is a sorting algorithm, specifically an in-place 
    comparison sort. It has O(n2) time complexity, making it inefficient 
    on large lists, and generally performs worse than the similar insertion 
    sort. Selection sort is noted for its simplicity, and it has performance
    advantages over more complicated algorithms in certain situations, 
    particularly where auxiliary memory is limited.

    The algorithm divides the input list into two parts: the sublist of 
    items already sorted, which is built up from left to right at the front
    (left) of the list, and the sublist of items remaining to be sorted that
    occupy the rest of the list. Initially, the sorted sublist is empty and 
    the unsorted sublist is the entire input list. The algorithm proceeds 
    by finding the smallest (or largest, depending on sorting order) 
    element in the unsorted sublist, exchanging (swapping) it with the
    leftmost unsorted element (putting it in sorted order), and moving
    the sublist boundaries one element to the right. 
    */
    
    // iterative Selection sort
    public static void SelectionSort(int[]a){
        int start=0;
        int min=start;
        
        while(start<a.length-1){
            min=start;
            for(int i=start;i<a.length;i++){
                if(a[i]<a[min]){ min=i; }  
            }
            if(min!=start){ swap(a,min,start); }
            start++;
        }
    }
    
    // recursive Selection sort
    public static void SelectionSortRecur(int[] a, int start){
        if(start>=a.length){ return; }
        
        SelectionSortRecur(a, start+1);
        
        int min=start;
        
        while(start<a.length-1){
            min=start;
            for(int i=start;i<a.length;i++){
                if(a[i]<a[min]){ min=i; }  
            }
            if(min!=start){ swap(a,min,start); }
        }
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
    
    public static void main(String args[]){
        int[] a={13,3,5,1,4};
        int[] b={4,2,6,5,8,1};
        
        printA(a);
        SelectionSort(a);
        printA(a);
        
        printA(b);
        SelectionSort(b);
        printA(b);
    }
}
