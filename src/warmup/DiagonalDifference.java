package warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		int[] array = new int[n];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				array[j] = in.nextInt();
			}
			result += (array[i] - array[n - 1 - i]);
		}
		System.out.println(Math.abs(result));
    }
}
