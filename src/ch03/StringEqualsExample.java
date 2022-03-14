package ch03;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strValue1 = "string";
		String strValue2 = "string";
		String strValue3 = new String("string");
		
		System.out.println(strValue1 == strValue2);
		System.out.println(strValue1 == strValue3);
		System.out.println();
		
		System.out.println(strValue1.equals(strValue2));
		System.out.println(strValue1.equals(strValue3));
	}
}
