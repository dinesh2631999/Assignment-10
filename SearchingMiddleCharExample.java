package strings;

import java.util.Scanner;

public class SearchingMiddleCharExample {
	
	public static String getMiddleChars(String str)
	{
	StringBuffer sb=new StringBuffer();
	if(str.length()%2==0)
	{
	sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
	}
	return sb.toString();
	}
//this 
	public static void main(String[] args) {
	Scanner sn=new Scanner(System.in);
	String str=sn.next();
	sn.close();
	//System.out.println(str.length());
	str=getMiddleChars(str);
	System.out.println(str);

	}
}
