package implementation;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] array = in.next().toCharArray();
		boolean flag = false;
		int height = 0;
		int result = 0;
		for(int i = 0;i < n;i++) {
			char c = array[i];
			if(c == 'U') height++;
			else height--;
			//better way.
			if(height == 0 && c == 'U') result++;
//			if(flag == false && height < 0) {
//				flag = true;
//			}else if(flag == true && height == 0) {
//				result++;
//				flag = false;
//			}
		}
		System.out.print(result);
	}
}
