class Main {
	public static void main(String[] args) {
		int[] arr = new int[3];
		
		System.out.printf("arr.length : %d\n", arr.length);
		
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = i + 1;
		}
		
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.printf("(%d : %d), ", i, arr[i]);
		}
		System.out.println();
		
		int sum = 0;
		
		for ( int i = 0; i < arr.length; i++ ) {
			sum += arr[i];
		}
		
		int avg = sum / arr.length;
		
		String rs = String.format("sum : %d", sum);
		System.out.printf("[%s]\n", rs);
		System.out.printf("[avg : %d]\n", avg);
	}
}

