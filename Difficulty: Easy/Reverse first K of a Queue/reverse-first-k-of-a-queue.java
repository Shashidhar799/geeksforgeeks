class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> st=new Stack<>();
        if(k>q.size()) return q;
        for(int i=0;i<k;i++){
            st.push(q.poll());
        }
        for(int i=0;i<k;i++){
            q.offer(st.pop());
        }
        for(int i=0;i<q.size()-k;i++){
            q.offer(q.poll());
        }
        return q;
    }
}