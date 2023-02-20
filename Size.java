class Tree
{
	public static int getSize(Node root)
	{      
	    if(root==null){
	        return 0;
	    }
           int left=getSize(root.left);
           int right=getSize(root.right);
           int size=left+right+1;
           return size;
    }
}
