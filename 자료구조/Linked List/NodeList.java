

public class NodeList {
	Node headNode = new Node();
	//삽입 함수
	public void insertNode(String name, String phone, String email) {
		Node currentNode;
		System.out.println("연락처 등록");
		System.out.println();
		
		if(headNode == null) { //모든 노드를 삭제하고 다시 생성할 때 headNode가 null값이 들어가게 되어 예외 발생
			headNode = new Node(); 
		}
		
		if(headNode.addr == null) { //첫 연락처 등록
			Addr newAddr = new Addr();
			newAddr.setName(name);
			newAddr.setPhone(phone);
			newAddr.setEmail(email);
			
			headNode.addr = newAddr;
		}
		
		else if(headNode.nextNode == null) { //두번째 연락처 등록
			Node newNode = new Node();
			Addr newAddr = new Addr();
			
			newAddr.setName(name);
			newAddr.setEmail(email);
			newAddr.setPhone(phone);
			newNode.addr  = newAddr;
			
			headNode.nextNode = newNode;
		}
		else {
			currentNode = this.headNode;
			
			while(true) {
				if(currentNode.nextNode != null) {
					currentNode = currentNode.nextNode;
				}
				else {
					Node newNode = new Node();
					Addr newAddr = new Addr();
					
					newAddr.setName(name);
					newAddr.setEmail(email);
					newAddr.setPhone(phone);
					newNode.addr = newAddr;
					
					currentNode.nextNode = newNode;
					break;
				}
			}
		}
	}
	
	//삭제 함수
	public void deleteNode(String name) {
		Node currentNode;
		Node beforeNode = new Node();

		currentNode = this.headNode;
		
		if(headNode.addr == null) {
			System.out.println("현재 연락처가 저장되어 있지 않습니다.");
			return;
		}

		//첫번째 노드 이름 체크
		if(headNode.addr.getName().equals(name)) {
			headNode = headNode.nextNode;
			return;
		}
		
		while(true) {
			if(currentNode.nextNode != null) {
				//이름이 같을 때
				if(currentNode.addr.getName().equals(name)) {
					beforeNode.nextNode = currentNode.nextNode;
					return;
				}
				beforeNode = currentNode;
				currentNode = currentNode.nextNode;
			}else {
				//이름이 같을 때(마지막 노드)
				if(currentNode.addr.getName().equals(name)) {
					beforeNode.nextNode = null;
					return;
				}
				//같은 이름이 없을 때
				else {
					System.out.println("해당하는 이름이 없습니다.");
					System.out.println();
				}
				break;
			}
		}
	}
	
	//조회 함수
	public void listNode() {
		Node currentNode;
		currentNode = this.headNode;
		//연락처가 없을 때
		if(headNode == null) {
			System.out.println("현재 연락처가 저장되어 있지 않습니다.");
			return;
		}
		
		while(true) {
			if(currentNode.nextNode != null) {
				System.out.println("이름 : " +currentNode.addr.getName());
				System.out.println("핸드폰 번호 : " +currentNode.addr.getPhone());
				System.out.println("이메일 : "+ currentNode.addr.getEmail());
				System.out.println();
				currentNode = currentNode.nextNode;
			}else {
				System.out.println("이름 : " +currentNode.addr.getName());
				System.out.println("핸드폰 번호 : " +currentNode.addr.getPhone());
				System.out.println("이메일 : "+ currentNode.addr.getEmail());
				System.out.println();
				break;
			}
		}
	}

}

