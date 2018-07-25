class InsertionSort{
    // Insertion Sort

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