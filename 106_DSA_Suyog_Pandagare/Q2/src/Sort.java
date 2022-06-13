
public class Sort {

	public static void quickSort(int []arr, int l, int h)
	{
		if(l < h)
		{
			int pi = partition(arr, l, h);
			quickSort(arr, l, pi-1);
			quickSort(arr, pi+1, h);
		}
	}

	private static int partition(int [] arr, int l, int h)
	{
		int p=h;
		int j=l;
		int i=l-1;

		while(j != p)
		{
			if(arr[j] < arr[p])
			{
				i++;
				//swap arr[j], arr[i]
				int tmp=arr[j];
				arr[j]=arr[i];
				arr[i]=tmp;
			}
			j++;
		}
		i++;
		//swap arr[j], arr[i]
		int tmp=arr[j];
		arr[j]=arr[i];
		arr[i]=tmp;

		return i;
	}

	public static void print(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		System.out.println();
	}

}
