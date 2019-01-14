package leetcode;

public class WildcardMatchingIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildcardMatchingIterative wcm = new WildcardMatchingIterative();
		String s = "aa";//aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba";
		String p = "a";//*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*";
		System.out.println(wcm.isMatch(s, p));

	}
	
	public boolean isMatch(String s, String p) {
		// while s (string pointer) not reached end, do the following
			// Trick is for '*'
			// So, what we do here is that we increment store the current value of p (pattern pointer) in p0
			// also, we store the value of next s (string pointer) in s0
			// now, we increment the s and p when both s and p are same or p is '?'
			// we increment s0 and save it in s if p0 is not reached end
			// we restore p0 to p if p0 is not reached end
			// else we return false - this means that p has reached end but s has not or there is a mismatch between the characters of p and s when both are neither * nor ?
		// if both p and s reached end, return true, else return false;
		
		int sp = 0;
		int pp = 0;
		int s0 = -1;
		int p0 = -1;
		while (sp < s.length()) {
			// if (both match or pp is '?')
			if (pp < p.length() && (s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')) {
				sp++;
				pp++;
			}
			
			// if (pp is *)
			else if (pp < p.length() && p.charAt(pp) == '*') {
				// store pp and sp in s0 and p0 respectively where p0 is ++pp;
				p0 = pp++;
				s0 = sp;
			}
			
			// if (there is a * found in one of the previous iteration)
			else if(p0 != -1) {
				// Load the next s0 and p0 to sp and pp respectively
				pp = p0;
				sp = ++s0;
			}
			
			// default condition when none of up is true and sp is not yet finished processing
			else {
				return false;
			}
		}
		
		while (pp < p.length() && p.charAt(pp) == '*') pp++;
		return sp == s.length() && pp == p.length();
    }
	
    
}
