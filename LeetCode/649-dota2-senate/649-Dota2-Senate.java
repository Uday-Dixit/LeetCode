class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R'){
                radiant.add(i);
            }else{
                dire.add(i);
            }
        }
        while(radiant.size()!=0 && dire.size()!=0){
            if(radiant.peek()<dire.peek()){
                radiant.add(radiant.remove()+n);
                dire.remove();
            }else{
                dire.add(dire.remove()+n);
                radiant.remove();
            }
        }
        return radiant.size()==0?"Dire":"Radiant";
    }
}
// [R,D,R,D,R]
// R[0,2,4]
// D[3]