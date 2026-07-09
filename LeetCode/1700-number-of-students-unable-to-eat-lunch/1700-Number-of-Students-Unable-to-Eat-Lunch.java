class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int sandwich = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(students[i]);
        }
        int count=0;
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[sandwich]){
                q.remove();
                sandwich++;
                count=0;
            }else{
                count++;
                if(count>q.size()){
                    break;
                }
                q.add(q.remove());
            }
        }
        return q.size();
    }
}