package strings;

import java.util.Scanner;

class UserMainCode
{
	
	public static void formString(String[] buff)
	{
		/*char s='$';
	try
	{
		for(String sg : str)
		{
			char[] ch=sg.toCharArray();
			
		 for(int i=0;i<n1;i++)
		 {
			 if(i==n1-1)
			 {
				 if(ch[i]>='a'&&ch[i]<='z')
				 {
					 System.out.print(ch[i]);
				 }else if(ch[i]==0)
				 {
					 System.out.print(s); 
				 }
			 }
		 }
		
		}
	}
	catch(StringIndexOutOfBoundsException ex)
	{
		 System.out.print(s);
	}*/
	 char c='$';
	  try {
	  for(String s : buff)
	  {
		  if(s.charAt(2)== 0)
		  {
			  System.out.print(c);
		  }
		  System.out.print(s.charAt(2));
	  }
	  }
	  catch(StringIndexOutOfBoundsException ex)
	  {
		  System.out.print(c);
	  }
	}


}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length : ");
		int num=scan.nextInt();
		String[] str=new String[num];
		String s;
		
		for(int i=0;i<str.length;i++)
		{
			s=scan.next();
			str[i]=s;
		}
		System.out.println("Enter the nth element position : ");
		int n=scan.nextInt();
		UserMainCode.formString(str,n);*/
		Scanner sn=new Scanner(System.in);
		String[] buffer=new String[4];
		String str;
	    
		
		for(int i=0;i<buffer.length;i++)
		{
			System.out.println("Enter the string in 3 letter : ");
             str=sn.next();
			buffer[i]=str;
		}
		
		UserMainCode.formString(buffer);

	}
		
	}

	
