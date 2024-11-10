
class AVLDemo {

    // A utility function to get the
    // height of the tree 
    static int height(Node N) { 
        if (N == null) 
            return 0; 
        return N.height; 
    } 

    // A utility function to right rotate
    // subtree rooted with y 
    static Node rightRotate(Node y) { 
        Node x = y.left; 
        Node T2 = x.right; 

        // Perform rotation 
        x.right = y; 
        y.left = T2; 

        // Update heights 
        y.height = 1 + Math.max(height(y.left), 
                                height(y.right)); 
        x.height = 1 + Math.max(height(x.left), 
                                height(x.right)); 

        // Return new root 
        return x; 
    } 

    // A utility function to left rotate 
    // subtree rooted with x 
    static Node leftRotate(Node x) { 
        Node y = x.right; 
        Node T2 = y.left; 

        // Perform rotation 
        y.left = x; 
        x.right = T2; 

        // Update heights 
        x.height = 1 + Math.max(height(x.left),
                                height(x.right)); 
        y.height = 1 + Math.max(height(y.left), 
                                height(y.right)); 

        // Return new root 
        return y; 
    } 

    // Get balance factor of node N 
    static int getBalance(Node N) { 
        if (N == null) 
            return 0; 
        return height(N.left) - height(N.right); 
    } 

    // Recursive function to insert a key in
    // the subtree rooted with node 
    static Node insert(Node node, int key) { 
      
        // Perform the normal BST insertion
        if (node == null) 
            return new Node(key); 

        if (key < node.key) 
            node.left = insert(node.left, key); 
        else if (key > node.key) 
            node.right = insert(node.right, key); 
        else // Equal keys are not allowed in BST 
            return node; 

        // Update height of this ancestor node 
        node.height = 1 + Math.max(height(node.left), 
                                   height(node.right)); 

        // Get the balance factor of this ancestor node 
        int balance = getBalance(node); 

        // If this node becomes unbalanced,
        // then there are 4 cases 

        // Left Left Case 
        if (balance > 1 && key < node.left.key) 
            return rightRotate(node); 

        // Right Right Case 
        if (balance < -1 && key > node.right.key) 
            return leftRotate(node); 

        // Left Right Case 
        if (balance > 1 && key > node.left.key) { 
            node.left = leftRotate(node.left); 
            return rightRotate(node); 
        } 

        // Right Left Case 
        if (balance < -1 && key < node.right.key) { 
            node.right = rightRotate(node.right); 
            return leftRotate(node); 
        } 

        // Return the (unchanged) node pointer 
        return node; 
    } 

    // A utility function to print preorder 
    // traversal of the tree 
    static void preOrder(Node root) { 
        if (root != null) { 
            System.out.print(root.key + " "); 
            preOrder(root.left); 
            preOrder(root.right); 
        } 
    } 

    // Driver code 
    public static void main(String[] args) { 
        Node root = null; 
        
        // Constructing tree given in the above figure 
        root = insert(root, 10); 
        root = insert(root, 20); 
        root = insert(root, 30); 
        root = insert(root, 40); 
        root = insert(root, 50); 
        root = insert(root, 25); 
        
        /* The constructed AVL Tree would be 
                  30 
                /   \ 
              20     40 
             /  \      \ 
           10   25     50 
        */
        System.out.println("Preorder traversal : "); 
        preOrder(root); 
    } 
}