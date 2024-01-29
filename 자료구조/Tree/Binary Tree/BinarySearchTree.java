
public class BinarySearchTree {
	private TreeNode root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void insertBST(char x) {
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		if(root == null) {
			root = newNode;
		}else {
			TreeNode temp = root;
			while(temp != null) {
				if(temp.data > newNode.data) {
					if(temp.left == null) {
						temp.left = newNode;
						return;
					}else {
						temp = temp.left;
					}
				}else {
					if(temp.right == null) {
						temp.right = newNode;
						return;
					}else {
						temp =temp.right;
					}
				}
			}
		}
	}
	
	public TreeNode searchBST(char x) {
		TreeNode p = root;
		TreeNode tempNode = new TreeNode();
		tempNode = p;
		while(p != null) {
			if(x > tempNode.data){
				tempNode = tempNode.right;
			}else if(x < tempNode.data) {
				tempNode = tempNode.left;
			}else {
				return tempNode;
			}
		}
		return null;
	}
	
	public void printBST(){
		inorder(root);
		System.out.println();

}
	
	public void inorder(TreeNode root){
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
			System.out.println();
		}
	}
}
