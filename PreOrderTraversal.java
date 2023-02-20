class BinaryTree
{  
     ArrayList<Integer> list=new ArrayList<>();
    static ArrayList<Integer> preorder(Node root)
    
    {  ArrayList<Integer> list=new ArrayList<>();
    
       traversal(root,list);
       return list;
    }
    
     static void traversal(Node node,ArrayList<Integer> list){
        if(node==null){
            return;
        }
        
        list.add(node.data);
        traversal(node.left,list);
        traversal(node.right,list);
    }

}
