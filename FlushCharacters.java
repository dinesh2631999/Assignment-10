package strings;

public class FlushCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="cogniz$#45Ant";
		String s2=getvalues(s1);
		System.out.println(s2);
	}
	
	public static String getvalues(String s1)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s1.length();i++)
		{
			char a=s1.charAt(i);
			if(!Character.isAlphabetic(a))
				sb.append(a);
		}
		return sb.toString();
	}

	

}
