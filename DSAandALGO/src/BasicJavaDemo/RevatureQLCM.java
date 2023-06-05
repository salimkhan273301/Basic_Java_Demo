package BasicJavaDemo;

public class RevatureQLCM {

	public static int hcfFunc(int a, int b) {
		int low = a > b ? b : a;
		int result1 = 0;
		for (int i = 1; i <= low; i++) {
			if (a % i == 0 && b % i == 0) {
				result1 = i;
			}
		}
		return result1;
	}

	public static void LCM(int N, int[] A, int[] B) {

		// this is default OUTPUT. You can change it.
		int result = 0;
		int lcm;

		// write your Logic here:
		for (int i = 0; i < N; i++) {

			int hcf = hcfFunc(A[i], B[i]);

			lcm = ((A[i] * B[i]) / hcf);

			if (lcm > result) {
				result = lcm;
			}
		}
		for (int i = 0; i < N; i++) {
			if (A[i] * B[i] >= result) {
				System.out.println(A[i] + " " + B[i]);
				break;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 15, 1, 2, 213, 41, 5, 12, 13, 1, 14 };
		int arr1[] = { 1, 7, 29, 21, 41, 69, 12, 31, 9, 4 };

		LCM(arr.length, arr, arr1);

	}

}
