/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public List<Integer> noSibling(Node root) {
        // code here
        List<Integer> res=new ArrayList<>();
        findSibling(root,res);
        Collections.sort(res);
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
    private void findSibling(Node node,List<Integer> res){
        if(node==null)return;
        if(node.left!=null && node.right==null){
            res.add(node.left.data);
        }
        if(node.left==null && node.right!=null){
            res.add(node.right.data);
        }
        findSibling(node.left,res);
        findSibling(node.right,res);
    }
}