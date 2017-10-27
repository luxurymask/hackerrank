package implementation;

import java.util.Scanner;

public class DrawingBook {
	static int solve(int n, int p){
		if(p <= n / 2) return p / 2;
		//better way.
		return n / 2 - p / 2;
//		if((n & 1) == 0) return (n - p + 1) / 2;
//		return (n - p) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
