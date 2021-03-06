
public class Rec {

	/**
	 * = number of the digits in the decimal representation of n. e.g.
	 * numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2. numDigits(1356) =
	 * 4. Precondition: n >= 0.
	 */
	/** = number of the digits in the decimal representation of n.
		e.g. numDigits(0) = 1, numDigits(3) = 1, numDigits(34) = 2.
		numDigits(1356) = 4.
		Precondition: n >= 0. */
    public static int numDigits(int n) {
	
	// fill me in
    	 if (n > -10 && n < 10) {
    	        return 1;
    	    } else {
    	        return numDigits(n / 10) + 1;
    	    }
    }
    

    /** = sum of the digits in the decimal representation of n.
      e.g. sumDigits(0) = 0, sumDigits(3) = 3, sumDigits(34) = 7,
      sumDigits(345) = 12.
      Precondition: n >= 0. */
	public static int sumDigits(int n) {

		// String sum = Integer.toString(n);
		// String[] array = sum.split("");
		// int ans = 0;
		// for(int i = 0 ; i < array.length ; i++){
		// ans += Integer.parseInt((array[i]));
		// }
		// return ans;

		// recursive
		int ans = 0;
		if (n >= 10) {
			ans += (n % 10) + sumDigits(n / 10);
		}
		if (n < 10 && n >= 0) {
			ans += n;
		}
		return ans;
	}

	/**
	 * = a copy of s with to_remove_char removed. Example: removeChar("abeabe",
	 * 'e') = "abab".
	 */

    
  
	
    /** = a copy of s with to_remove_char removed.
		Example: removeChar("abeabe", 'e') = "abab". */

	public static String removeChar(String s, char to_remove_char) {
		String c = to_remove_char + ""; 
		if(s.indexOf(c) >= 0){
			return removeChar(s.replace(to_remove_char + "", ""),to_remove_char);
		}else
			return s;
	}

	/**
	 * = a copy of s with characters in reverse order. Example:
	 * reverse("abcdefg") = "gfedcba".
	 */
	public static String reverse(String s) {
	String result = "" ;
	for ( int i = s.length()-1 ; i>=0 ; i-- ) {
		result = result + s.charAt(i) ;
	}
	return result ;
	}

	public static void main(String[] args) {
		System.out.println(numDigits(123));
		System.out.println(numDigits(123456));
		System.out.println(numDigits(1));
		System.out.println(numDigits(0));
		System.out.println("-----------------");
		System.out.println(sumDigits(123));
		System.out.println(sumDigits(123456));
		System.out.println(sumDigits(1));
		System.out.println(sumDigits(0));
		System.out.println("-----------------");
		System.out.println(removeChar("eawabbcceccddeeaaeeeee", 'e'));
		System.out.println(removeChar("acacacacac", 'a'));
		System.out.println("-----------------");
		System.out.println(reverse("aaabbbaccabda"));
		System.out.println(reverse("abbcccdeaaa"));
		System.out.println(reverse("AMANAPLANACANALPANAMA"));
	}

}
