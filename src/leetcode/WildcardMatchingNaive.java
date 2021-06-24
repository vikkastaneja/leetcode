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
        private boolean isMatchHelper(String s, String p, int si, int pi) {
        if (s.length() == si && p.length() == pi) return true;
        if (s.length() == si && pi < p.length()) {
            for (int i = pi; i < p.length(); i++) {
                if (p.charAt(i) != '*') return false;
            }
            
            return true;
        }
        
        if (p.length() == pi && si < s.length()) return false;

        if (p.charAt(pi) != '*') {
            if (p.charAt(pi) == s.charAt(si) || p.charAt(pi) == '?')
                return isMatchHelper(s, p, si + 1, pi + 1);
            else return false;
        } else {
            return isMatchHelper(s, p, si+1, pi) || isMatchHelper(s, p, si, pi + 1);
        }
		
    }
    }
    
}
