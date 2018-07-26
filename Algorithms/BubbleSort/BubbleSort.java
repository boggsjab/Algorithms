public class BubbleSort{

    // BubbleSort
    //	-average/worst case complexity O(n2)
    //	-best case complexity O(n)
    /*
    Wikipedia article
    https://en.wikipedia.org/wiki/Bubble_sort
    
    Bubble sort, sometimes referred to as sinking sort, is a
    simple sorting algorithm that repeatedly steps through the
    list to be sorted, compares each pair of adjacent items and 
    swaps them if they are in the wrong order. The pass through 
    the list is repeated until no swaps are needed, which indicates 
    that the list is sorted. The algorithm, which is a comparison 
    sort, is named for the way smaller or larger elements "bubble"
    to the top of the list. Although the algorithm is simple, it is 
    too slow and impractical for most problems even when compared to 
    insertion sort.[2] Bubble sort can be practical if the input 
    is in mostly sorted order with some out-of-order elements nearly
    in position. 
    */
    
    // iterative Bubble sort
    public static void BubbleSort(int[] a){
        boolean sorted=false;
        int last=a.length-1;

        while(!sorted){
            sorted=true;
            for(int i=0; i<last;i++){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                    sorted=false;
                }
            }
            last--;
        }
    }

    // recursive Bubble sort
    public static void BubbleSortRecurs(int[] a, int len){
        if(len<=1){return;}

        for(int i=0; i<len-1;i++){
            if(a[i]>a[i+1]){swap(a,i,i+1);}
        }
        BubbleSortRecurs(a, --len);
    }

    // swap function exchanges the values at indeces
    // i and j, in array a
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String args[]){
        int[] a={2,5,34,6,46,53};
        int[] b={3,6,2,25,32,31,26,4};

        // iterative
        printA(a);
        BubbleSort(a);	
        printA(a);

        // recursive
        printA(a);
        BubbleSortRecurs(b, b.length);
        printA(a);
    }
}
