package com.javaex.ex01;

public class ShapeApp{

	public static void main(String[] args) {

		// Shape s = new Shape("빨강");
		// Shape은 추상클래스로 객체를 직접 생성&사용이 불가능함
		Circle c1 = new Circle("녹색", 10);
		Ractangle r1 = new Ractangle("빨강", 4, 4);
		Shape sr1 = new Ractangle("빨강", 12, 10);
		
		//sr1을 그리는 메소드 호출
		// 캐스팅 활용
		((Ractangle)sr1).showInfo();
		//sr1의 가로크기 출력
		
		System.out.println("sr1의 가로는 " + ((Ractangle)sr1).getWidth() + " 입니다.");
		
		
		// 경고메세지 제거용 코드
		c1.draw();
		r1.draw();
	}
}

	
	