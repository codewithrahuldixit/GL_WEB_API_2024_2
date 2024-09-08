package LVC_02;

public class Sorting {
	public static void SelectionSort(int arr[]) {
		int position;
		for(int i = 0 ; i<arr.length;i++) {
			position = minimum(arr,i,arr.length-1);
				if(position > i)
					swap(arr, position, i);			
		}
	}
	public static int minimum(int[] arr, int i, int j) {
		int pos=i;
		for (int k = i; k<=j;k++ )
			if(arr[k]<arr[pos])
				pos=k;
		return pos;
	}
	
	public static boolean sequentialsearch(int [] arr,int item) {
		for (int i=0;i<arr.length;i++)
			if(arr[i]==item)
				return true;
		return false;
	}

	public static boolean binarySearch(int [] arr,int item) {
		int beg = 0;
		int end = arr.length-1;
		int mid = 0;

		if(beg>end)
			return false;
		do {
			mid = beg + ((end-beg)/2);
			if(arr[mid]==item)
				return true;
			else if(arr[mid]>item)
				end=mid-1;
			else
				beg=mid+1;
		}while(beg<=end);
		return false;
		
	}
	
	public static void BubbleSort(int arr[]) {
		
		for(int i = arr.length-1; i>=0;i--)
			for(int j=0;j<i;j++)
				if(arr[j]>arr[j+1])
					swap(arr,j,j+1);		
	}
	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
	}
}
