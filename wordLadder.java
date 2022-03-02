class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> dic = new HashSet<>(wordList);
       if(!dic.contains(endWord))
        return 0;
        
       Queue<String> q = new LinkedList<>();
       q.offer(beginWord);
       int level = 0; 
        while(!q.isEmpty()){
            int size=q.size();
             level++;
             if(q.contains(endWord))
             return level;
             //System.out.println(level);
             for(int f=0;f<size;f++){
                 String s = q.poll();
                 StringBuffer sb = new StringBuffer(s);
                 for(int i=0;i<s.length();i++){
                     for(char j ='a';j<='z';j++){
                         sb.setCharAt(i,j);
                         if(dic.contains(sb.toString())){
                             q.offer(sb.toString());
                             dic.remove(sb.toString());
                         }
                     }
                     sb.setCharAt(i,s.charAt(i));
                 }
             }
        }
        return 0;
        
    }
}
