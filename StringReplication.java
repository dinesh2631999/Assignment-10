package strings;

import java.util.Scanner;

public class StringReplication {
	public static String lengthiestString(String s1,int n){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		{
		sb.append(s1);
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string to replicate and no.of.times");
		String str=s.next();
		int n=s.nextInt();
		System.out.println(lengthiestString(str,n));
	}

}
