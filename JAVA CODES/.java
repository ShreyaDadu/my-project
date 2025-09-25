import java.util.ArrayList;

public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
	 *     T data;
	 *     ArrayList<TreeNode<T>> children;
	 *
	 *     TreeNode(T data){
	 *         this.data = data;
	 *         children = new ArrayList<TreeNode<T>>();
	 *     }
	 * }
	 */

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if (root == null) {
			return null;
		}

		// If the root itself is a leaf node, return null (remove it)
		if (root.children.size() == 0) {
			return null;
		}

		// Remove leaf children recursively
		for (int i = root.children.size() - 1; i >= 0; i--) {
			TreeNode<Integer> child = root.children.get(i);
			TreeNode<Integer> updatedChild = removeLeafNodes(child);
			if (updatedChild == null) {
				// Child is leaf node and removed, so remove from children list
				root.children.remove(i);
			} else {
				// Update the child reference
				root.children.set(i, updatedChild);
			}
		}

		return root;
	}
}
