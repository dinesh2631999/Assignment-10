package strings;

public class LongShortLong {
	public static void main(String[] arg) {
		 String s1="hi";
		 String s2="Hello";
		 System.out.println(capsStart(s1,s2));
		}
		
		public static String capsStart(String s1 , String s2){
		StringBuffer s5=new StringBuffer();
		 int q = s1.length();
		 int w = s2.length();
		 if(q>w)
		 {
		    s5.append(s1).append(s2).append(s1);
		 }
		 else
		 {
		    s5.append(s2).append(s1).append(s2);
		 }
		    return s5.toString();
		}

}
