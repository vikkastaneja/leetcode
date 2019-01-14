package leetcode;

public class WildcardMatchingNaive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildcardMatchingNaive wcm = new WildcardMatchingNaive();
		String s = "aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba";
		String p = "*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*";
		System.out.println(wcm.isMatch(s, p));

	}
	
	public boolean isMatch(String s, String p) {
        return isMatch(s, p, 0, 0);
    }
    
    private boolean isMatch(String s, String p, int si, int pi) {
        if (pi == p.length()) return si == s.length();
        
        char pc = p.charAt(pi);
        if (pc == '*') return isMatch(s, p, si, pi + 1) || (si < s.length() && isMatch(s, p, si + 1, pi)) ;
        
        if (si < s.length() && (s.charAt(si) == pc || pc == '?') ) {
	        return isMatch(s, p, si + 1, pi + 1);
        }
        
        return false;
    }
    
}
