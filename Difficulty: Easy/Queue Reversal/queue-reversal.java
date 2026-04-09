class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        if(q.isEmpty()){
            return;
        }
        int f=q.poll();
        reverseQueue(q);
        q.offer(f);
    }
    
}