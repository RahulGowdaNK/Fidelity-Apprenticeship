public class MainTree {
    public static void main(String[] args) {
        node3 root =new node3(1);
        root.left = new node3(2);

        root.left.right = new node3(5);
        root.right = new node3(3);
        root.right.right = new node3(4);
        root.right.right.right = new node3(6);

        tree Tree =new tree();
        System.out.println("preorder traversal of the tree:");
        tree.preorder(root);

    }
}
