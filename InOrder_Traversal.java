class Solution {
      ArrayList<Integer> list=new ArrayList<>();
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        
        traversal(root);
        return list;
        
    }
    void traversal(Node root){
        if(root==null){
            return;
        }
        
        traversal(root.left);
        list.add(root.data);
        traversal(root.right);
    }
}