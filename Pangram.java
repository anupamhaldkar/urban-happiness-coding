 public static String pangrams(String s) {
    // Write your code here
       
        int[] ch = new int[26];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
            continue;
            if(s.charAt(i)>=97)
            ch[s.charAt(i)-'a']++;
            else
            ch[s.charAt(i)-'A']++;
        }
        
        for(int i=0;i<26;i++){
            if(ch[i]==0)
            return "not pangram";
        }
        return "pangram";
    }
