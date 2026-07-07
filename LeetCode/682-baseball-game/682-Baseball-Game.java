class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> s = new Stack<>();
        for(String i :operations){
            if(i.equals("+")){
                int x = s.pop();
                int y = s.peek();
                s.push(x);
                s.push(x+y);
            }else if(i.equals("C")){
                s.pop();
            }else if(i.equals("D")){
                s.push(s.peek()*2);
            }else{
                s.push(Integer.parseInt(i));
            }
        }
        int ans=0;
        while(!s.isEmpty()){
            ans+=s.peek();
            s.pop();
        }
        return ans;
    }
}