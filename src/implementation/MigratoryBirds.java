package implementation;

import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
		int[] resultArray = new int[5];
		int max = 0;
		int result = 0;
		for(int i = 0;i < n;i++){
			int current = ar[i];
			resultArray[current - 1]++;
			if(resultArray[current - 1] > max || (resultArray[current - 1] == max && current < result)){
				max = resultArray[current - 1];
				result = ar[i];
			}
		}
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
