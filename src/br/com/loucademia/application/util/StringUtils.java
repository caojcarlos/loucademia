package br.com.loucademia.application.util;

public class StringUtils {
	public static boolean isEmpty(String s) {
		if (s == null) {
			return true;
		}
		return s.trim().length() == 0;
	}
	 public static String leftZero(int value, int finalSize ) {
		 return String.format("%0" + finalSize + "d", value);
		 
	 }
	
	public static void main(String[] args) {
		String str = "  1  ";
		boolean b = StringUtils.isEmpty(str);
		System.out.println(b);
		
		int v = 123;
		
		System.out.println(StringUtils.leftZero(v, 6));
				
	}
}
