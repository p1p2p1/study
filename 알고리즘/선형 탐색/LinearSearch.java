
public class LinearSearch {
	public static void main(String[] args) {
		int a[] = {2,1,4,10,3,4,10,6,5,6,10,4};
		
		LinearSearch search = new LinearSearch();
		
		System.out.println(search.linearSearch(a, 5));
	}
	
	//선형 탐색 알고리즘(배열의 몇 번째 있는지 탐색)
	public int linearSearch(int[] a, int searchNum) {
		int result = 0;
		for(int i = 0;i < a.length; i++) {
			if(a[i] == searchNum) {
				result = i; //배열의 i번째
			}
		}
		
		return result;
	}
}
//중복의 경우 가장 뒤에 있는 위치를 출력