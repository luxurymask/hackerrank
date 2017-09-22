package warmup;

import java.util.Scanner;

public class TimeConversion {
	static String timeConversion(String s) {
		String apm = s.substring(8);
		String left = s.substring(2, 8);
		String hour = s.substring(0, 2);
		if(apm.equals("AM")){
			if(hour.equals("12")) return "00" + left;
			else return hour + left;
		}else{
			if(hour.equals("12")) return hour + left;
			else return (Integer.parseInt(hour) + 12) + left;
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
