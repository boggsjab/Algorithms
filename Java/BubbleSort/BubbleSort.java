public class BubbleSort{

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

	public static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}

	public static void main(String args[]){
		int[] a={2,5,34,6,46,53};
		int[] b=new int[a.length];

		for(int work:a){
			System.out.print(work + " ");
		}
		System.out.println();

		BubbleSort(a);
		
		for(int work:a){
			System.out.print(work + " ");
		}
	}
}
