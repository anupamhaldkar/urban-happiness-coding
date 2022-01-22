public static int findSmallestDivisor(String s, String t) {
    if (s.length < t.length) return -1;
    
    int ans = t.length();
    String res = s.replaceAll(t, "");
    if (!res.length() == 0) return -1;
    
    for (int i = t.length; i >= 0; i--) {
       String sub = t.substring(0, i);
       String rep = t.replaceAll(sub, "");
       if (rep.length == 0) {
           ans = Math.min(ans, sub.length());
       }
    }
    return ans;
}

//mathworks-DivisiblityOfStrings
