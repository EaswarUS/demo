package demo;

public class LearnString {
	public static String str1(String str) {
		str = str + "buffer";
	return str;
	}

	public static void main(String[] args) {
		LearnString an = new LearnString();
		String sdt = new String("hello");
		String str1 = an.str1(sdt);
		System.out.println(str1);
		 String s ="abc";
		 StringBuilder as =new StringBuilder("JAva");
		 StringBuilder sa = as.append('a');
		 String s2 = "";
		 char[] data = {'a','b','c'};
		 String s1 = new String(data);
		 s = s + "hi";
		 System.out.println(s);
		 System.out.println(s1);
		 for (int i = 0; i < data.length; i++) {
			s2 = s2+data[i]+"";
		}
		 System.out.println(s2.equals(s1));

	}

}
