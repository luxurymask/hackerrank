package implementation;

import java.util.Scanner;

public class BreakingTheRecords {
	static int[] getRecord(int[] s){
		if(s.length == 0) return new int[]{0, 0};
		int max = s[0], min = s[0];
		int maxCount = 0, minCount = 0;
		for(int i = 1;i < s.length;i++){
			int score = s[i];
			if(max < score){
				maxCount++;
				max = score;
			}
			if(min > score){
				minCount++;
				min = score;
			}
		}
		
		return new int[]{maxCount, minCount};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
