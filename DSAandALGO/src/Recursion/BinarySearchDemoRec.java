package Recursion;

public class BinarySearchDemoRec {

	public static void main(String[] args) {
		int arr[]= {1,4,3,5,6,7,8,10,9,11,12,13,19};
		int n=10;
		int i=0,j=arr.length-1;
		int index=binarySearch(arr,i,j,n);
		if(index>1)
			System.out.println("found at index : "+ index);
		else
			System.out.println("Not Found");

	}

	private static int binarySearch(int[] arr,int i, int j, int n) {
		
		if(i>j)
			return -1;
		else
		{
			int mid=(i+j)/2;
			if(arr[mid]==n)
				return mid;
			else if(arr[mid]<n)
				return binarySearch(arr,mid+1,j,n);
			else
				return binarySearch(arr,i,mid-1,n);
		}
		
	}

}
