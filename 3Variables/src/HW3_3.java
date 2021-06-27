
public class HW3_3 {
	public static void main(String[] arg) {
		
		/* Byte
		 * Maximum value 127
		 * Minimum value -128
		 */
		
		byte a = 81;
		
		/* Short
		 * Maximum value 32,767
		 * Minimum value -32,768 
		 */
		
		short b = 1941;
		
		/* Int 
		 * Maximum value 2,147,483,647
		 * Minimum value -2,147,483,648
		 */
		
		int c = 149;
		
		/* Long
		 * Maximum value 9,223,372,036,854,775,807
		 * Minimum value -9,223,372,036,854,775,808
		 */
		
		long d = 500000000;
		
		/* Float
		 * 32-bit
		 */
		
		float e = 3.14f;
		
		/* Double
		 * 64-bit
		 */
		
		double f = 107.7;
		
		/* Boolean
		 * True/False
		 */
		
		boolean g = true;
		
		/* Char
		 * Minimum value /u0000 (0)
		 * Maximum value /uffff (65,535 inclusive)
		 */
		
		char h = 63;		 
				 
		System.out.println("Person A is " + a + " years old.");
		System.out.println("He was born in the year " + b + ".");
		System.out.println("He has appeared in " + c + " films."); 
		System.out.println("He has an estimated net worth of $" + d + ".");
		System.out.println("He also has a penny collection worth " + e + "."); 
		System.out.println("His favorite radio station is " + f + "FM."); 
		System.out.println("This means all the rumors about him were " + g + ".");
		System.out.println("Any questions" + h + " If so, please contact email@mailer.com!");
		
	}
}
