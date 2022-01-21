class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='[')
                stack.push(i);
            else{ if(stack.isEmpty())
                return false;
            else {
                char a = stack.pop();
                if(!((i==')'&&a=='(')||(i=='}'&&a=='{')||(i==']'&&a=='[')))
                    return false;
            
                 }
             }
        }
        return stack.isEmpty();
    }
}
