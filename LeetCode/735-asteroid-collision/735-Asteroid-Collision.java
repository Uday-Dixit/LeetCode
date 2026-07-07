class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++){
            boolean alive = true;
            int curr = asteroids[i];
            while(!s.isEmpty() && curr<0 && s.peek()>0){
                if(s.peek()>curr*(-1)){
                    alive=false;
                    break;
                }else if(s.peek()==curr*(-1)){
                    alive=false;
                    s.pop();
                    break;
                }else{
                    s.pop();
                }
            }
            if(alive){
                s.push(curr);
            }
        }
        int n1=s.size();
        int[] ans = new int[n1];
        for(int i=n1-1;i>=0;i--){
            ans[i]=s.peek();
            s.pop();
        }
        return ans;
    }
}