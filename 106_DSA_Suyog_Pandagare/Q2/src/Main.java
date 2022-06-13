
public class Main {

	public static void main(String[] args) {

		Number num = new Number();
		int []arr = new int[] {5, 16, 7, 3, 1, 11, 29, 18, 20, 25};
	
		System.out.println("The Original Array Is: ");
		Sort.print(arr);
		Sort.quickSort(arr, 0, arr.length-1);
		System.out.println("Array after Sorting Is: ");
		Sort.print(arr);
	
	}

}
