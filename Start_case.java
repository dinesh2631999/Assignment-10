package strings;

import java.util.Scanner;

public class Start_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scanner.nextLine();
		ChangeStartCase(str);
		

	}
	
	public static void ChangeStartCase(String str1)
	{
		
		String str3;
		char c1;
		String[] array=str1.split(" ");
		char[] c=new char[array.length];
		StringBuffer buffer=new StringBuffer();
		/*for(String str2 : array)
		{
			c1=str2.charAt(0);
			c1=Character.toUpperCase(c1);
			buffer.append(c1);
			str3=str2.substring(1);
			buffer.append(str3);
			System.out.print(buffer.toString());
		}*/
		for(int i=0;i<array.length;i++)
		{
			c1=array[i].charAt(0);
			c1=Character.toUpperCase(c1);
			buffer.append(c1);
			str3=array[i].substring(1);
			buffer.append(str3);
			int no=array[i].length();
			System.out.print(buffer.toString());
			System.out.print(" ");
			buffer.delete(0, no);
		}

}
}
