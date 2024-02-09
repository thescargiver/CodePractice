/*Complete the function below
Node is as follows:
*/
class Node {
	int data;
	Node left,right;
	
	Node(int key) {
	    data = key;
	    left = right = null;
	}
}

class Solution {
    static boolean isLeaf(Node root) {
        return root != null 
            && root.left == null
            && root.right == null;
    }
    
    static boolean check(Node root) {
        if (root == null || isLeaf(root)) {
            return true;
        }

        int leftValue  = root.left  == null? 0 : root.left.data;
        int rightValue = root.right == null? 0 : root.right.data;
        
        return root.data == leftValue + rightValue
            && check(root.left)
            && check(root.right);
    }
    
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        // add your code here
        return check(root)? 1 : 0;
    }
}
