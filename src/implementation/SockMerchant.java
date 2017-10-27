package implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i < n;i++) {
			int color = ar[i];
			if(set.contains(color)) {
				set.remove(color);
			}else {
				set.add(color);
			}
		}
		return (n - set.size()) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
