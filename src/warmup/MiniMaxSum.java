package warmup;

import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long first = in.nextInt();
        long max = first, min = first;
        long maxSum = 0, minSum = 0;
        for(int i = 0;i < 4;i++){
        	long num = in.nextInt();
        	if(max < num){
        		minSum += max;
        		max = num;
        	}else{
        		minSum += num;
        	}
        	if(min > num){
        		maxSum += min;
        		min = num;
        	}else{
        		maxSum += num;
        	}
        }
        
        System.out.println(minSum + " " + maxSum);
    }
}
