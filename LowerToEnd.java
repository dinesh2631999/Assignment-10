package strings;

import java.util.Scanner;

public class LowerToEnd {//97 to 122

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the sequence of character with small x");
		String str=scanner.next();
		GetLowerCasetoEnd(str);

	}
	public static void GetLowerCasetoEnd(String str)
	{
		int j=0;
		char[] ch=str.toCharArray();
		StringBuffer buffer=new StringBuffer();
		char[] ch2=new char[10];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='x')
			{
				
				ch2[j]=ch[i];
				j++;
			}else {
			buffer.append(ch[i]);
			}
		}
		for(int k=0;k<ch2.length;k++)
		{
			buffer.append(ch2[k]);
		}
		System.out.println(buffer);
	}

}
