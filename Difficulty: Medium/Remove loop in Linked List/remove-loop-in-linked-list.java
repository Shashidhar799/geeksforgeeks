/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node s=head;
        Node f=head;
        boolean flag=false;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                flag=true;
                break;
            }
        }
        
        if(flag){
            s=head;
            if(s==f){
                while(f.next!=s){
                    f=f.next;
                }
                f.next=null;
            }
            else{
                while(s.next!=f.next){
                    f=f.next;
                    s=s.next;
                }
                f.next=null;
            }
        }
    }
}