// Last updated: 7/30/2025, 9:20:27 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       Queue<Integer> que = new LinkedList();

       for( int st : students){
        que.add(st);
       } 

       int queSize = que.size(); 
       int count = 0 ;
       for(int i=0 ; i<sandwiches.length ; i++){  
        int currentSand =  sandwiches[i];
        for(int j=0 ; j<que.size() ; j++){
            int queremove = que.remove();
            if(currentSand == queremove){
                count=0;
                break;
            }else{
                que.add(queremove);
                count++;
            }
        }
        if(count>=que.size()){
            return que.size();
        }
       }

       return que.size();
    }

}