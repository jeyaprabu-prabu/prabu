package JCF_Type_conversion;

public class using_parsing_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Parsing means conversion of String which is made of numeric char into numbers
		String s = "100";
		// String to Integer
		Integer i = Integer.parseInt(s);
		System.out.println(s + 10); // concat
		System.out.println(i+10); // add

		// String to Double
		Double d = Double.parseDouble(s);
		System.out.println(d + 10); // add
		// String to Char 
		String y ="A";
		Character  c = y.charAt(0);
		System.out.println(c); // add

	}

}
