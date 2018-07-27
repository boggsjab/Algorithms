public class Fibonacci{
    /*
    Write a simple Java program which will print Fibonacci series 
    e.g. 1 1 2 3 5 8 13 ... . up to a given number. Be prepare 
    for cross questions like using iteration over recursion 
    and how to optimize the solution using caching and memoization.
    */

    // iterative
    public static int fiboN(int n){
        int sum=0;
        int first=1;
        int second=0;
        
        for(int i=0; i<n; i++){
            sum=first+second;
            first=second;        
            second=sum;
        }
        return sum;
    }
    
    // recursive
    public static int fiboNRecurs(int n){
        if(n<1) { return 0; }
        if(n==1){ return 1; }
        else if(n==2){ return 1; }
        return fiboNRecurs(n-1) + fiboNRecurs(n-2);
    }
    
    // memoized
    public static int fiboNMemo(int n, int[] memo){  
        if(n<1){ return 0; }
        if(n==1){ return 1; }
        if(n==2){ return 1; }
        if(memo[n]>0){ return memo[n]; }
        memo[n] = fiboNMemo(n-1,memo) + fiboNMemo(n-2,memo); 
        return memo[n];
    }
    
    // prints the contents of array, a, and moves
    // cursor to next line
    public static void printA(int[] a){
        for(int work:a){ System.out.print(work+" "); }
        System.out.println();
    }

    public static void main(String args[]){
        int     n=4000;
        int[]   memo=new int[n+1];
        
        final long p0=System.currentTimeMillis();
        final long x = fiboNMemo(n,memo);
        final long p1=System.currentTimeMillis();
        System.out.format("%d%n",p1-p0);  
        
        final long p2=System.currentTimeMillis();
        final long y = fiboN(n);
        final long p3=System.currentTimeMillis();
        System.out.format("%d%n",p3-p2);
        
        System.out.format("%d=x%n%d=y%n",x,y);
    }
}
