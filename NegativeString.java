package strings;

import java.util.Scanner;

public class NegativeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the sentence which contains is :");
		String str=sn.nextLine();
		String s=negativeString(str);
		System.out.println(s);

	}
	
	public static String negativeString(String str1)
	{
		String[] array=str1.split(" ");
		StringBuffer buffer=new StringBuffer();
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i].equals("is"))
			{
				array[i]="is not";
			}
		}
		for(String str2 : array)
		{
			buffer.append(str2);
		}
		return buffer.toString();
	}

}
