package strings;

import java.util.Scanner;

public class ReverseString {
	public static String reverseSubstring(String str,int index1,int length)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		str=sb.toString();
		return str.substring(index1, (index1+length));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the string");
		String msg=sn.next();
		System.out.println("Enter the starting index");
		int index=sn.nextInt();
		System.out.println("Enter the length of the selected string");
		int len=sn.nextInt();
		//msg.length();
		//ReverseString a=new ReverseString();
		System.out.println(ReverseString.reverseSubstring(msg, index, len));
	}

}
