package implementation;

import java.util.Scanner;

public class BetweenTwoSets {
	//问题转化为求a中元素的最小公倍数和b中元素的最大公约数。
	static int getTotalX(int[] a, int[] b) {
		int minCommonMultiple = a[0];
		for(int i = 1;i < a.length;i++){
			minCommonMultiple = getMinCommonMultiple(minCommonMultiple, a[i]);
		}
		
		int maxCommonDivisor = b[0];
		for(int i = 1;i < b.length;i++){
			maxCommonDivisor = getMaxCommonDivisor(maxCommonDivisor, b[i]);
		}
		
		int count = 0;
		for(int i = 1;minCommonMultiple * i <= maxCommonDivisor;i++){
			if(maxCommonDivisor % (minCommonMultiple * i) == 0)count++;
		}
		return count;
    }
	
	static int getMaxCommonDivisor(int a, int b){
		int smaller = a > b ? b : a;
		int bigger = a > b ? a : b;
		int remainder = bigger % smaller;
		while(remainder != 0){
			bigger = smaller;
			smaller = remainder;
			remainder = bigger % smaller;
		}
		return smaller;
	}
	
	static int getMinCommonMultiple(int a, int b){
		int maxCommonDivisor = getMaxCommonDivisor(a, b);
		return a / maxCommonDivisor * b / maxCommonDivisor * maxCommonDivisor;//防止溢出。
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
