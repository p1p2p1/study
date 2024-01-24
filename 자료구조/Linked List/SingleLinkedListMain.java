import java.util.Scanner;

public class SingleLinkedListMain {
	public static void main(String[] args) {
		NodeList list = new NodeList();
		while(true) {
			System.out.println("1번 : 삽입, 2번 : 삭제, 3번 : 전체 조회, 4번 : 종료");
			System.out.print("번호를 입력하시오 : ");
			Scanner in = new Scanner(System.in);
			int choose = in.nextInt();
			
			//삽입
			if(choose == 1) {
				System.out.println("연락처 정보를 입력하시오");
				System.out.print("이름 : ");
				String name = in.next();
				
				System.out.print("번호 : ");
				String phone = in.next();

				System.out.print("이메일 : ");
				String email = in.next();

				list.insertNode(name, phone, email);
			}
			//삭제
			else if(choose == 2) {
				System.out.println("삭제할 연락처 이름을 입력하시오");
				System.out.print("이름 : ");
				String name = in.next();
				list.deleteNode(name);
			}
			//전체 조회
			else if(choose == 3) {
				list.listNode();
			}
			else {
				in.close();
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
	}

}
