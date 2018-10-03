public class Merge2Lists {

	public static int[] Merge(int[] A, int[] B) {
		int size = (A.length + B.length);
		int[] C = new int[size];

		// i = index for A, j = index for B, k = index for C
		for (int i = 0, j = 0, k = 0; k < size; k++) {
			if(A[i] <= B[j]) {
				C[k] = A[i];
				System.out.println("1st " + i + " " + j + " " + k + " " + A[i] + " " + B[j] + " " + C[k]);
				i++;
			}
			else {
				C[k] = B[j];
				System.out.println("2nd " + i + " " + j + " " + k + " " + A[i] + " " + B[j] + " " + C[k]);
				j++;
			}
			System.out.println("3rd " + i + " " + j + " " + k + " " + A[i] + " " + B[j] + " " + C[k]);
		}
		return C;
	}

	public static void main(String[] args) {
		int[] sortedListA = {2, 4, 6, 10, 11, 12, 13};
		int[] sortedListB = {1, 2, 4, 5};

		int[] newSortedList = Merge(sortedListA, sortedListB);


	}
}
