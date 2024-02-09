package GeeksForGeeks.CheckIfAllLeavesAreAtSameLevel;

//User function Template for Java
/*
A Binary Tree node
*/
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Solution {
    // Integer levelOfLastLeaf = null;
    
    boolean check(Node root) {
	    // Your code here
	    return check(root, 0, new int[]{-1});
    }
    
    boolean check(Node root, int level, int[] levelOfLastLeaf) {
        if (root == null) {
            return true;
        }
        if (isLeaf(root)) {
            // if this leaf level == the prev
            if (levelOfLastLeaf[0] == -1) {
                levelOfLastLeaf[0] = level;
            }
            return level == levelOfLastLeaf[0];
        }
        
        return check(root.left, level + 1, levelOfLastLeaf)
            && check(root.right, level + 1, levelOfLastLeaf);
    }
    
    boolean isLeaf(Node root) {
        return root != null
            && root.left == null
            && root.right == null;
    }
}
