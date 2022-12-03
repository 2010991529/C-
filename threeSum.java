class threeSum {
	boolean find3Numbers(int A[], int arr_size, int sum){
		int l, r;
		for (int i = 0; i < arr_size - 2; i++) {
			for (int j = i + 1; j < arr_size - 1; j++) {
				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.print("Triplet is " + A[i] + ", " + A[j] + ", " + A[k]);
						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args){
		threeSum triplet = new threeSum();
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		triplet.find3Numbers(A, arr_size, sum);
	}
}
