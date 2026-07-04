class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                ans.push(s.charAt(i));
            }else{
                if(ans.isEmpty()){
                    return false;
                }
                if(s.charAt(i)==')' && ans.peek()!='('){
                    return false;
                }
                if(s.charAt(i)=='}' && ans.peek()!='{'){
                    return false;
                }
                if(s.charAt(i)==']' && ans.peek()!='['){
                    return false;
                }
                ans.pop();
            }
        }
        return ans.isEmpty();
    }
}