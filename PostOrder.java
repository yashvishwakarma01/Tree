class Tree
{
    ArrayList<Integer> list=new ArrayList<>();
    ArrayList<Integer> postOrder(Node root)
    {
        traversal(root);
        return list;
    }
    
    void traversal(Node root){
        
        if(root==null){
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.data);
    }
}
