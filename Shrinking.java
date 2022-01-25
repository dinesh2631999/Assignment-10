package strings;

public class Shrinking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sachin Ramesh Tendulkar";
		String s=getFormatedString(str);
		System.out.println(s);

	}
	
	public static String getFormatedString(String str1)
	{
		String[] array=str1.split(" ");
		StringBuffer buffer=new StringBuffer();
		char[] c=new char[3];
		
		for(int i=0;i<array.length;i++)
		{
			if(i<=1)
			{
				c[i]=array[i].charAt(0);
			}
		}
		for(int i=0;i<array.length;i++)
		{
			if(i==2)
			{
				buffer.append(array[i]);
			}
		}
		if(true)
		{
			buffer.append(" ").append(c[0]).append(".").append(c[1]);
		}
		return buffer.toString();
	}

}
