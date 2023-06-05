package precticedemo;

public class FindSecondLargestValueDemo {

	public static void main(String[] args) {
		int[] arr= {3,5,8,9,7,33,55,44,98,65,45};
		int largest=0;
		int secondLargest=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
				
			}
		}
		
		System.out.println("Second Largest Value= "+secondLargest);
		System.out.println("Largest Value= "+largest);

	}

}
