package LVC_03;

public class TreeDriver {
	  public static void main(String[] args)
	    {
    Node root = null;

    // Creating the following BST
    //      50
    //     /  \
    //    30   70
    //   / \   / \
    //  20 40 60 80

    root = Tree.insert(root, 50);
    root = Tree.insert(root, 30);
    root = Tree.insert(root, 20);
    root = Tree.insert(root, 40);
    root = Tree.insert(root, 70);
    root = Tree.insert(root, 60);
    root = Tree.insert(root, 80);

    // Print inorder traversal of the BST
    System.out.println("\nOutPut After Inorder Traversals");
    Tree.inorder(root);
    //Tree.delNode(root, 70);
    System.out.println("\nOutPut After Deletion in Preorder Traversals");
    Tree.preorder(root);
    /*
    System.out.println("\nOutPut After PreOrder Traversals");
    Tree.preorder(root);
    */
    System.out.println("\nOutPut After Postorder Traversals");
    Tree.postorder(root);
}
}
