/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        ArrayList<Node> inorderlist = new ArrayList<>();
        inorder(root,inorderlist);
        Node pred=null, succ=null;
        for(int i=0;i<inorderlist.size();i++){
            if(inorderlist.get(i).data<key){
                pred=inorderlist.get(i);
            }
            if(inorderlist.get(i).data>key && succ==null){
                succ=inorderlist.get(i);
            }
        }
        ArrayList<Node> res=new ArrayList<>();
        res.add(pred);
        res.add(succ);
        return res;
    }
    
    private void inorder(Node node,ArrayList<Node> list){
        if(node==null)
            return;
        inorder(node.left,list);
        list.add(node);
        inorder(node.right,list);
        
    }
}