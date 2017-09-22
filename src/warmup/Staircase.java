package warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = n;i > 0;i--){
			int j = 1;
			for(;j < i;j++) System.out.print(" ");
			for(;j <= n;j++) System.out.print("#");
			System.out.println();
		}
	}
}
