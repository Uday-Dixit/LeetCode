class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                s.push(Integer.parseInt(tokens[i]));
            }else if(tokens[i].equals("+")){
                int a = s.pop();
                int b = s.pop();
                int x = a+b;
                s.push(x);
            }else if(tokens[i].equals("-")){
                int a = s.pop();
                int b = s.pop();
                int x = b-a;
                s.push(x);
            }else if(tokens[i].equals("*")){
                int a = s.pop();
                int b = s.pop();
                int x = a*b;
                s.push(x);
            }else if(tokens[i].equals("/")){
                int a = s.pop();
                int b = s.pop();
                int x = b/a;
                s.push(x);
            }
        }
        return s.peek();
    }
}