package implementation;

import java.util.Scanner;

public class BirthdayChocolate {
	static int solve(int n, int[] s, int d, int m){
		int count = 0;
		if(m > n) return count;
		int dp = 0;
		for(int i = 0;i < m;i++){
			dp += s[i];
		}
		for(int i = m;i < n;i++){
			if(dp == d) count++;
			if(s[i] == s[i - m]) continue;
			dp += (s[i] - s[i - m]);
		}
		if(dp == d) count++;
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }
}
