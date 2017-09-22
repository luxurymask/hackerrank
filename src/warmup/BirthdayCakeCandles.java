package warmup;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
		if(n == 0) return 0;
		PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		});
		for(int i = 0;i < n;i++){
			heap.add(ar[i]);
		}
		int max = heap.poll();
		int count = 1;
		while(!heap.isEmpty() && heap.poll() == max){
			count++;
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
