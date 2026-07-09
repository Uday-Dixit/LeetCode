class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        int count0=0;
        int count1=0;

        for(int i=0;i<n;i++){
            if(students[i]==0){
                count0++;
            }else{
                count1++;
            }
        }

        for(int i=0;i<n;i++){
            if(count0==0 && sandwiches[i]==0 || count1==0 && sandwiches[i]==1){
                break;
            }
            if(sandwiches[i]==0){
                count0--;
            }else{
                count1--;
            }
        }
        return count0+count1;
    }
}