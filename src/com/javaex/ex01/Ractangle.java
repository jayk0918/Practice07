package com.javaex.ex01;

public class Ractangle extends Shape{
	// Shape으로부터 draw를 상속받았는데, 이에 대한 정의가 없음
	
	// 필드
	private int width;
	private int height;
	
	// 생성자
	// cf) Shape에서 기본 생성자를 선언하지 않았음
	public Ractangle(String fillColor, int width, int height){
		super(fillColor);
		this.width=width;
		this.height=height;
	}
	
	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	// 메소드 일반
	public void showInfo(){
		System.out.println("[사각형]#면색:" +super.fillColor+ " "
				+ " #가로:" + width 
				+" #세로:" + height + " 그렸습니다.");                                                                        
	}
	
	public void draw() {
	}

}


