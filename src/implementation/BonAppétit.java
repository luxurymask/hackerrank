package implementation;

import java.util.Scanner;

public class BonAppétit {
	static double bonAppetit(int n, int k, int b, int[] ar) {
		double sum = 0d;
		for(int i = 0;i < n;i++){
			if(i != k) sum += ar[i];
		}
		return (b - sum / 2d);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        double result = bonAppetit(n, k, b, ar);
        if(result == 0d){
        	System.out.println("Bon Appetit");
        }else{
        	System.out.println((int)result);
        }
    }
}
