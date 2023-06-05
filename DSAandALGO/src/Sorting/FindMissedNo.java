package Sorting;

public class FindMissedNo {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6,7,8,9,10};
		int l=10;
		int missedNumber=findMissed(arr,l);
		System.out.println("Missed Number of Series : "+missedNumber);
		
	}

	private static int findMissed(int[] arr, int l) {
		
		int exp_sum =l*(l+1)/2;
		int real_sum = 0;
		for(int i:arr) {
			real_sum+=i;
		}
		return exp_sum-real_sum ;
	}

}
