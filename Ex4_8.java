class Ex4_8 {
	public static void main(String args[]) { // i=1,2,4,8
		int i; //scope(범위) - 선언위치부터 선언된 블럭의 끝까지
		
		//조건식을 생략하면, true로 간주되어서 무한반복문이 됨
		for (i = 1; i <= 10; i++) { // 괄호{}안의 문장을 3번 반복
			System.out.println("i="+i);
		}
//		System.out.println(i);
	}
}