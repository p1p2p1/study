
public class TreeMain {
	public static void main(String[] args) {
		BinarySearchTree bsT = new BinarySearchTree();
		
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');
		
		System.out.printf("\nBinary Tree >>> \n");
		bsT.printBST();
		
		System.out.printf("Is There \"A\"? >>>");	
		TreeNode p1 = bsT.searchBST('A');
		if(p1 != null) {
			System.out.printf("Searching Success! Searched Key : %c \n", p1.data);
		}
		else
			System.out.printf("Searching fail!! There is no %c \n",p1.data);
		
		System.out.printf("Is There \"Z\" ? >>>");
		TreeNode p2 = bsT.searchBST('Z');
		
		if(p2 != null)
			System.out.printf("Searching Success! Searched key : %c \n", p2.data);
		else
			System.out.printf("Searching fail!! \n");
	}
}
