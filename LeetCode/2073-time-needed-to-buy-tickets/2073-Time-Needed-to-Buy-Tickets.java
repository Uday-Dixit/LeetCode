class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int second=0;
        for(int i=0;i<tickets.length;i++){
            if(i>k){
                second=second+Math.min(tickets[i],tickets[k]-1);
            }else{
                second=second+Math.min(tickets[i],tickets[k]);
            }
        }
        return second;
    }
}