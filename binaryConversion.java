import java.util.*;
import java.io.*;
public class binaryConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("1 for binary to decimal. 2 for decimal to binary");
		int input = Integer.parseInt(in.nextLine());
		if(input == 1) {
			System.out.println("Enter binary number: ");
			String bin = in.nextLine();
			System.out.println("decimal: " + binaryToDecimal(bin));
		}else {
			System.out.println("Enter decimal number: ");
			String d = in.nextLine();
      long dec = Long.parseLong(d);
			System.out.println("binary: " + decimalToBinary(dec));
		}
	}
	public static long binaryToDecimal(String bin) {
    if(bin.length() == 0){
      return 0; 
    }
		long ans = 0;
		long n = bin.length();
		char a = bin.charAt(0);
		bin = bin.substring(1);
		if(a == '0') {
			ans = (long)Math.pow(2, n);
		}
		return(ans += binaryToDecimal(bin));
	}
  public static String decimalToBinary(long num) {
		String ans = "";
		if(num == 0) {
			return "";
		}
		long a = num%2;
    ans = Long.toString(a);
		num = num/2;
		return(decimalToBinary(num) + ans);
	}
}
