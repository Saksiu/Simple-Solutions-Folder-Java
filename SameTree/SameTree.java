

public class SameTree {
    public static void main(String[] args) {

        int[] val=new int[]{1,10,3,7,2};
        BinaryTree tree=new BinaryTree(new TreeNode(val[0]));
        BinaryTree tree2=new BinaryTree(new TreeNode(val[0]));
        for(int i=1;i<val.length;i++){
            tree.insert(tree.root, val[i]);
            tree2.insert(tree2.root,val[i]);
        }
        System.out.println(isSameTree(tree.root, tree2.root));
    }

    private static boolean isSameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null)
            return true;
        if(p==null&&q!=null||p!=null&&q==null)
            return false;
        if(p.val==q.val)
            return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
        return false;
    }

    
}


