class InsertionSort{
    // Insertion Sort

    // iterative Insertion sort
    public static void InsertionSort(int[] a){
        int key=0;
        int j=0;
        
        for(int i=1; i<a.length;i++){
            key=a[i];
            j=i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }

    public static void InsertionSortRecurs(int[] a, int key, int pivot, int tempIndex){
        if(tempIndex>=0){a[tempIndex+1]=a[tempIndex];}
        
        if(tempIndex<0 || key>a[tempIndex]){
            a[tempIndex+1]=key;
            if(pivot+1>=a.length){ return; }
            tempIndex=++pivot;
            key=a[pivot];
        }
        
        InsertionSortRecurs(a,key, pivot,tempIndex-1); 
    }

    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String args[]){
        int[] 	a = {7,3,5,25,63,3,2,1,67,86,35,52};
        int[]   b = {4,1,14,62,38,42,62,78,63,25,-3};

        printA(a);
        InsertionSort(a);
        printA(a);
        
        printA(b);
        InsertionSortRecurs(b,b[1],1,0);
        printA(b);
        
    }
}