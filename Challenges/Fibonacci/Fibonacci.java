public class Fibonacci{
    /*
    Write a simple Java program which will print Fibonacci series 
    e.g. 1 1 2 3 5 8 13 ... . up to a given number. Be prepare 
    for cross questions like using iteration over recursion 
    and how to optimize the solution using caching and memoization.
    */

    // iterative
    public static int[] fiboN(int n){
        int[] a= new int[n];
        
        int first=1;
        int second=0;
        
        for(int i=0; i<n; i++){
            a[i]=first+second;
            first=second;
            second=a[i];            
        }
        
        return a;
    }
    
    // recursive
    public static int[] fiboNRecurs(int[] a, int n, int first, int second){
        // base case
        if(n<1){ return a; }
        // reduce problem
        a=fiboNRecurs(a,n-1, first,second);
        // perform essential operations
        a[n-1]=first+second;
        first=second;
        second=a[n-1];
        
        return a;
    }
    
    // memoized
    public static int[] fiboNMemo(int[] a, int n, int first, int second){
        
        return a;
    }
    
    // prints the contents of array, a, and moves
    // cursor to next line
    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }
    
    public static void main(String args[]){
        int     n=5000;
        int[]   a;
        int[]   b=new int[n];
       
        final long q0=System.nanoTime();
        final long p0=System.currentTimeMillis();
        
        final long t0=System.currentTimeMillis();
        a=fiboN(n);
        final long t1=System.currentTimeMillis();
        
        final long t2=System.currentTimeMillis();
        b=fiboNRecurs(b,n,1,0);
        final long t3=System.currentTimeMillis();
        
        final long n0=System.nanoTime();
        a=fiboN(n);
        final long n1=System.nanoTime();
        
        final long n2=System.nanoTime();
        a=fiboN(n);
        final long n3=System.nanoTime();
       
        final long q1=System.nanoTime();
        final long p1=System.currentTimeMillis();
        //printA(a);
    
        System.out.format("iterative algorithm time: %tL ms%n",t1-t0);
        System.out.format("iterative algorithm time: %tN ns%n",n1-n0);
        System.out.format("recursive algorithm time: %tL ms%n",t3-t2);
        System.out.format("recursive algorithm time: %tN ns%n",n3-n2);
        System.out.format("total time: %tL ms%n",p1-p0);
        System.out.format("total time: %tN ns%n",q1-q0);
    }
}
