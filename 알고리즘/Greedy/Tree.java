
public class Tree {
	public int data;
	public Tree left;
	public Tree right;
	
	public Tree(int data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	//왼쪽으로 노드 추가
	public void addLeft(int data) {
		if(this.left == null) {
			Tree leftTree = new Tree(data);
			this.left = leftTree;
		}
		else {
			System.out.println("해당 노드에는 이미 값이 존재합니다.하위 노드로 이동해주세요.");
		}
	}
	
	//오른쪽으로 노드 추가
	public void addRight(int data) {
		if(this.right == null) {
			Tree rightTree = new Tree(data);
			this.right = rightTree;
		}
		else {
			System.out.println("해당 노드에는 이미 값이 존재합니다.하위 노드로 이동해주세요.");
		}
	}
	//왼쪽 노드
	public int getLeft() {
		return this.left.data;
	}
	//오른쪽 노드
	public int getRight() {
		return this.right.data;
	}
}
