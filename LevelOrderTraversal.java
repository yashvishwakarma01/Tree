class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.offer(node);
        while(q.size()>0){
            Node n=q.poll();
            list.add(n.data);
            if(n.left!=null){
                q.offer(n.left);
            }
            if(n.right!=null){
                q.offer(n.right);
            }
        }
        return list;
    }
}
