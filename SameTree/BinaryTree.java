public class BinaryTree{
    
    TreeNode root;

    BinaryTree(TreeNode rootNode){
        this.root=rootNode;
    }
    
    public void insert(TreeNode node,int value){
        if(value<node.val)
            if(node.left!=null)
                insert(node.left, value);
            else
                node.left=new TreeNode(value);
        else if(value>node.val)
            if(node.right!=null)
                insert(node.right, value);
            else
                node.right=new TreeNode(value);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
