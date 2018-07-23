public class BubbleSort{

	// BubbleSort
	//	compare consecutive values in an array (i, i+1)and swap them if
	//	i<i+1, pushing the largest value to the end of the array.  repeat
	//	until the entirety of the array is sorted
	
	//	-average/worst case complexity O(n^2)
	//	-best case complexity O(n)

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

	public static void main(String args[]){
		int[] a={2,5,34,6,46,53};
		int[] b={3,6,2,25,32,31,26,4};

		// iterative
		for(int work:a){
			System.out.print(work + " ");
		}
		System.out.println();

		BubbleSort(a);
		
		for(int work:a){
			System.out.print(work + " ");
		}
		System.out.println();
		
		// recursive
		for(int work:b){
			System.out.print(work + " ");
		}
		System.out.println();

		BubbleSortRecurs(b, b.length);
		
		for(int work:b){
			System.out.print(work + " ");
		}
		System.out.println();
	}
}
