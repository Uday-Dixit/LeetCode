class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int seconds=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(tickets[k]!=0){
            int curr = q.remove();
            tickets[curr]--;
            if(tickets[curr]>0){
                q.add(curr);
            }
            seconds++;
        }
        return seconds;
    }
}