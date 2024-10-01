class node3{
    int data;
    node3 left;
    node3 right;
    
    node3(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class tree{
    public static void preorder(node3 root){
        if(root==null){
            return;
        }
        System.out.println(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
}
