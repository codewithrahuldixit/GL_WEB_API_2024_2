package LVC_02;

public class MainDriver {
public static void main(String[] args) {
	int arr[]= {8,7,6,1,5,9,7,3};
	
	print(arr,"Before Sorting");
	//Sorting.SelectionSort(arr);
	System.out.println("If The value is \n True: Item is Present \n False : "
			+ "Item is Not Present \n and the Value is : "
			+ ""+Sorting.binarySearch(arr, 8));
	//print(arr,"After Sorting");
}

private static void print(int[] arr, String string) {
	
	System.out.println(string);
	System.out.print("[ ");
	for (int i : arr)
		System.out.print(" "+i+ "  ");
	System.out.println(" ]");
}
}
