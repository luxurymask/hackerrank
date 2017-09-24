package implementation;

import java.util.Scanner;

public class AppleAndOrange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int apple = 0;
        for(int i = 0;i < m;i++){
        	int num = a + in.nextInt();
        	if(num >= s && num <= t) apple++;
        }
        int orange = 0;
        for(int i = 0;i < n;i++){
        	int num = b + in.nextInt();
        	if(num >= s && num <= t) orange++;
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
