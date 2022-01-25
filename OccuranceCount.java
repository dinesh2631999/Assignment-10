package strings;

import java.util.Scanner;

public class OccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scanner.nextLine();
		System.out.println("Enter the word to search for count occurance");
		String str1=scanner.next();
		GetOccaranceCount(str,str1);
	}
	
	public static void GetOccaranceCount(String str,String str1)
	{
		int count=0;
		String[] s=str.split(" ");
		for(int i=0;i<s.length;i++)
			{
			  	if(s[i].equals(str1))
			  	{
			  		count++;
			  	}
			}
		System.out.println("no. of times = "+count);
		
		
	}

}
