
public class Greedy {
	public static void main(String[] args) {
		//Binary Tree Create
		Tree treeNode = new Tree(8);
		Greedy greed = new Greedy();
		
		treeNode.addLeft(3);
		treeNode.left.addLeft(1);
		treeNode.left.addRight(6);
		treeNode.left.right.addLeft(4);
		treeNode.left.right.addRight(20);
		
		treeNode.addRight(10);
		treeNode.right.addLeft(8);
		treeNode.right.addRight(1);
		
		//Greedy(가장 큰 값 찾기)
		int result = greed.greedSearch(treeNode);
		System.out.println("결과 : " + result);
		
		
	}
	
	public int greedSearch(Tree treeNode) {
		int depth = 0;
		while(true) {
			if(treeNode.right == null && treeNode.left == null) {
				System.out.println("깊이 : " + depth);
				return treeNode.data;
			}
			
			if(treeNode.left.data > treeNode.right.data) {
				treeNode = treeNode.left;
				depth++;
			}
			else if(treeNode.left.data < treeNode.right.data) {
				treeNode = treeNode.right;
				depth++;
			}
			else if(treeNode.left.data == treeNode.right.data){
				treeNode = treeNode.left;
				depth++;
			}

		}
	}
	
}
