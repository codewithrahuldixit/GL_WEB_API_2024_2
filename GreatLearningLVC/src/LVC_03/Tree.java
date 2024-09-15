package LVC_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Tree {
	 static Node insert(Node root, int key)
	    {

	        // If the tree is empty, return a new node
	        if (root == null)
	            return new Node(key);

	        // If the key is already present in the tree,
	        // return the node
	        if (root.key == key)
	            return root;

	        // Otherwise, recur down the tree
	        if (key < root.key)
	            root.left = insert(root.left, key);
	        else
	            root.right = insert(root.right, key);

	        // Return the (unchanged) node pointer
	        return root;
	    }

	    // A utility function to do inorder tree traversal
	    static void inorder(Node root)
	    {
	    	
	        if (root != null) {
	            inorder(root.left);
	            System.out.print(root.key + " ");
	            inorder(root.right);
	        }
	    }
	    static void preorder(Node root)
	    {
	    	
	        if (root != null) {
	        	System.out.print(root.key + " ");
	            inorder(root.left);	            
	            inorder(root.right);
	        }
	    }
	    static void postorder(Node root)
	    {
	    	
	        if (root != null) {
	            inorder(root.left);
	            inorder(root.right);
	            System.out.print(root.key + " ");
	            
	        }
	    }
	    // This function deletes a given key x from the 
	    // given BST  and returns the modified root of 
	    // the BST (if it is modified).
	    static Node delNode(Node root, int x) {
	      
	        // Base case
	        if (root == null) {
	            return root;
	        }

	        // If key to be searched is in a subtree
	        if (root.key > x) {
	            root.left = delNode(root.left, x);
	        } else if (root.key < x) {
	            root.right = delNode(root.right, x);
	        } else {
	            // If root matches with the given key
	            // Cases when root has 0 children or
	             if (root.left == null) {
	                return root.right;
	            }

	            // When root has only left child
	            if (root.right == null) {
	                return root.left;
	            }

	            // When both children are present
	            Node succ = getSuccessor(root);
	            root.key = succ.key;
	            root.right = delNode(root.right, succ.key);
	        }
	        return root;
	    }

	// kmn, works when the right child
	    // is not empty, which nnmn the case we need in BST
	    // delete. 
	    static Node getSuccessor(Node curr) {
	        curr = curr.right;
	        while (curr != null && curr.left != null) {
	            curr = curr.left;
	        }
	        return curr;
	    }
	 // Function to perform preorder traversal
	    // of a binary tree iteratively
	    public List<Integer> preorderTraversal(Node root) {
	        // Initialize list to store
	        // the preorder traversal result
	        List<Integer> preorder = new ArrayList<>();

	        // If the root is null, return
	        // an empty traversal result
	        if (root == null) {
	            return preorder;
	        }

	        // Create a stack to store
	        // nodes during traversal
	        Stack<Node> st = new Stack<>();
	        // Push the root node
	        // onto the stack
	        st.push(root);

	        // Perform iterative preorder traversal
	        while (!st.empty()) {
	            // Get the current node
	            // from the top of the stack
	            root = st.pop();

	            // Add the node's value to
	            // the preorder traversal result
	            preorder.add(root.key);

	            // Push the right child
	            // onto the stack if exists
	            if (root.right != null) {
	                st.push(root.right);
	            }

	            // Push the left child onto
	            // the stack if exists
	            if (root.left != null) {
	                st.push(root.left);
	            }
	        }

	        // Return the preorder
	        // traversal result
	        return preorder;
	    }
}
