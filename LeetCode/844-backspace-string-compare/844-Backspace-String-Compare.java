class Solution {
    public boolean backspaceCompare(String s, String t) {

        char[] sCopy = s.toCharArray(); 
        char[] tCopy = t.toCharArray(); 

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char i : sCopy){
            if(i=='#'){
                if(!s1.isEmpty()){
                    s1.pop();
                }
            }else{
                s1.push(i);
            }
        }
        for(char i : tCopy){
            if(i=='#'){
                if(!s2.isEmpty()){
                    s2.pop();
                }
            }else{
                s2.push(i);
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop()!=s2.pop()){
                return false;
            }
        }
        return s1.isEmpty() && s2.isEmpty();
    }
}