class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node==null){
            return 0;    // 0 for if we consider root height as 1 ,in case of edge we return -1
        }
        int left=height(node.left);
        int right=height(node.right);
        int max=Math.max(left,right);
        return max+1;
    }
}
